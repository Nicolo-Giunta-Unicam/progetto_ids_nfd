package com.nfd.progetto_ids_nfd.Model.Utils;

public class Enumerables {
    // Enumeration for the requested roles
    public enum Role {
        Authenticated, // Authenticated user
        Authorized,    // Authorized user
        Moderator,     // Moderator
        Curator,       // Curator
        Gestor         // Gestor
    }

    // Enumeration for the request state
    public enum RequestState {
        Pending,    // Pending
        Approved,   // Approved
        Disapproved // Disapproved
    }
    
    // Enumeration for theme parameters
    public enum ThemeParameter {
        VAT_Number, // VAT Number
        Sector,     // Sector
        StartDate,  // Start Date
        EndDate     // End Date
    }

    // Enumeration for theme categories
    public enum ThemeCategory {
        Activity,         // Activity
        Event,            // Event
        PointOfInterest   // Point of Interest
    }
}
