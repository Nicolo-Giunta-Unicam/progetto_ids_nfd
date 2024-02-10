package com.nfd.progetto_ids_nfd.Model.Themes;

import com.nfd.progetto_ids_nfd.Model.Users.CuratorUser;
import com.nfd.progetto_ids_nfd.Model.Utils.Coordinates;
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
    private List<String> contactsList;
    private Map<ThemeParameter, String> parameters;
    public Theme (CuratorUser curator, String additionDate2, String name, Coordinates coordinates, String description, List<String> contactsList, Map<ThemeParameter, String> parameters)
    {
        this.curator=curator;
        this.additionDate=additionDate2;
        this.name=name;
        this.coordinates=coordinates;
        this.description=description;
        this.contactsList=contactsList;
        this.parameters=parameters;
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

    // Metodo per ottenere un parametro specifico
    public String getParameter(ThemeParameter parameter) {
        return parameters.get(parameter);
    }
}
