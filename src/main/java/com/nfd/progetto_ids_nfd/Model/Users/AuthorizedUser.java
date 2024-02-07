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
    
    // Getter and setter for 'name'
    public String getAuthorizedUserName() {
        return super.getName();
    }

    public void setAuthorizedUserName(String name) {
        super.setName(name);
    }

    // Getter and setter for 'surname'
    public String getAuthorizedUserSurname() {
        return super.getSurname();
    }

    public void setAuthorizedUserSurname(String surname) {
        super.setSurname(surname);
    }

    // Getter and setter for 'email'
    public String getAuthorizedUserEmail() {
        return super.getEmail();
    }

    public void setAuthorizedUserEmail(String email) {
        super.setEmail(email);
    }

    // Getter and setter for 'password'
    public String getAuthorizedUserPassword() {
        return super.getPassword();
    }

    public void setAuthorizedUserPassword(String password) {
        super.setPassword(password);
    }

    // Getter and setter for 'registrationDate'
    public Date getAuthorizedUserRegistrationDate() {
        return super.getRegistrationDate();
    }

    public void setAuthorizedUserRegistrationDate(Date registrationDate) {
        super.setRegistrationDate(registrationDate);
    }

    @Override
    public void createPostRequest(){
        // TODO
    }
}
