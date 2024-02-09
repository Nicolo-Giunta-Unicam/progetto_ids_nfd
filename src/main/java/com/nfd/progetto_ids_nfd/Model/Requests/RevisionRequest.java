package com.nfd.progetto_ids_nfd.Model.Requests;

import com.nfd.progetto_ids_nfd.Model.Contents.Post;
import com.nfd.progetto_ids_nfd.Model.Users.GestorUser;
import com.nfd.progetto_ids_nfd.Model.Users.User;
import com.nfd.progetto_ids_nfd.Model.Utils.Enumerables.Role;

/*
 * This request is generated when a Post is reported by a User.
 * It's defined by Post and other than being approved or disapproved it can also be
 * forwarded to a Gestor.
 */
public class RevisionRequest extends Request {
    // Property
    protected Post post; // The post associated with the revision request

    public RevisionRequest(User sender, Role receiver, Post post){
        super(sender, receiver);
        this.post = post;
    }

    // Method to approve the revision request
    @Override
    public void approve(User validator) {
        super.approve(validator);
        post.setVisibility(false);
        // TODO 
        if(validator instanceof GestorUser){
            // TODO Delete Request and Post from the DataBase
        }
    }

    // Method to disapprove the post request
    @Override
    public void disapprove(User validator) {
        super.disapprove(validator);
        if(validator instanceof GestorUser){
            // TODO Delete Request from the DataBase
        }
    }

    // Send the request to another user that is a Gestor
    public void Forward(){
        receiver = Role.Gestor;
        // TODO Update Request in DataBase
    }
}
