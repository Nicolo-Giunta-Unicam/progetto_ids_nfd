package com.nfd.progetto_ids_nfd.Model.Users;
import java.util.Date;
/*
 * AuthorizedUser is a user who is authorized by a moderator to publish without
 *  having to ask each time the review.
 */
public class AuthorizedUser extends AuthenticatedUser {

    public AuthorizedUser(String name, String surname, String email, String password, Date registrationDate) {
        super(name, surname, email, password, registrationDate);
    }

    @Override
    public void createPostRequest(){
        // TODO
    }
}
