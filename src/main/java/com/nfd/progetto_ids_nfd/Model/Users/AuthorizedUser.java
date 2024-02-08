package com.nfd.progetto_ids_nfd.Model.Users;
import java.util.Date;

import com.nfd.progetto_ids_nfd.Model.Contents.Post;
import com.nfd.progetto_ids_nfd.Model.Requests.Request;
import com.nfd.progetto_ids_nfd.Model.Requests.RequestFactory;
/*
 * AuthorizedUser is a user who is authorized by a moderator to publish without
 *  having to ask each time the review.
 */
public class AuthorizedUser extends AuthenticatedUser {

    public AuthorizedUser(String name, String surname, String email, String password, Date registrationDate) {
        super(name, surname, email, password, registrationDate);
    }

    @Override
    public void createPostRequest(Post post){
        // TODO
        Request request = RequestFactory.createPostRequest(this, post);
        request.Approve();
    }
}
