package com.nfd.progetto_ids_nfd.Model.Utils;
import com.nfd.progetto_ids_nfd.Model.Users.User;
import com.nfd.progetto_ids_nfd.Model.Users.UserFactory;

/*
 * The class Authenticator is responsible of performing Registration, LogIn and LogOut
 * for a User in a session.
 */
public class Authenticator {
    private User currentUser;

    public User getCurrentUser() {
        return currentUser;
    }

    public boolean registration(String name, String surname, String email, String password) {
        // TODO ask DB to check if the email arleady exists
        if(true) {
            return false;
        }
        // if the user does not exist, save the user data into the DB
        else {
            currentUser = UserFactory.createAuthenticatedUser(name, surname, email, password, null);
            // TODO save the user data to the DB
            logIn(email, password);
            return true;
        }
    }

    public boolean logIn(String email, String password) {
        // TODO check if the credentials are correct in the DB
        if(true) {
            // create user based on the data taken from the DB
            currentUser = UserFactory.createUser(null, password, password, email, password, null);
            return true;
        }
        return false;
    }

    public void logOut() {
        currentUser = null;
    }
}
