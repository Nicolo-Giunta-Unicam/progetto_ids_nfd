package com.nfd.progetto_ids_nfd.Model.Themes;

import com.nfd.progetto_ids_nfd.Model.Users.AuthenticatedUser;
import com.nfd.progetto_ids_nfd.Model.Users.CuratorUser;
import com.nfd.progetto_ids_nfd.Model.Utils.Coordinates;
import com.nfd.progetto_ids_nfd.Model.Utils.Enumerables.ThemeCategory;
import com.nfd.progetto_ids_nfd.Model.Utils.Enumerables.ThemeParameter;

import java.util.List;
import java.util.Map;

/**
 * This is an abstract class that describes a theme. It contains the
 * Curator that created it, addition date, name, coordinates, description
 * and a contacts List.
 */
public class Theme {
    private CuratorUser curator; // The curator who created the theme
    private String additionDate; // Date when the theme was added
    private String name; // Name of the theme
    private Coordinates coordinates; // Coordinates associated with the theme
    private String description; // Description of the theme
    private ThemeCategory category; // Category of the theme
    private List<String> contactsList; // List of contacts associated with the theme
    private Map<ThemeParameter, String> parameters; // Map of parameters associated with the theme
    private boolean isPrivate; // Flag indicating if the theme is private
    private List<AuthenticatedUser> allowedUsers; // List of allowed users for the theme

    /**
     * Constructs a Theme object.
     * @param curator The curator who created the theme
     * @param additionDate The date when the theme was added
     * @param name The name of the theme
     * @param coordinates The coordinates associated with the theme
     * @param description The description of the theme
     * @param contactsList The list of contacts associated with the theme
     * @param parameters The map of parameters associated with the theme
     * @param category The category of the theme
     * @param isPrivate Flag indicating if the theme is private
     * @param allowedUsers The list of allowed users for the theme
     */
    public Theme(CuratorUser curator, String additionDate, String name, Coordinates coordinates,
                 String description, List<String> contactsList, Map<ThemeParameter, String> parameters,
                 ThemeCategory category, boolean isPrivate, List<AuthenticatedUser> allowedUsers) {
        this.curator = curator;
        this.additionDate = additionDate;
        this.name = name;
        this.coordinates = coordinates;
        this.description = description;
        this.contactsList = contactsList;
        this.parameters = parameters;
        this.category = category;
        this.isPrivate = isPrivate;
        this.allowedUsers = allowedUsers;
    }

    /**
     * Gets the curator of the theme.
     * @return The curator of the theme
     */
    public CuratorUser getCurator() {
        return curator;
    }

    /**
     * Gets the addition date of the theme.
     * @return The addition date of the theme
     */
    public String getAdditionDate() {
        return additionDate;
    }

    /**
     * Gets the name of the theme.
     * @return The name of the theme
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the coordinates associated with the theme.
     * @return The coordinates associated with the theme
     */
    public Coordinates getCoordinates() {
        return coordinates;
    }

    /**
     * Gets the description of the theme.
     * @return The description of the theme
     */
    public String getDescription() {
        return description;
    }

    /**
     * Gets the list of contacts associated with the theme.
     * @return The list of contacts associated with the theme
     */
    public List<String> getContactsList() {
        return contactsList;
    }

    /**
     * Gets the parameters associated with the theme.
     * @return The parameters associated with the theme
     */
    public Map<ThemeParameter, String> getParameters() {
        return parameters;
    }

    /**
     * Gets the category of the theme.
     * @return The category of the theme
     */
    public ThemeCategory getCategory() {
        return category;
    }

    /**
     * Checks if the theme is private.
     * @return True if the theme is private, false otherwise
     */
    public boolean isPrivate() {
        return isPrivate;
    }

    /**
     * Gets the list of allowed users for the theme.
     * @return The list of allowed users for the theme
     */
    public List<AuthenticatedUser> getAllowedUsers() {
        return allowedUsers;
    }

    /**
     * Sets the curator of the theme.
     * @param curator The curator to be set for the theme
     */
    public void setCurator(CuratorUser curator) {
        this.curator = curator;
    }

    /**
     * Sets the addition date of the theme.
     * @param additionDate The addition date to be set for the theme
     */
    public void setAdditionDate(String additionDate) {
        this.additionDate = additionDate;
    }

    /**
     * Sets the name of the theme.
     * @param name The name to be set for the theme
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the coordinates associated with the theme.
     * @param coordinates The coordinates to be set for the theme
     */
    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    /**
     * Sets the description of the theme.
     * @param description The description to be set for the theme
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Sets the list of contacts associated with the theme.
     * @param contactsList The list of contacts to be set for the theme
     */
    public void setContactsList(List<String> contactsList) {
        this.contactsList = contactsList;
    }

    /**
     * Sets the parameters associated with the theme.
     * @param parameters The parameters to be set for the theme
     */
    public void setParameters(Map<ThemeParameter, String> parameters) {
        this.parameters = parameters;
    }

    /**
     * Sets the category of the theme.
     * @param category The category to be set for the theme
     */
    public void setCategory(ThemeCategory category) {
        this.category = category;
    }

    /**
     * Sets whether the theme is private or not.
     * @param isPrivate True if the theme is private, false otherwise
     */
    public void setIsPrivate(boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    /**
     * Sets the list of allowed users for the theme.
     * @param allowedUsers The list of allowed users to be set for the theme
     */
    public void setAllowedUsers(List<AuthenticatedUser> allowedUsers) {
        this.allowedUsers = allowedUsers;
    }

    /**
     * Adds a user to the list of allowed users for the theme.
     * @param allowedUser The user to be added to the list of allowed users
     */
    public void AddUser(AuthenticatedUser allowedUser){
        allowedUsers.add(allowedUser);
    }

    /**
     * Gets the value of a specific parameter associated with the theme.
     * @param parameter The parameter whose value is to be retrieved
     * @return The value of the specified parameter
     */
    public String getParameter(ThemeParameter parameter) {
        return parameters.get(parameter);
    }
}
