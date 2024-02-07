package com.nfd.progetto_ids_nfd.Model.Users;
import java.util.Date;

/*
 * UserFactory is the application of the factory design pattern and
 * is responsible for creating different types of users.
 */
public class UserFactory {

    // Create and return an instance of AuthenticatedUser
    public AuthenticatedUser createAuthenticatedUser(String name, String surname, String email, String password, Date registrationDate) {
        return new AuthenticatedUser(name, surname, email, password, registrationDate);
        // TODO
    }

    // Create and return an instance of AuthorizedUser
    public AuthorizedUser createAuthorizedUser(String name, String surname, String email, String password, Date registrationDate) {
        return new AuthorizedUser(name, surname, email, password, registrationDate);
        // TODO
    }

    // Create and return an instance of GestorUser
    public GestorUser createGestorUser(String name, String surname, String email, String password, Date registrationDate) {
        return new GestorUser(name, surname, email, password, registrationDate);
        // TODO
    }

    // Create and return an instance of CuratorUser
    public CuratorUser createCuratorUser(String name, String surname, String email, String password, Date registrationDate) {
        return new CuratorUser(name, surname, email, password, registrationDate);
        // TODO
    }

    // Create and return an instance of ModeratorUser
    public ModeratorUser createModeratorUser(String name, String surname, String email, String password, Date registrationDate) {
        return new ModeratorUser(name, surname, email, password, registrationDate);
        // TODO
    }
}
