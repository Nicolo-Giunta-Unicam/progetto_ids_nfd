package com.nfd.progetto_ids_nfd.Model.Contents;
import java.util.ArrayList;
import java.util.List;

import com.nfd.progetto_ids_nfd.Model.Themes.Theme;
import com.nfd.progetto_ids_nfd.Model.Users.User;
import com.nfd.progetto_ids_nfd.Model.Utils.Image;

/*
 * The class Post represents a post in the system. It is described by its author, theme, text (which can be empty),
 * and a list of images (which can be empty, up to 4). The text and imageList parameters can't be empty at the same time.
 */
public class Post {
    // The author of the post
    private User author;

    // The theme related to the post
    private Theme relatedTheme;

    // The text content of the post (can be empty)
    private String text;

    // The list of images associated with the post (can be empty, up to 4 or more images)
    private List<Image> imageList;

    // Constructor to initialize a Post instance with the given parameters
    public Post(User author, Theme relatedTheme, String text, Image imageList) {
        this.author = author;
        this.relatedTheme = relatedTheme;
        this.text = text;
        this.imageList = new ArrayList<>();
    }

    // Getter method to retrieve the author of the post
    public User getAuthor() {
        return author;
    }

    // Setter method to set or update the author of the post
    public void setAuthor(User author) {
        this.author = author;
    }

    // Getter method to retrieve the theme related to the post
    public Theme getRelatedTheme() {
        return relatedTheme;
    }

    // Setter method to set or update the theme related to the post
    public void setRelatedTheme(Theme relatedTheme) {
        this.relatedTheme = relatedTheme;
    }

    // Getter method to retrieve the text content of the post
    public String getText() {
        return text;
    }

    // Setter method to set or update the text content of the post
    public void setText(String text) {
        this.text = text;
    }

    // Add an image to the list
    public void addImage(Image image) {
        imageList.add(image);
    }

    // Remove an image from the list
    public void removeImage(Image image) {
        imageList.remove(image);
    }

    // Get all images in the list
    public List<Image> getImages() {
        return imageList;
    }

}
