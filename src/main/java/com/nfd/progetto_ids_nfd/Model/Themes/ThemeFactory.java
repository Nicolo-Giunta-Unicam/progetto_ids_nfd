package com.nfd.progetto_ids_nfd.Model.Themes;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

import com.nfd.progetto_ids_nfd.Model.Users.AuthenticatedUser;
import com.nfd.progetto_ids_nfd.Model.Users.CuratorUser;
import com.nfd.progetto_ids_nfd.Model.Utils.Coordinates;
import com.nfd.progetto_ids_nfd.Model.Utils.Enumerables.ThemeCategory;
import com.nfd.progetto_ids_nfd.Model.Utils.Enumerables.ThemeParameter;

/**
 * A factory class for creating different types of themes.
 */
public class ThemeFactory {

    /**
     * Creates a specific theme instance.
     * @param theme The theme object specifying the type of theme to be created
     * @return A specific theme instance
     */
    public static Theme createTheme(Theme theme){
        // TODO Switch case to createSpecificTheme()
        return null;
    }

    /**
     * Creates an instance of Event theme.
     * @param curator The curator creating the theme
     * @param additionDate The addition date of the theme
     * @param name The name of the theme
     * @param coordinates The coordinates associated with the theme
     * @param description The description of the theme
     * @param contactsList The list of contacts associated with the theme
     * @param startDate The start date of the event
     * @param endDate The end date of the event
     * @param isPrivate Flag indicating if the theme is private
     * @param allowedUsers The list of allowed users for the theme
     * @return An instance of Event theme
     */
    public static Theme createEventTheme(CuratorUser curator, String additionDate, String name, Coordinates coordinates, String description, List<String> contactsList, 
    String startDate, String endDate, boolean isPrivate, List<AuthenticatedUser> allowedUsers) {
        Map<ThemeParameter, String> parameters = new HashMap<ThemeParameter,String>();
        parameters.put(ThemeParameter.StartDate, startDate);
        parameters.put(ThemeParameter.StartDate, endDate);
        return new Theme(curator, additionDate, name, coordinates, description, contactsList, parameters, ThemeCategory.Event, isPrivate, allowedUsers);
    }

    /**
     * Creates an instance of Activity theme.
     * @param curator The curator creating the theme
     * @param additionDate The addition date of the theme
     * @param name The name of the theme
     * @param coordinates The coordinates associated with the theme
     * @param description The description of the theme
     * @param contactsList The list of contacts associated with the theme
     * @param VATNumber The VAT number associated with the activity
     * @param sector The sector associated with the activity
     * @param isPrivate Flag indicating if the theme is private
     * @param allowedUsers The list of allowed users for the theme
     * @return An instance of Activity theme
     */
    public static Theme createActivityTheme(CuratorUser curator, String additionDate, String name, Coordinates coordinates, String description, List<String> contactsList, 
    String VATNumber, String sector, boolean isPrivate, List<AuthenticatedUser> allowedUsers) {
        Map<ThemeParameter, String> parameters = new HashMap<ThemeParameter,String>();
        parameters.put(ThemeParameter.VAT_Number, VATNumber);
        parameters.put(ThemeParameter.Sector, sector);
        return new Theme(curator, additionDate, name, coordinates, description, contactsList, parameters, ThemeCategory.Activity, isPrivate, allowedUsers);
    }

    /**
     * Creates an instance of PointOfInterest theme.
     * @param curator The curator creating the theme
     * @param additionDate The addition date of the theme
     * @param name The name of the theme
     * @param coordinates The coordinates associated with the theme
     * @param description The description of the theme
     * @param contactsList The list of contacts associated with the theme
     * @param isPrivate Flag indicating if the theme is private
     * @param allowedUsers The list of allowed users for the theme
     * @return An instance of PointOfInterest theme
     */
    public static Theme createPointOfInterestTheme(CuratorUser curator, String additionDate, String name, Coordinates coordinates, String description, List<String> contactsList,
        boolean isPrivate, List<AuthenticatedUser> allowedUsers) {
        Map<ThemeParameter, String> parameters = new HashMap<ThemeParameter,String>();
        return new Theme(curator, additionDate, name, coordinates, description, contactsList, parameters, ThemeCategory.PointOfInterest, isPrivate, allowedUsers);
    }
}
