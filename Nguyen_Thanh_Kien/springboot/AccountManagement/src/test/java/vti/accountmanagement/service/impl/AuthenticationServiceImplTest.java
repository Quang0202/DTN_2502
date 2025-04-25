package vti.accountmanagement.service.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import vti.accountmanagement.config.JwtService;
import vti.accountmanagement.model.CustomUserDetails;
import vti.accountmanagement.request.authenticate.AuthenticationRequest;
import vti.accountmanagement.response.authenticate.AuthenticationResponse;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class AuthenticationServiceImplTest {

    @Mock
    private AuthenticationManager authenticationManager;

    @Mock
    private JwtService jwtService;

    @InjectMocks
    private AuthenticationServiceImpl authenticationService;

    @Test
    void authenticate_ShouldReturnAuthenticationResponse() {
        // Arrange
        String username = "testuser";
        String password = "testpass";
        String jwtToken = "mock-jwt-token";
        Long expiration = 3600L;

        AuthenticationRequest request = new AuthenticationRequest(username, password);

        CustomUserDetails userDetails = CustomUserDetails.builder()
                .username(username)
                .password(password)
                .build();

        Authentication authentication = mock(Authentication.class);
        when(authentication.getPrincipal()).thenReturn(userDetails);

        when(authenticationManager.authenticate(any(UsernamePasswordAuthenticationToken.class)))
                .thenReturn(authentication);

        when(jwtService.generateToken(userDetails)).thenReturn(jwtToken);
        when(jwtService.getExpirationTime(jwtToken)).thenReturn(expiration);

        // Act
        AuthenticationResponse response = authenticationService.authenticate(request);

        // Assert
        assertEquals(jwtToken, response.getAccessToken());
        assertEquals(expiration, response.getExpiresIn());

        verify(authenticationManager, times(1)).authenticate(any(UsernamePasswordAuthenticationToken.class));
        verify(jwtService, times(1)).generateToken(userDetails);
        verify(jwtService, times(1)).getExpirationTime(jwtToken);
    }

    @Test
    void authenticate_ShouldThrowException_WhenAuthenticationFails() {
        // Arrange
        AuthenticationRequest request = new AuthenticationRequest("wrongUser", "wrongPass");

        when(authenticationManager.authenticate(any(UsernamePasswordAuthenticationToken.class)))
                .thenThrow(new BadCredentialsException("Invalid credentials"));

        // Act & Assert
        Assertions.assertThrows(BadCredentialsException.class, () -> {
            authenticationService.authenticate(request);
        });

        verify(authenticationManager, times(1)).authenticate(any(UsernamePasswordAuthenticationToken.class));
        verifyNoInteractions(jwtService);
    }
}
