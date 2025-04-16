package vti.accountmanagement.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import vti.accountmanagement.config.JwtService;
import vti.accountmanagement.exception.CustomException;
import vti.accountmanagement.model.Account;
import vti.accountmanagement.model.Department;
import vti.accountmanagement.model.Position;
import vti.accountmanagement.repository.AccountRepository;
import vti.accountmanagement.repository.DepartmentRepository;
import vti.accountmanagement.repository.PositionRepository;
import vti.accountmanagement.request.account.AccountCreateRequest;
import vti.accountmanagement.request.authenticate.AuthenticationRequest;
import vti.accountmanagement.response.dto.authenticate.AuthenticationResponse;
import vti.accountmanagement.service.AuthenticationService;
import vti.accountmanagement.utils.ObjectMapperUtils;

import java.util.Locale;

@Service
@RequiredArgsConstructor
public class AuthenticationServiceImpl implements AuthenticationService {

    private final AccountRepository accountRepository;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;
    private final JwtService jwtService;


    public AuthenticationResponse authenticate(AuthenticationRequest request) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getUsername(),
                        request.getPassword()
                )
        );
        var user = accountRepository.findByUsername(request.getUsername())
                .orElseThrow();
        var jwtToken = jwtService.generateToken(user);
        return new AuthenticationResponse(jwtToken);
    }
}
