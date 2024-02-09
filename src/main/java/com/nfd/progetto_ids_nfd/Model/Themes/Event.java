package com.nfd.progetto_ids_nfd.Model.Themes;

import java.util.Date;
import java.util.List;

import com.nfd.progetto_ids_nfd.Model.Users.CuratorUser;
import com.nfd.progetto_ids_nfd.Model.Utils.Coordinates;

public class Event extends Theme {
    // Additional properties for the Event class
    private Date startDate;
    private Date endDate;

    public Event(CuratorUser curator, String name, Coordinates coordinates, String description, List<String> contactsList, Date startDate, Date endDate) {
        
        super(curator, endDate, name, coordinates, description, contactsList); 
        this.name = name;
        this.coordinates = coordinates;
        this.description = description;
        this.contactsList = contactsList;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    // Getter and setter methods for startDate and endDate
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
