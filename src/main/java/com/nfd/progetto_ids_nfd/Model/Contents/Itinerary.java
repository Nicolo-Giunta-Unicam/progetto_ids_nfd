package com.nfd.progetto_ids_nfd.Model.Contents;

import java.util.ArrayList;
import java.util.List;

import com.nfd.progetto_ids_nfd.Model.Themes.Theme;
import com.nfd.progetto_ids_nfd.Model.Users.User;

/*
 * The class Itinerary is described by its author and a list of themes
 * in a specific order, each theme is connected to the next one creating
 * a path that users will be able to see in the view. 
 */
public class Itinerary {
    // The author of the itinerary
    private User author;

    // The list of themes (can be empty, up to 4 or more themes)
    private List<Theme> themeList; 
    
    // Constructor to initialize an Itinerary instance with the given parameters
    public Itinerary(User author, Theme themeList)
    {
        this.author=author;
        this.themeList = new ArrayList<>();
    }

    // Getter method to retrieve the author of the itinerary
    public User getAuthor() {
        return author;
    }

    // Setter method to set or update the author of the itinerary
    public void setAuthor(User author) {
        this.author = author;
    }

     // Add an itinerary to the list
    public void addItinerary(Theme theme) {
        themeList.add(theme);
    }

    // Remove an image from the list
    public void removeImage(Theme theme) {
        themeList.remove(theme);
    }

    // Get all images in the list
    public List<Theme> getItinerary() {
        return themeList;
    }
}
