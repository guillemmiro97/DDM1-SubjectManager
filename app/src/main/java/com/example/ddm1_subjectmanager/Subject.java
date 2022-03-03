package com.example.ddm1_subjectmanager;

import java.io.Serializable;

public class Subject implements Serializable {
    private String title;
    private int logoImage;
    private String description;

    public Subject(String title, int logoImage, String description) {
        this.title = title;
        this.logoImage = logoImage;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public int getLogoImage() {
        return logoImage;
    }

    public String getDescription() {
        return description;
    }
}
