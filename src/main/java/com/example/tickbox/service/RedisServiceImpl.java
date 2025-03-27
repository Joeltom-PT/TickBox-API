package com.example.tickbox.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.time.Duration;

import static com.example.tickbox.utils.AppConstants.*;

@Service
@RequiredArgsConstructor
public class RedisServiceImpl implements RedisService {

    private final StringRedisTemplate redisTemplate;

    public void saveRefreshToken(Long userId, String refreshToken) {
        redisTemplate.opsForValue().set(REDIS_REFRESH_TOKEN_PREFIX + userId, refreshToken);
        redisTemplate.expire(REDIS_REFRESH_TOKEN_PREFIX + userId, Duration.ofDays(REFRESH_TOKEN_EXPIRATION));
    }

    public String getRefreshToken(Long userId) {
        return redisTemplate.opsForValue().get(REDIS_REFRESH_TOKEN_PREFIX + userId);
    }

    public void deleteRefreshToken(Long userId) {
        redisTemplate.delete(REDIS_REFRESH_TOKEN_PREFIX + userId);
    }
}
