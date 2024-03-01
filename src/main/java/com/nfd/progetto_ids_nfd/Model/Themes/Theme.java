package com.nfd.progetto_ids_nfd.Model.Themes;

import com.nfd.progetto_ids_nfd.Model.Users.AuthenticatedUser;
import com.nfd.progetto_ids_nfd.Model.Users.AuthorizedUser;
import com.nfd.progetto_ids_nfd.Model.Users.CuratorUser;
import com.nfd.progetto_ids_nfd.Model.Utils.Coordinates;
import com.nfd.progetto_ids_nfd.Model.Utils.Enumerables.ThemeCategory;
import com.nfd.progetto_ids_nfd.Model.Utils.Enumerables.ThemeParameter;

import java.util.List;
import java.util.Map;
/*
 * This is an abstract class that describes a theme. It contains the
 * Curator that created it, addition date, name, coordinates, description
 * and a contacts List.
 */
public class Theme {
    private CuratorUser curator;
    private String additionDate;
    private String name;
    private Coordinates coordinates;
    private String description;
    private ThemeCategory category;
    private List<String> contactsList;
    private Map<ThemeParameter, String> parameters;
    private boolean isPrivate;
    private List<AuthenticatedUser> allowedUsers; // List of allowed users

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

    // Getters
    public CuratorUser getCurator() {
        return curator;
    }

    public String getAdditionDate() {
        return additionDate;
    }

    public String getName() {
        return name;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public String getDescription() {
        return description;
    }

    public List<String> getContactsList() {
        return contactsList;
    }

    public Map<ThemeParameter, String> getParameters() {
        return parameters;
    }

    public ThemeCategory getCategory() {
        return category;
    }

    public boolean isPrivate() {
        return isPrivate;
    }

    public List<AuthenticatedUser> getAllowedUsers() {
        return allowedUsers;
    }

    // Setters
    public void setCurator(CuratorUser curator) {
        this.curator = curator;
    }

    public void setAdditionDate(String additionDate) {
        this.additionDate = additionDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setContactsList(List<String> contactsList) {
        this.contactsList = contactsList;
    }

    public void setParameters(Map<ThemeParameter, String> parameters) {
        this.parameters = parameters;
    }

    public void setCategory(ThemeCategory category) {
        this.category = category;
    }

    public void setIsPrivate(boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    public void setAllowedUsers(List<AuthenticatedUser> allowedUsers) {
        this.allowedUsers = allowedUsers;
    }

    public void AddUser(AuthenticatedUser allowedUser){
        allowedUsers.add(allowedUser);
    }

    // Metodo per ottenere un parametro specifico
    public String getParameter(ThemeParameter parameter) {
        return parameters.get(parameter);
    }
}
