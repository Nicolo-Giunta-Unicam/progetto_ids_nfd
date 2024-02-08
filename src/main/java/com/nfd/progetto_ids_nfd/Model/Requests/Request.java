package com.nfd.progetto_ids_nfd.Model.Requests;

import com.nfd.progetto_ids_nfd.Model.Users.User;
import com.nfd.progetto_ids_nfd.Model.Utils.Enumerables.RequestState;
import com.nfd.progetto_ids_nfd.Model.Utils.Enumerables.Role;

/*
 * Request is an abstract class that is described by sender and receiver.
 * The request can be approved or disapproved.
 */
public abstract class Request {
    // Properties
    protected User sender; // The user who sent the request
    protected Role receiver; // The role of the user who receives the request
    protected RequestState state; // Current state of the request

    // Getter for the sender property
    public User getSender() {
        return sender;
    }

    // Setter for the sender property
    public void setSender(User sender) {
        this.sender = sender;
    }

    // Getter for the receiver property
    public Role getReceiver() {
        return receiver;
    }

    // Setter for the receiver property
    public void setReceiver(Role receiver) {
        this.receiver = receiver;
    }

    // Method to approve the request
    public void Approve() {
        // TODO Implementation of the Approve method
        state = RequestState.approved;
    }

    // Method to disapprove the request
    public void Disapprove() {
        // TODO Implementation of the Disapprove method
        state = RequestState.disapproved;
    }
}

