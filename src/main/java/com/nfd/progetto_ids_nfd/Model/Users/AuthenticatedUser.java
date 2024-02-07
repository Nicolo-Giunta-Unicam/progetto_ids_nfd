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

    // Getter and setter for 'name'
    public String getAuthenticatedUserName() {
        return super.getName();
    }

    public void setAuthenticatedUserName(String name) {
        super.setName(name);
    }

    // Getter and setter for 'surname' 
    public String getAuthenticatedUserSurname() {
        return super.getSurname();
    }

    public void setAuthenticatedUserSurname(String surname) {
        super.setSurname(surname);
    }

    // Getter and setter for 'email'
    public String getAuthenticatedUserEmail() {
        return super.getEmail();
    }

    public void setAuthenticatedUserEmail(String email) {
        super.setEmail(email);
    }

    // Getter and setter for 'password'
    public String getAuthenticatedUserPassword() {
        return super.getPassword();
    }

    public void setAuthenticatedUserPassword(String password) {
        super.setPassword(password);
    }

    // Getter and setter for 'registrationDate'
    public Date getAuthenticatedUserRegistrationDate() {
        return super.getRegistrationDate();
    }

    public void setAuthenticatedUserRegistrationDate(Date registrationDate) {
        super.setRegistrationDate(registrationDate);
    }

        public void createPostRequest(){
            // TODO
        }

    public void createItinerary(){
        // TODO
    }
    
}
