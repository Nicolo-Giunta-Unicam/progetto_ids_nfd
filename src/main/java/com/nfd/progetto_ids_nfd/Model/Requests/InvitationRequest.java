package com.nfd.progetto_ids_nfd.Model.Requests;

import com.nfd.progetto_ids_nfd.Model.Themes.Theme;
import com.nfd.progetto_ids_nfd.Model.Users.AuthenticatedUser;
import com.nfd.progetto_ids_nfd.Model.Users.CuratorUser;
import com.nfd.progetto_ids_nfd.Model.Users.User;
import com.nfd.progetto_ids_nfd.Model.Users.UserFactory;
import com.nfd.progetto_ids_nfd.Model.Utils.Enumerables.Role;

/**
 * Represents a request sent by a User to a Curator to ask permission for creating posts for a specific theme.
 */
public class InvitationRequest extends Request {
    
    // Property
    private Theme theme; // The theme associated with the request
    private CuratorUser receiverUser;
    
    /**
     * Constructs an InvitationRequest object.
     * 
     * @param sender The user sending the invitation request.
     * @param theme The theme for which the user is requesting permission to create posts.
     */
    public InvitationRequest(AuthenticatedUser sender, Theme theme){
        super(sender, Role.Curator);
        receiverUser = theme.getCurator();
        this.theme = theme;
    }

    /**
     * Approves the invitation request if the validator is the receiver user.
     * 
     * @param validator The user approving the invitation request.
     */
    @Override
    public void approve(User validator){
        if(validator.equals(receiverUser)){
            super.approve(validator);
            theme.AddUser((AuthenticatedUser) sender);
            // TODO UPDATE DATABASE
        }
    }
    
    /**
     * Disapproves the invitation request if the validator is the receiver user.
     * 
     * @param validator The user disapproving the invitation request.
     */
    @Override
    public void disapprove(User validator){
        if(validator.equals(receiverUser)){
            super.disapprove(validator);
            // TODO Delete request from DataBase
        }
    }
}
