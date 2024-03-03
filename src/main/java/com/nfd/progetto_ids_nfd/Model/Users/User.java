package com.nfd.progetto_ids_nfd.Model.Users;

import java.util.Date;

/**
 * User is an abstract class defined by name, surname, email, password,
 * and registration Date.
 */
public abstract class User {
    protected String name; // The name of the user
    protected String surname; // The surname of the user
    protected String email; // The email address of the user
    protected String password; // The password of the user
    protected Date registrationDate; // The registration date of the user

    /**
     * Constructs a User object with specified attributes.
     * @param name The name of the user
     * @param surname The surname of the user
     * @param email The email address of the user
     * @param password The password of the user
     * @param registrationDate The registration date of the user
     */
    public User (String name, String surname, String email, String password, Date registrationDate)
    {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.registrationDate = registrationDate;
    }

    /**
     * Gets the name of the user.
     * @return The name of the user
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the user.
     * @param name The name to be set for the user
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the surname of the user.
     * @return The surname of the user
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Sets the surname of the user.
     * @param surname The surname to be set for the user
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * Gets the email address of the user.
     * @return The email address of the user
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email address of the user.
     * @param email The email address to be set for the user
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets the password of the user.
     * @return The password of the user
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the password of the user.
     * @param password The password to be set for the user
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Gets the registration date of the user.
     * @return The registration date of the user
     */
    public Date getRegistrationDate() {
        return registrationDate;
    }

    /**
     * Sets the registration date of the user.
     * @param registrationDate The registration date to be set for the user
     */
    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }
}
