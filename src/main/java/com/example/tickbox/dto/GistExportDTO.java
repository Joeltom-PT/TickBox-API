package com.example.tickbox.dto;

import lombok.Data;
import java.sql.Timestamp;

@Data
public class GistExportDTO {

    private Long id;

    private ProjectDTO project;

    private String gistUrl;

    private Timestamp exportedAt;
}
