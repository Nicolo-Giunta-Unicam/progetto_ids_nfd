package com.nfd.progetto_ids_nfd.Model.Requests;

import com.nfd.progetto_ids_nfd.Model.Themes.Theme;
import com.nfd.progetto_ids_nfd.Model.Users.CuratorUser;
import com.nfd.progetto_ids_nfd.Model.Users.GestorUser;
import com.nfd.progetto_ids_nfd.Model.Users.User;
import com.nfd.progetto_ids_nfd.Model.Utils.Enumerables.Role;

/**
 * Represents a request sent by a Curator to a Gestor to ask permission for
 * creating a new theme. It contains the theme to create.
 */
public class ThemeRequest extends Request {
    // Property
    private Theme theme; // The theme associated with the request

    /**
     * Constructs a ThemeRequest object.
     * 
     * @param sender The curator user who sends the theme request.
     * @param receiver The role of the user who receives the theme request.
     * @param theme The theme associated with the request.
     */
    public ThemeRequest(CuratorUser sender, Role receiver, Theme theme){
        super(sender, receiver);
        this.theme = theme;
    }

    /**
     * Approves the theme request if the validator is a Gestor.
     * 
     * @param validator The user approving the theme request.
     */
    @Override
    public void approve(User validator){
        if(validator instanceof GestorUser){
            super.approve(validator);
            // TODO Add the theme to the DB
        }
    }

    /**
     * Disapproves the theme request if the validator is a Gestor.
     * 
     * @param validator The user disapproving the theme request.
     */
    @Override
    public void disapprove(User validator){
        if(validator instanceof GestorUser){
            super.disapprove(validator);
            // TODO Delete request from DataBase
        }
    }
}
