package com.nfd.progetto_ids_nfd.Model.Utils;

/**
 * This class represents an image with a name and a file path.
 */
public class Image {

    private String name; // The name of the image
    private String path; // The file path of the image

    /**
     * Constructs an Image object with the specified name and file path.
     * @param name The name of the image
     * @param path The file path of the image
     */
    public Image(String name, String path) {
        this.name = name;
        this.path = path;
    }

    // Getters and Setters
    /**
     * Gets the name of the image.
     * @return The name of the image
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the image.
     * @param name The name to set for the image
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the file path of the image.
     * @return The file path of the image
     */
    public String getPath() {
        return path;
    }

    /**
     * Sets the file path of the image.
     * @param path The file path to set for the image
     */
    public void setPath(String path) {
        this.path = path;
    }
    
}
