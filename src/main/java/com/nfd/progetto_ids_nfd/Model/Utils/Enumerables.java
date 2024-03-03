package com.nfd.progetto_ids_nfd.Model.Utils;

/**
 * This class contains various enumerations used within the project.
 */
public class Enumerables {
    // Enumeration for user roles
    public enum Role {
        Authenticated, // Logged in user
        Authorized,    // Authorized user (doesn't need validation for publishing contents)
        Moderator,     // Moderator (approves or disapproves contents)
        Curator,       // Curator (can create themes and invite users)
        Gestor         // Gestor (same as moderator but can also approve or disapprove roles)
    }

    // Enumeration for request's state
    public enum RequestState {
        Pending,    
        Approved,
        Disapproved
    }
    
    // Enumeration for theme parameters
    public enum ThemeParameter {
        VAT_Number,
        Sector,
        StartDate,
        EndDate
    }

    // Enumeration for theme categories
    public enum ThemeCategory {
        Activity,         // Activity (it has a VAT Number and a sector)
        Event,            // Event (it has a start date and an end date)
        PointOfInterest   // Point of Interest (it contains a list of other themes)
    }
}
