package com.nfd.progetto_ids_nfd.Model.Users;

import java.util.Date;

import com.nfd.progetto_ids_nfd.Model.Contents.Post;
import com.nfd.progetto_ids_nfd.Model.Requests.Request;
import com.nfd.progetto_ids_nfd.Model.Requests.RequestFactory;

/*
 * AuthorizedUser is a user who is authorized by a moderator to publish without
 * having to ask for review each time.
 */
public class AuthorizedUser extends AuthenticatedUser {

    public AuthorizedUser(String name, String surname, String email, String password, Date registrationDate) {
        super(name, surname, email, password, registrationDate);
    }

    /**
     * Creates a post request and automatically approves it.
     * 
     * @param post The post for which the request is created.
     */
    @Override
    public void createPostRequest(Post post) {
        // Create a post request using the RequestFactory
        Request request = RequestFactory.createPostRequest(this, post);

        // Automatically approve the request
        request.approve(this);

        // TODO: Send the request to the database
    }
}
