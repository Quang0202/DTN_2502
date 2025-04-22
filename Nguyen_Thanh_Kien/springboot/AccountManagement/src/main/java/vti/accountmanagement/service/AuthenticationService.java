package vti.accountmanagement.service;

import org.springframework.stereotype.Service;
import vti.accountmanagement.request.authenticate.AuthenticationRequest;
import vti.accountmanagement.response.authenticate.AuthenticationResponse;

@Service
public interface AuthenticationService {
    AuthenticationResponse authenticate(AuthenticationRequest authenticate);
}
