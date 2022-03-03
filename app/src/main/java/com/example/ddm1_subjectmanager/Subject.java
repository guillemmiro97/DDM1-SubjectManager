package com.example.ddm1_subjectmanager;

public class Subject {
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

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLogoImage() {
        return logoImage;
    }

    public void setLogoImage(int logoImage) {
        this.logoImage = logoImage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
