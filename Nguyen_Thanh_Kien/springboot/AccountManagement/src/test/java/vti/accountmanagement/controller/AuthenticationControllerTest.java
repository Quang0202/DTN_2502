//package vti.accountmanagement.controller;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.MediaType;
//import org.springframework.security.authentication.BadCredentialsException;
//import org.springframework.test.web.servlet.MockMvc;
//import vti.accountmanagement.request.authenticate.AuthenticationRequest;
//import vti.accountmanagement.response.authenticate.AuthenticationResponse;
//import vti.accountmanagement.service.AuthenticationService;
//
//import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.Mockito.when;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
//
//@WebMvcTest(AuthenticationController.class)
//class AuthenticationControllerTest {
//
//    @Autowired
//    private MockMvc mockMvc;
//    @SuppressWarnings("removal")
//    @MockBean
//    private AuthenticationService authenticationService;
//
//    @Autowired
//    private ObjectMapper objectMapper;
//
//    @Test
//    void testAuthenticate_Success() throws Exception {
//        AuthenticationRequest request = new AuthenticationRequest("testuser", "123456");
//        AuthenticationResponse response = new AuthenticationResponse("mocked-jwt-token", 3600L);
//
//        when(authenticationService.authenticate(any(AuthenticationRequest.class))).thenReturn(response);
//
//        mockMvc.perform(post("/api/auth")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content(objectMapper.writeValueAsString(request)))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.token").value("mocked-jwt-token"))
//                .andExpect(jsonPath("$.expiresIn").value(3600));
//    }
//
//    @Test
//    void testAuthenticate_InvalidCredentials() throws Exception {
//        when(authenticationService.authenticate(any(AuthenticationRequest.class)))
//                .thenThrow(new BadCredentialsException("Invalid username or password"));
//
//        AuthenticationRequest request = new AuthenticationRequest("wronguser", "wrongpass");
//
//        mockMvc.perform(post("/api/auth")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content(objectMapper.writeValueAsString(request)))
//                .andExpect(status().isUnauthorized());
//    }
//
//    @Test
//    void testAuthenticate_MissingUsername() throws Exception {
//        AuthenticationRequest request = new AuthenticationRequest("", "123456");
//
//        mockMvc.perform(post("/api/auth")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content(objectMapper.writeValueAsString(request)))
//                .andExpect(status().isBadRequest());
//    }
//}
