package com.nfd.progetto_ids_nfd.Model.Users;
import java.util.Date;
/*
 * GestorUser deals with reviewing content, reporting, providing roles 
 * to users, higher level.
 */
public class GestorUser extends User {

    public GestorUser(String name, String surname, String email, String password, Date registrationDate) {
        super(name, surname, email, password, registrationDate);
    }

    // Getter and setter for 'name' 
    public String getGestorUserName() {
        return super.getName();
    }

    public void setGestorUserName(String name) {
        super.setName(name);
    }

    // Getter and setter for 'surname' 
    public String getGestorUserSurname() {
        return super.getSurname();
    }

    public void setGestorUserSurname(String surname) {
        super.setSurname(surname);
    }

    // Getter and setter for 'email' 
    public String getGestorUserEmail() {
        return super.getEmail();
    }

    public void setGestorUserEmail(String email) {
        super.setEmail(email);
    }

    // Getter and setter for 'password' 
    public String getGestorUserPassword() {
        return super.getPassword();
    }

    public void setGestorUserPassword(String password) {
        super.setPassword(password);
    }

    // Getter and setter for 'registrationDate' 
    public Date getGestorUserRegistrationDate() {
        return super.getRegistrationDate();
    }

    public void setGestorUserRegistrationDate(Date registrationDate) {
        super.setRegistrationDate(registrationDate);
    }

}
