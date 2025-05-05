package vti.accountmanagement.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vti.accountmanagement.request.authenticate.AuthenticationRequest;
import vti.accountmanagement.response.authenticate.AuthenticationResponse;
import vti.accountmanagement.service.AuthenticationService;

@Slf4j
@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
@Tag(name = "Authentication", description = "API for user login and token generation.")
public class AuthenticationController {

    private final AuthenticationService authenticationService;

    @PostMapping("")
    @Operation(
            summary = "Authenticate user",
            description = "Authenticate a user with username and password, and return a JWT token upon success."
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Authentication successful"),
            @ApiResponse(responseCode = "400", description = "Invalid input"),
            @ApiResponse(responseCode = "401", description = "Authentication failed")
    })
    public ResponseEntity<AuthenticationResponse> authenticate(
            @Parameter(description = "User login credentials")
            @RequestBody @Valid AuthenticationRequest request
    ) {
        log.info("Login request received: {}", request.getUsername());
        return ResponseEntity.ok(authenticationService.authenticate(request));
    }
}
