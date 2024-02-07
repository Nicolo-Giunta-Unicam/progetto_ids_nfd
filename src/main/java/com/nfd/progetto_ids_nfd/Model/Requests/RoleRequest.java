package com.nfd.progetto_ids_nfd.Model.Requests;
/*
 * This request is sent to a Gestor from a User asking for a specific
 * role. It contains the role to assign.
 */
public class RoleRequest extends Request {
    // Enumeration for the requested roles
    public enum Role {Authorized, Moderator, Curator}

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
}
