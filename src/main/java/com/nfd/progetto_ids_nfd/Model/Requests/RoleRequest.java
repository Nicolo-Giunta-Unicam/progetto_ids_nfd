package com.nfd.progetto_ids_nfd.Model.Requests;

import com.nfd.progetto_ids_nfd.Model.Users.GestorUser;
import com.nfd.progetto_ids_nfd.Model.Users.User;
import com.nfd.progetto_ids_nfd.Model.Users.UserFactory;
import com.nfd.progetto_ids_nfd.Model.Utils.Enumerables.Role;

/**
 * Represents a request sent to a Gestor from a User asking for a specific role.
 * It contains the role to assign.
 */
public class RoleRequest extends Request {
    
    // Property to store the requested role
    private Role requestedRole;

    /**
     * Constructs a RoleRequest object.
     * 
     * @param sender The user who sends the role request.
     * @param receiver The role of the user who receives the role request.
     * @param requestedRole The role requested.
     */
    public RoleRequest(User sender, Role receiver, Role requestedRole){
        super(sender, receiver);
        this.requestedRole = requestedRole;
    }

    /**
     * Getter for the requestedRole property.
     * 
     * @return The requested role.
     */
    public Role getRequestedRole() {
        return requestedRole;
    }

    /**
     * Setter for the requestedRole property.
     * 
     * @param requestedRole The role to set.
     */
    public void setRequestedRole(Role requestedRole) {
        this.requestedRole = requestedRole;
    }

    /**
     * Approves the role request if the validator is a Gestor.
     * Converts the sender to the requested role.
     * 
     * @param validator The user approving the role request.
     */
    @Override
    public void approve(User validator){
        if(validator instanceof GestorUser){
            super.approve(validator);
            sender = UserFactory.convertUser(sender, requestedRole);
            // TODO Update the Request and the User on the DataBase
        }
    }

    /**
     * Disapproves the role request if the validator is a Gestor.
     * 
     * @param validator The user disapproving the role request.
     */
    @Override
    public void disapprove(User validator){
        if(validator instanceof GestorUser){
            super.disapprove(validator);
            // TODO Delete request from DataBase
        }
    }
}
