package com.example.cms.model;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author ef-LORENZ
 */
@Data
public class Post {
    private Long id;
    private String title;
    private String content;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
