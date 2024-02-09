package com.nfd.progetto_ids_nfd.Model.Themes;

import java.sql.Date;
import java.util.List;

import com.nfd.progetto_ids_nfd.Model.Users.CuratorUser;
import com.nfd.progetto_ids_nfd.Model.Utils.Coordinates;

/*
 * This class describes activities (such as Restaurants, Museums, Shops...)
 * It's described by VAT number and sector.
 */
public class Activity extends Theme {
    // Properties specific to Activity
    private String VATNumber;
    private String sector;

    // Constructor that calls the constructor of the superclass (Theme)
    public Activity(CuratorUser curator, Date additionDate, String name, Coordinates coordinates, String description, List<String> contactsList,
                    String VATNumber, String sector) {
        super(curator, additionDate, name, coordinates, description, contactsList);
        this.VATNumber = VATNumber;
        this.sector = sector;
    }

    // Getter and setter methods for VATNumber
    public String getVATNumber() {
        return VATNumber;
    }

    public void setVATNumber(String VATNumber) {
        this.VATNumber = VATNumber;
    }

    // Getter and setter methods for sector
    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }
}
