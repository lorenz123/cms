package com.example.cms.model;

import lombok.Data;

/**
 * @author ef-LORENZ
 */
@Data
public class FooterMenu {
    private Long id;
    private String name;
    private String pageJumpAddress;
    private String pageJumpingMode;
    private String parentMenu;
    private int sort;
    private String googleAuth;
}
