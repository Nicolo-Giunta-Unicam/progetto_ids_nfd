package com.nfd.progetto_ids_nfd.Model.Themes;

import com.nfd.progetto_ids_nfd.Model.Users.CuratorUser;
import com.nfd.progetto_ids_nfd.Model.Utils.Coordinates;
import java.util.Date;
import java.util.List;

/*
 * This is an abstract class that describes a theme. It contains the
 * Curator that created it, addition date, name, coordinates, description
 * and a contacts List.
 */
public abstract class Theme {
    protected CuratorUser curator;
    protected Date additionDate;
    protected String name;
    protected Coordinates coordinates;
    protected String description;
    protected List<String> contactsList;

    public Theme (CuratorUser curator, Date additiDate, String name, Coordinates coordinates, String description, List<String> contactList)
    {
        this.curator=curator;
        this.additionDate=additiDate;
        this.name=name;
        this.coordinates=coordinates;
        this.description=description;
        this.contactsList=contactList;
    }

    // Getters
    public CuratorUser getCurator() {
        return curator;
    }

    public Date getAdditionDate() {
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

    // Setters
    public void setCurator(CuratorUser curator) {
        this.curator = curator;
    }

    public void setAdditionDate(Date additionDate) {
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
}
