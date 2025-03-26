package com.example.tickbox.dto;


import lombok.Data;

import java.sql.Timestamp;
import java.util.List;

@Data
public class ProjectDTO {

    private Long id;

    private String title;

    private UserInfoDTO user;

    private Timestamp createdAt;

    private Timestamp updatedAt;

    private List<TodoDTO> todos;
}
