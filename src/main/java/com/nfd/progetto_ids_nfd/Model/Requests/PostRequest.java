package com.nfd.progetto_ids_nfd.Model.Requests;

import com.nfd.progetto_ids_nfd.Model.Contents.Post;
import com.nfd.progetto_ids_nfd.Model.Users.AuthenticatedUser;
import com.nfd.progetto_ids_nfd.Model.Users.GestorUser;
import com.nfd.progetto_ids_nfd.Model.Users.User;
import com.nfd.progetto_ids_nfd.Model.Utils.Enumerables.Role;

/**
 * Represents a request for publishing a Post. 
 * This request can be approved or disapproved, 
 * and it can also be forwarded to a Gestor.
 */
public class PostRequest extends Request {
    
    // Property
    private Post post; // The post associated with the request

    /**
     * Constructs a PostRequest object.
     * 
     * @param sender The user sending the post request.
     * @param receiver The role of the user who will receive the request.
     * @param post The post to be published.
     */
    public PostRequest(AuthenticatedUser sender, Role receiver, Post post){
        super(sender, receiver);
        this.post = post;
    }

    /**
     * Approves the post request and sets the post visibility to true.
     * 
     * @param validator The user approving the post request.
     */
    @Override
    public void approve(User validator) {
        super.approve(validator);
        post.setVisibility(true);
        // TODO Send Post to DataBase for publication
    }

    /**
     * Disapproves the post request and sets the post visibility to false.
     * If the validator is a Gestor, the request and the post will be deleted from the database.
     * 
     * @param validator The user disapproving the post request.
     */
    @Override
    public void disapprove(User validator) {
        super.disapprove(validator);
        post.setVisibility(false);
        if(validator instanceof GestorUser){
            // TODO Delete Request and Post from the DataBase
        }
    }

    /**
     * Forwards the request to another user who is a Gestor.
     * 
     * @param validator The user forwarding the request.
     */
    public void forward(){
        receiver = Role.Gestor;
        // TODO Update Request in DataBase
    }
}
