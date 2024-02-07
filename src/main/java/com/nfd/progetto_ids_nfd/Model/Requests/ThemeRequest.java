package com.nfd.progetto_ids_nfd.Model.Requests;

import com.nfd.progetto_ids_nfd.Model.Themes.Theme;

/*
 * This request is sent by a Curator to a Gestor to ask permission of
 * creating a new theme. It contains the theme to create.
 */
public class ThemeRequest extends Request {
    // Property
    protected Theme theme; // The theme associated with the request

    // Method to approve the theme request
    @Override
    public void Approve() {
        // TODO Implementation of the Approve method for the theme request
    }

    // Method to disapprove the theme request
    @Override
    public void Disapprove() {
        // TODO Implementation of the Disapprove method for the theme request
    }
}
