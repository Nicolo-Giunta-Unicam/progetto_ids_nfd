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
    
    /**
     * Constructor for Itinerary.
     *
     * @param author The author of the itinerary.
     * @param themeList The list of themes for the itinerary.
     */
    public Itinerary(User author, List<Theme> themeList) {
        this.author = author;
        this.themeList = new ArrayList<>();
    }

    /**
     * Get the author of the itinerary.
     *
     * @return The author of the itinerary.
     */
    public User getAuthor() {
        return author;
    }

    /**
     * Set or update the author of the itinerary.
     *
     * @param author The author of the itinerary.
     */
    public void setAuthor(User author) {
        this.author = author;
    }

    /**
     * Add a theme to the itinerary.
     *
     * @param theme The theme to be added to the itinerary.
     */
    public void addItinerary(Theme theme) {
        themeList.add(theme);
    }

    /**
     * Remove a theme from the itinerary.
     *
     * @param theme The theme to be removed from the itinerary.
     */
    public void removeTheme(Theme theme) {
        themeList.remove(theme);
    }

    /**
     * Get all themes in the itinerary.
     *
     * @return The list of themes in the itinerary.
     */
    public List<Theme> getItinerary() {
        return themeList;
    }
}
