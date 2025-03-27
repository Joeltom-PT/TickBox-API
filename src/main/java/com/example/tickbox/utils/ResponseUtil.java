package com.example.tickbox.utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseUtil {

    public static <T> ResponseEntity<ApiResponse<T>> success(HttpStatus status, String message, T data, Object metadata) {
        return ResponseEntity.status(status)
                .body(new ApiResponse<>("success", status.value(), message, data, metadata));
    }

    public static <T> ResponseEntity<ApiResponse<T>> error(HttpStatus status, String message, T data) {
        return ResponseEntity.status(status)
                .body(new ApiResponse<>("error", status.value(), message, data, null));
    }
}
