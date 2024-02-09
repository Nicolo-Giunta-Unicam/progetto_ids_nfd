package com.nfd.progetto_ids_nfd.Model.Themes;

public class ThemeFactory {

    public static Theme createTheme(Theme theme){
        // TODO Switch case to createSpecificTheme()
        return null;
    }

    // Method to create an instance of Activity theme
    public static Theme createActivityTheme() {
        return new Event();
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
