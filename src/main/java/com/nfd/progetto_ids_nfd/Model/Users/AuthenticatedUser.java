package com.nfd.progetto_ids_nfd.Model.Users;
import java.util.Date;
/*
 * AuthenticatedUser can publish text and multimedia content related to existing themes 
 * and animations, requires verification by moderator, can report content or save them.
 */
public class AuthenticatedUser extends User {

    public AuthenticatedUser(String name, String surname, String email, String password, Date registrationDate) {
        super(name, surname, email, password, registrationDate);

    }
        public void createPostRequest(){
            // TODO
        }

    public void createItinerary(){
        // TODO
    }
    
}
