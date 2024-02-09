package com.nfd.progetto_ids_nfd.Model.Requests;

import com.nfd.progetto_ids_nfd.Model.Contents.Post;
import com.nfd.progetto_ids_nfd.Model.Users.AuthenticatedUser;
import com.nfd.progetto_ids_nfd.Model.Users.GestorUser;
import com.nfd.progetto_ids_nfd.Model.Users.User;
import com.nfd.progetto_ids_nfd.Model.Utils.Enumerables.Role;

/*
 * This is a request for publishing a Post, it's defined by its
 * Post and other than being approved or disapproved it can also be
 * forwarded to a Gestor.
 */
public class PostRequest extends Request {
    // Property
    protected Post post; // The post associated with the request

    public PostRequest(AuthenticatedUser sender, Role receiver, Post post){
        super(sender, receiver);
        this.post = post;
    }

    // Method to approve the post request
    @Override
    public void approve(User validator) {
        super.approve(validator);
        post.setVisibility(true);
        // TODO Send Post to DataBase for the pubblication
    }

    // Method to disapprove the post request
    @Override
    public void disapprove(User validator) {
        super.disapprove(validator);
        post.setVisibility(false);
        if(validator instanceof GestorUser){
            // TODO Delete Request and Post from the DataBase
        }
    }

    // Send the request to another user that is a Gestor
    public void Forward(){
        receiver = Role.Gestor;
        // TODO Update Request in DataBase
    }
}