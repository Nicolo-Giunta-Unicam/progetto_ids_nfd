package com.nfd.progetto_ids_nfd.Model.Users;
import java.util.Date;
/*
 * User is an abstract class defined by name, surname, email, password
 * and registration Date.
 */
public abstract class User {
    protected String name;
    protected String surname;
    protected String email;
    protected String password;
    protected Date registrationDate;

    public User (String name, String surname, String email, String password, Date registrationDate)
    {
        this.name=name;
        this.surname=surname;
        this.email=email;
        this.password=password;
        this.registrationDate= registrationDate;
    }

    // Getter and setter for 'name'
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and setter for 'surname'
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    // Getter and setter for 'email'
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Getter and setter for 'password'
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Getter and setter for 'registrationDate'
    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }
    
}
