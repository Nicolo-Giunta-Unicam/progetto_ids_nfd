package com.nfd.progetto_ids_nfd.Model.Requests;

import com.nfd.progetto_ids_nfd.Model.Users.User;
import com.nfd.progetto_ids_nfd.Model.Utils.Enumerables.RequestState;
import com.nfd.progetto_ids_nfd.Model.Utils.Enumerables.Role;

/**
 * Represents an abstract class for requests, described by sender and receiver.
 * The request can be approved or disapproved.
 */
public abstract class Request {
    // Properties
    protected User sender; // The user who sent the request
    protected Role receiver; // The role of the user who receives the request
    protected RequestState state; // Current state of the request
    protected User validator; // The User that Approves or Disapproves the request

    /**
     * Constructs a Request object.
     * 
     * @param sender The user who sends the request.
     * @param receiver The role of the user who receives the request.
     */
    public Request(User sender, Role receiver){
        this.sender = sender;
        this.receiver = receiver;
        this.state = RequestState.Pending;
    }

    /**
     * Getter for the sender property.
     * 
     * @return The user who sent the request.
     */
    public User getSender() {
        return sender;
    }

    /**
     * Setter for the sender property.
     * 
     * @param sender The user who sends the request.
     */
    public void setSender(User sender) {
        this.sender = sender;
    }

    /**
     * Getter for the receiver property.
     * 
     * @return The role of the user who receives the request.
     */
    public Role getReceiver() {
        return receiver;
    }

    /**
     * Setter for the receiver property.
     * 
     * @param receiver The role of the user who receives the request.
     */
    public void setReceiver(Role receiver) {
        this.receiver = receiver;
    }

    /**
     * Approves the request and sets the state to Approved.
     * 
     * @param validator The user approving the request.
     */
    public void approve(User validator) {
        this.validator = validator;
        state = RequestState.Approved;
    }

    /**
     * Disapproves the request and sets the state to Disapproved.
     * 
     * @param validator The user disapproving the request.
     */
    public void disapprove(User validator) {
        this.validator = validator;
        state = RequestState.Disapproved;
    }
}
