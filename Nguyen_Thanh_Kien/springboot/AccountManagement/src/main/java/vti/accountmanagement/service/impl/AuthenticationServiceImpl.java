package vti.accountmanagement.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import vti.accountmanagement.config.JwtService;
import vti.accountmanagement.model.CustomUserDetails;
import vti.accountmanagement.repository.AccountRepository;
import vti.accountmanagement.request.authenticate.AuthenticationRequest;
import vti.accountmanagement.response.dto.authenticate.AuthenticationResponse;
import vti.accountmanagement.service.AuthenticationService;

@Service
@RequiredArgsConstructor
public class AuthenticationServiceImpl implements AuthenticationService {

    private final AccountRepository accountRepository;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;
    private final JwtService jwtService;


    public AuthenticationResponse authenticate(AuthenticationRequest request) {
        Authentication authentication =  authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getUsername(),
                        request.getPassword()
                )
        );
        CustomUserDetails userDetails = (CustomUserDetails) authentication.getPrincipal();
        String jwtToken = jwtService.generateToken(userDetails);
        Long expiresIn = jwtService.getExpirationTime(jwtToken);
        return new AuthenticationResponse(jwtToken, expiresIn);
    }
}
