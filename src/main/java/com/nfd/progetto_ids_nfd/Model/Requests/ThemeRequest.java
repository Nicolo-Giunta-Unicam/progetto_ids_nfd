package com.nfd.progetto_ids_nfd.Model.Requests;

import com.nfd.progetto_ids_nfd.Model.Themes.Theme;
import com.nfd.progetto_ids_nfd.Model.Users.CuratorUser;
import com.nfd.progetto_ids_nfd.Model.Users.GestorUser;
import com.nfd.progetto_ids_nfd.Model.Users.User;
import com.nfd.progetto_ids_nfd.Model.Utils.Enumerables.Role;

/*
 * This request is sent by a Curator to a Gestor to ask permission of
 * creating a new theme. It contains the theme to create.
 */
public class ThemeRequest extends Request {
    // Property
    protected Theme theme; // The theme associated with the request

    public ThemeRequest(CuratorUser sender, Role receiver, Theme theme){
        super(sender, receiver);
        this.theme = theme;
    }

    // Method to approve the theme request
    @Override
    public void approve(User validator){
        if(validator instanceof GestorUser){
            super.approve(validator);
            // TODO Add the theme to the DB
        }
    }
    // Method to disapprove the theme request
    @Override
    public void disapprove(User validator){
        if(validator instanceof GestorUser){
            super.disapprove(validator);
            // TODO Delete request from DataBase
        }
    }
}
