package com.nfd.progetto_ids_nfd.Model.Themes;

public class ThemeFactory {

    // Method to create an instance of Activity theme
    public static Theme createActivityTheme() {
        return new Activity();
    }

    // Method to create an instance of Event theme
    public static Theme createEventTheme() {
        return new Event();
    }

    // Method to create an instance of PointOfInterest theme
    public static Theme createPointOfInterestTheme() {
        return new PointOfInterest();
    }
}
