package com.example.tickbox.dto;


import com.example.tickbox.model.Priority;
import com.example.tickbox.model.Status;
import lombok.Data;

import java.sql.Timestamp;
import java.util.List;

@Data
public class TodoDTO {

    private Long id;

    private String description;

    private Status status;

    private Priority priority;

    private Timestamp createdAt;

    private Timestamp updatedAt;

    private ProjectDTO project;

    private List<TagDTO> tags;
}
