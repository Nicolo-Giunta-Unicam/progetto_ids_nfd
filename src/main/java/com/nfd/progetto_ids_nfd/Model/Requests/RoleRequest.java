package com.nfd.progetto_ids_nfd.Model.Requests;

import com.nfd.progetto_ids_nfd.Model.Users.GestorUser;
import com.nfd.progetto_ids_nfd.Model.Users.User;
import com.nfd.progetto_ids_nfd.Model.Users.UserFactory;
import com.nfd.progetto_ids_nfd.Model.Utils.Enumerables.Role;

/*
 * This request is sent to a Gestor from a User asking for a specific
 * role. It contains the role to assign.
 */
public class RoleRequest extends Request {
    

    // Property to store the requested role
    private Role requestedRole;


    public RoleRequest(User sender, Role receiver, Role requestedRole){
        super(sender, receiver);
        this.requestedRole = requestedRole;
    }

    // Getter for the requestedRole property
    public Role getRequestedRole() {
        return requestedRole;
    }

    // Setter for the requestedRole property
    public void setRequestedRole(Role requestedRole) {
        this.requestedRole = requestedRole;
    }

    @Override
    public void approve(User validator){
        if(validator instanceof GestorUser){
            super.approve(validator);
            sender = UserFactory.convertUser(sender, requestedRole);
            // TODO Update the Request and the User on the DataBase
        }
    }

    @Override
    public void disapprove(User validator){
        if(validator instanceof GestorUser){
            super.disapprove(validator);
            // TODO Delete request from DataBase
        }
    }

}
