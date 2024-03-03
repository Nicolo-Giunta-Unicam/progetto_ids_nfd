package com.nfd.progetto_ids_nfd.Model.Utils;

import com.nfd.progetto_ids_nfd.Model.Users.User;
import com.nfd.progetto_ids_nfd.Model.Users.UserFactory;

/**
 * The class Authenticator is responsible for performing Registration, LogIn, and LogOut
 * for a User in a session.
 */
public class Authenticator {
    private User currentUser; // The current user logged in

    /**
     * Retrieves the current logged-in user.
     * @return The current logged-in user
     */
    public User getCurrentUser() {
        return currentUser;
    }

    /**
     * Registers a new user with the provided information.
     * @param name The name of the user
     * @param surname The surname of the user
     * @param email The email address of the user
     * @param password The password of the user
     * @return True if registration is successful, false otherwise
     */
    public boolean registration(String name, String surname, String email, String password) {
        // TODO ask DB to check if the email already exists
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

    /**
     * Logs in the user with the provided credentials.
     * @param email The email address of the user
     * @param password The password of the user
     * @return True if login is successful, false otherwise
     */
    public boolean logIn(String email, String password) {
        // TODO check if the credentials are correct in the DB
        if(true) {
            // create user based on the data taken from the DB
            currentUser = UserFactory.createUser(null, password, password, email, password, null);
            return true;
        }
        return false;
    }

    /**
     * Logs out the current user.
     */
    public void logOut() {
        currentUser = null;
    }
}
