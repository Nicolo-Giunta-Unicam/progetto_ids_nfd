package com.nfd.progetto_ids_nfd.Model.Requests;

import com.nfd.progetto_ids_nfd.Model.Contents.Post;
import com.nfd.progetto_ids_nfd.Model.Users.GestorUser;
import com.nfd.progetto_ids_nfd.Model.Users.User;
import com.nfd.progetto_ids_nfd.Model.Utils.Enumerables.Role;

/**
 * Represents a request generated when a Post is reported by a User.
 * This request is defined by the Post and can be approved or disapproved.
 * It can also be forwarded to a Gestor.
 */
public class RevisionRequest extends Request {
    // Property
    private Post post; // The post associated with the revision request

    /**
     * Constructs a RevisionRequest object.
     * 
     * @param sender The user who sends the revision request.
     * @param receiver The role of the user who receives the revision request.
     * @param post The post associated with the revision request.
     */
    public RevisionRequest(User sender, Role receiver, Post post){
        super(sender, receiver);
        this.post = post;
    }

    /**
     * Approves the revision request and sets the post visibility to false.
     * 
     * @param validator The user approving the revision request.
     */
    @Override
    public void approve(User validator) {
        super.approve(validator);
        post.setVisibility(false);
        // TODO 
        if(validator instanceof GestorUser){
            // TODO Delete Request and Post from the DataBase
        }
    }

    /**
     * Disapproves the revision request.
     * If the validator is a Gestor, the request will be deleted from the database.
     * 
     * @param validator The user disapproving the revision request.
     */
    @Override
    public void disapprove(User validator) {
        super.disapprove(validator);
        if(validator instanceof GestorUser){
            // TODO Delete Request from the DataBase
        }
    }

    /**
     * Forwards the request to another user who is a Gestor.
     */
    public void Forward(){
        receiver = Role.Gestor;
        // TODO Update Request in DataBase
    }
}
