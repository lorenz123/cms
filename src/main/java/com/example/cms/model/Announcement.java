package com.example.cms.model;

import lombok.Data;

/**
 * @author ef-LORENZ
 */
@Data
public class Announcement {
    private Long id;
    private String title;
    private String content;
    private String slider;
    private String googleAuth;
}
