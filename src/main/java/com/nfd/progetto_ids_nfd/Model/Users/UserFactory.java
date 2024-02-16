package com.nfd.progetto_ids_nfd.Model.Users;

import java.util.Date;

import com.nfd.progetto_ids_nfd.Model.Utils.Enumerables.Role;

/*
 * UserFactory is the application of the factory design pattern and
 * is responsible for creating different types of users.
 */
public class UserFactory {
    public static User createUser(Role role, String name, String surname, String email, String password, Date registrationDate){
        switch (role) {
            case Authenticated:
                return createAuthenticatedUser(name, surname, email, password, registrationDate);
                
        
            default:
                return null;
            
        }
    }

    // Create and return an instance of AuthenticatedUser
    public static AuthenticatedUser createAuthenticatedUser(String name, String surname, String email, String password, Date registrationDate) {
        return new AuthenticatedUser(name, surname, email, password, registrationDate);
    }

    // Create and return an instance of AuthorizedUser
    public static AuthorizedUser createAuthorizedUser(String name, String surname, String email, String password, Date registrationDate) {
        return new AuthorizedUser(name, surname, email, password, registrationDate);
    }

    // Create and return an instance of GestorUser
    public static GestorUser createGestorUser(String name, String surname, String email, String password, Date registrationDate) {
        return new GestorUser(name, surname, email, password, registrationDate);
    }

    // Create and return an instance of CuratorUser
    public static CuratorUser createCuratorUser(String name, String surname, String email, String password, Date registrationDate) {
        return new CuratorUser(name, surname, email, password, registrationDate);
    }

    // Create and return an instance of ModeratorUser
    public static ModeratorUser createModeratorUser(String name, String surname, String email, String password, Date registrationDate) {
        return new ModeratorUser(name, surname, email, password, registrationDate);
    }

    /**
     * Converts a generic User to a specific User based on the provided role.
     * 
     * @param user The user to convert.
     * @param role The role to convert the user to.
     * @return A specific User instance based on the provided role.
     */
    public static User convertUser(User user, Role role) {
        String name = user.getName();
        String surname = user.getSurname();
        String email = user.getEmail();
        String password = user.getPassword();
        Date registrationDate = user.getRegistrationDate();

        switch (role) {
            case Authenticated:
                return createAuthenticatedUser(name, surname, email, password, registrationDate);
            case Authorized:
                return createAuthorizedUser(name, surname, email, password, registrationDate);
            case Moderator:
                return createModeratorUser(name, surname, email, password, registrationDate);
            case Curator:
                return createCuratorUser(name, surname, email, password, registrationDate);
            case Gestor:
                return createGestorUser(name, surname, email, password, registrationDate);
            default:
                return null;
        }
    }
}
