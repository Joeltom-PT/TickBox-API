package com.example.tickbox.service;

public interface RedisService {
    public void saveRefreshToken(Long userId, String refreshToken);
    public String getRefreshToken(Long userId);
    public void deleteRefreshToken(Long userId);
}
