package com.brito.mypass.token;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.brito.mypass.user.Userrepository;

@Service
public class AuthService {

    private final Userrepository userRepository;
    private final Tokenservice tokenService;
    private final PasswordEncoder passwordEncoder;

    public AuthService(Userrepository userRepository, Tokenservice tokenService, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.tokenService = tokenService;
        this.passwordEncoder = passwordEncoder;
    }

    public Token login (Credentials credentials) {
        var user = userRepository.findByUsername(credentials.username())
                .orElseThrow( () -> new RuntimeException("Access denied") );

        if ( ! passwordEncoder.matches(credentials.password(), user.getPassword()) )
            throw new RuntimeException("Access denied");

        return tokenService.createToken(credentials.username());
    }

}