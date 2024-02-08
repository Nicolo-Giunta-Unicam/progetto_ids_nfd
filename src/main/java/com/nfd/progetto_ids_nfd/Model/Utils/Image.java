package com.nfd.progetto_ids_nfd.Model.Utils;

public class Image {

    private String name;
    private String path;

    public Image(String name, String path) {
        this.name = name;
        this.path = path;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
    
}
