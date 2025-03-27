package com.example.tickbox.utils;

public class AppConstants {

    // JWT Token Expiration Times
    public static final long ACCESS_TOKEN_EXPIRATION = 15 * 60 * 1000;
    public static final long REFRESH_TOKEN_EXPIRATION = 7 * 24 * 60 * 60;

    // Security
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_STRING = "Authorization";

    // Redis Keys
    public static final String REDIS_REFRESH_TOKEN_PREFIX = "refresh_token:";

    // Messages
    public static final String USER_NOT_FOUND = "User not found";
    public static final String INVALID_CREDENTIALS = "Invalid credentials";
    public static final String TOKEN_EXPIRED = "Token has expired";
}
