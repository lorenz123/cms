package com.example.cms.model;

import lombok.Data;

/**
 * @author ef-LORENZ
 */
@Data
public class SocialMedia {
    private Long id;
    private String name;
    private String logo;
    private String pageJumpAddress;
    private int sort;
    private String googleAuth;
}
