package com.nfd.progetto_ids_nfd.Model.Themes;

import java.util.List;

import com.nfd.progetto_ids_nfd.Model.Users.CuratorUser;
import com.nfd.progetto_ids_nfd.Model.Utils.Coordinates;
import com.nfd.progetto_ids_nfd.Model.Utils.Enumerables.ThemeCategory;
import com.nfd.progetto_ids_nfd.Model.Utils.Enumerables.ThemeParameter;
import java.util.Map;
import java.util.HashMap;
public class ThemeFactory {

    public static Theme createTheme(Theme theme){
        // TODO Switch case to createSpecificTheme()
        return null;
    }

    // Method to create an instance of Activity theme
    public static Theme createEventTheme(CuratorUser curator, String additionDate, String name, Coordinates coordinates, String description, List<String> contactsList, String startDate, String endDate) {
        Map<ThemeParameter, String> parameters = new HashMap<ThemeParameter,String>();
        parameters.put(ThemeParameter.StartDate, startDate);
        parameters.put(ThemeParameter.StartDate, endDate);
        return new Theme(curator, additionDate, name, coordinates, description, contactsList, parameters, ThemeCategory.Event);
    }

    // Method to create an instance of Event theme
    public static Theme createActivityTheme(CuratorUser curator, String additionDate, String name, Coordinates coordinates, String description, List<String> contactsList, String VATNumber, String sector) {
        Map<ThemeParameter, String> parameters = new HashMap<ThemeParameter,String>();
        parameters.put(ThemeParameter.VAT_Number, VATNumber);
        parameters.put(ThemeParameter.Sector, sector);
        return new Theme(curator, additionDate, name, coordinates, description, contactsList, parameters, ThemeCategory.Activity);
    }

    // Method to create an instance of PointOfInterest theme
    public static Theme createPointOfInterestTheme(CuratorUser curator, String additionDate, String name, Coordinates coordinates, String description, List<String> contactsList) {
        Map<ThemeParameter, String> parameters = new HashMap<ThemeParameter,String>();
        return new Theme(curator, additionDate, name, coordinates, description, contactsList, parameters, ThemeCategory.PointOfInterest);
    }
}
