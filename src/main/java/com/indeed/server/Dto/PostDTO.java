package com.indeed.server.Dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

import java.util.List;

@Data
public class PostDTO {
    // It checks or validate the  frontend object
    @NotEmpty
    private String profile;
    @NotEmpty
    private String type;
    @NotEmpty
    private String description;
    @NotEmpty
    private String experience;

    private List<String> technology;
    @NotEmpty
    private String salary;
}
