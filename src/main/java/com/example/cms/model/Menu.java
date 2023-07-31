package com.example.cms.model;

import lombok.Data;

/**
 * @author ef-LORENZ
 */
@Data
public class Menu {
    private Long id;
    private String name;
    private String fontColor;
    private String pageJumpAddress;
    private String pageJumpingMode;
    private String logo;
    private int sort;
    private String googleAuth;
}
