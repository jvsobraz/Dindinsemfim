package br.com.fiap.dindin.models;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;

public record Credencial(String email, String senha) {

    public AuthenticationService toAuthentication() {
        return new UsernamePasswordAuthenticationToken(email, senha);
    }
    
}