package com.example.tickbox.service;

public interface JwtService {

    String generateToken(Long id, String email, String role);

    String generateRefreshToken(Long id, String email, String role);

    String extractEmail(String token);

    Long extractId(String token);

    String extractRole(String token);

    boolean isTokenValid(String token);
}