package com.example.cms.model;

import lombok.Data;

/**
 * @author ef-LORENZ
 */
@Data
public class Slider {
    private Long id;
    private String title;
    private String URL;
    private int sort;
    private String image;
    private String googleAuth;
}
