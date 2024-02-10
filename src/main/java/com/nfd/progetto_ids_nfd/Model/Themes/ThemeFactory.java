package com.nfd.progetto_ids_nfd.Model.Themes;

import java.util.Date;
import java.util.List;

import com.nfd.progetto_ids_nfd.Model.Users.CuratorUser;
import com.nfd.progetto_ids_nfd.Model.Utils.Coordinates;

public class ThemeFactory {

    public static Theme createTheme(Theme theme){
        // TODO Switch case to createSpecificTheme()
        return null;
    }

    // Method to create an instance of Activity theme
    public static Theme createEventTheme(CuratorUser curator, String name, Coordinates coordinates, String description, List<String> contactsList, Date startDate, Date endDate) {
        return new Event(curator, name, coordinates, description, contactsList, startDate, endDate);
    }

    // Method to create an instance of Event theme
    public static Theme createActivityTheme(CuratorUser curator, Date additionDate, String name, Coordinates coordinates, String description, List<String> contactsList,
    String VATNumber, String sector) {
        return new Activity(curator, null, name, coordinates, description, contactsList, VATNumber, sector);
    }

    // Method to create an instance of PointOfInterest theme
    public static Theme createPointOfInterestTheme() {
        return new PointOfInterest();
    }
}
