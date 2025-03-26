package com.example.tickbox.controller;

import com.example.tickbox.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;



}
