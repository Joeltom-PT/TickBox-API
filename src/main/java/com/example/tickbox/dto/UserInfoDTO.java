package com.example.tickbox.dto;


import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserInfoDTO {

    private Long id;

    private String username;

    private String email;

    private String password;

    private String githubToken;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

}
