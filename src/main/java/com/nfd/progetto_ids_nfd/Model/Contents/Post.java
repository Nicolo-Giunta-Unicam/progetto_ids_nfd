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

    // Defines if the post should be visible on the platform
    private boolean visible;

    /**
     * Constructor for Post.
     *
     * @param author The author of the post.
     * @param relatedTheme The theme related to the post.
     * @param text The text content of the post (can be empty).
     * @param imageList The list of images associated with the post (can be empty, up to 4).
     */
    public Post(User author, Theme relatedTheme, String text, List<Image> imageList) {
        this.author = author;
        this.relatedTheme = relatedTheme;
        this.text = text;
        this.imageList = new ArrayList<>();
        visible = false;
    }

    /**
     * Get the author of the post.
     *
     * @return The author of the post.
     */
    public User getAuthor() {
        return author;
    }

    /**
     * Set or update the author of the post.
     *
     * @param author The author of the post.
     */
    public void setAuthor(User author) {
        this.author = author;
    }

    /**
     * Get the theme related to the post.
     *
     * @return The theme related to the post.
     */
    public Theme getRelatedTheme() {
        return relatedTheme;
    }

    /**
     * Set or update the theme related to the post.
     *
     * @param relatedTheme The theme related to the post.
     */
    public void setRelatedTheme(Theme relatedTheme) {
        this.relatedTheme = relatedTheme;
    }

    /**
     * Get the text content of the post.
     *
     * @return The text content of the post.
     */
    public String getText() {
        return text;
    }

    /**
     * Set or update the text content of the post.
     *
     * @param text The text content of the post.
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Add an image to the list of images associated with the post.
     *
     * @param image The image to be added.
     */
    public void addImage(Image image) {
        imageList.add(image);
    }

    /**
     * Remove an image from the list of images associated with the post.
     *
     * @param image The image to be removed.
     */
    public void removeImage(Image image) {
        imageList.remove(image);
    }

    /**
     * Get all images associated with the post.
     *
     * @return The list of images associated with the post.
     */
    public List<Image> getImages() {
        return imageList;
    }

    /**
     * Set the visibility of the post on the platform.
     *
     * @param visible True if the post should be visible, false otherwise.
     */
    public void setVisibility(boolean visible) {
        this.visible = visible;
    }

    /**
     * Get the visibility status of the post on the platform.
     *
     * @return True if the post is visible, false otherwise.
     */
    public boolean getVisibility() {
        return this.visible;
    }
}
