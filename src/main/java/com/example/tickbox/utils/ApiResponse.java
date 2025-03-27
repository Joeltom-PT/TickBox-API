package com.example.tickbox.utils;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ApiResponse<T> {
    private String status;
    private int statusCode;
    private String message;
    private T data;
    private Object metadata;
}
