package com.nfd.progetto_ids_nfd.Model.Users;
import java.util.Date;
/*
 * CuratorUser can upload contests, events or tourist places/services of 
 * which it has authority.
 */
public class CuratorUser extends AuthenticatedUser {

    public CuratorUser(String name, String surname, String email, String password, Date registrationDate) {
        super(name, surname, email, password, registrationDate);
    }

     // Getter and setter for 'name' 
     public String getCuratorUserName() {
        return super.getName();
    }

    public void setCuratorUserName(String name) {
        super.setName(name);
    }

    // Getter and setter for 'surname'
    public String getCuratorUserSurname() {
        return super.getSurname();
    }

    public void setCuratorUserSurname(String surname) {
        super.setSurname(surname);
    }

    // Getter and setter for 'email'
    public String getCuratorUserEmail() {
        return super.getEmail();
    }

    public void setCuratorUserEmail(String email) {
        super.setEmail(email);
    }

    // Getter and setter for 'password' 
    public String getCuratorUserPassword() {
        return super.getPassword();
    }

    public void setCuratorUserPassword(String password) {
        super.setPassword(password);
    }

    // Getter and setter for 'registrationDate' 
    public Date getCuratorUserRegistrationDate() {
        return super.getRegistrationDate();
    }

    public void setCuratorUserRegistrationDate(Date registrationDate) {
        super.setRegistrationDate(registrationDate);
    }

    public void createPostRequest(){
        // TODO
    }

    public void createActivityRequest(){
        // TODO
    }
}
