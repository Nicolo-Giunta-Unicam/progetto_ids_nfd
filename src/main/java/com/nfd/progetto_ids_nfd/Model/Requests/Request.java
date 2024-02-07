package com.nfd.progetto_ids_nfd.Model.Requests;

import com.nfd.progetto_ids_nfd.Model.Users.User;

/*
 * Request is an abstract class that is described by sender and receiver.
 * The request can be approved or disapproved.
 */
public abstract class Request {
    // Properties
    protected User sender; // The user who sent the request
    protected User receiver; // The user who receives the request

    // Getter for the sender property
    public User getSender() {
        return sender;
    }

    // Setter for the sender property
    public void setSender(User sender) {
        this.sender = sender;
    }

    // Getter for the receiver property
    public User getReceiver() {
        return receiver;
    }

    // Setter for the receiver property
    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }

    // Method to approve the request
    public void Approve() {
        // TODO Implementation of the Approve method
    }

    // Method to disapprove the request
    public void Disapprove() {
        // TODO Implementation of the Disapprove method
    }
}

