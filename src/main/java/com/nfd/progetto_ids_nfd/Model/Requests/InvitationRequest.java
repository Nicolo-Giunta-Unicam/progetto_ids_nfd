package com.nfd.progetto_ids_nfd.Model.Requests;

import com.nfd.progetto_ids_nfd.Model.Themes.Theme;
import com.nfd.progetto_ids_nfd.Model.Users.CuratorUser;
import com.nfd.progetto_ids_nfd.Model.Users.User;
import com.nfd.progetto_ids_nfd.Model.Utils.Enumerables.Role;

/*
 * This request is sent by a User to a Curator to ask permission of
 * creating posts for the a specific theme.
 */
public class InvitationRequest extends Request {
    // Property
    private Theme theme; // The theme associated with the request

    public InvitationRequest(CuratorUser sender, Role receiver, Theme theme){
        super(sender, receiver);
        this.theme = theme;
    }

    // Method to approve the invitation request
    @Override
    public void approve(User validator){
        if(validator instanceof CuratorUser){
            super.approve(validator);
            // TODO Allow the user to post on the related theme
        }
    }
    // Method to disapprove the invitation request
    @Override
    public void disapprove(User validator){
        if(validator instanceof CuratorUser){
            super.disapprove(validator);
            // TODO Delete request from DataBase
        }
    }
}
