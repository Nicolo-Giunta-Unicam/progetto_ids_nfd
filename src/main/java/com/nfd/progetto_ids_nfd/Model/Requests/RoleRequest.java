package com.nfd.progetto_ids_nfd.Model.Requests;

import com.nfd.progetto_ids_nfd.Model.Users.UserFactory;
import com.nfd.progetto_ids_nfd.Model.Utils.Enumerables.Role;

/*
 * This request is sent to a Gestor from a User asking for a specific
 * role. It contains the role to assign.
 */
public class RoleRequest extends Request {
    

    // Property to store the requested role
    protected Role requestedRole;

    // Getter for the requestedRole property
    public Role getRequestedRole() {
        return requestedRole;
    }

    // Setter for the requestedRole property
    public void setRequestedRole(Role requestedRole) {
        this.requestedRole = requestedRole;
    }

    @Override
    public void Approve(){
        super.Approve();
        UserFactory factory = new UserFactory();
        sender = factory.ConvertUser(sender, requestedRole);
    }
}
