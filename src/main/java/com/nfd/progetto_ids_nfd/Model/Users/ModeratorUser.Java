package com.nfd.progetto_ids_nfd.Model.Users;
import java.util.Date;
/*
 * ModeratorUser evolution of the authorized user who can also examine 
 * user content and reports.
 */
public class ModeratorUser extends AuthorizedUser {
    
    public ModeratorUser(String name, String surname, String email, String password, Date registrationDate) {
        super(name, surname, email, password, registrationDate);
    }

      // Getter and setter for 'name' 
      public String getModeratorUserName() {
        return super.getName();
    }

    public void setModeratorUserName(String name) {
        super.setName(name);
    }

    // Getter and setter for 'surname' 
    public String getModeratorUserSurname() {
        return super.getSurname();
    }

    public void setModeratorUserSurname(String surname) {
        super.setSurname(surname);
    }

    // Getter and setter for 'email' 
    public String getModeratorUserEmail() {
        return super.getEmail();
    }

    public void setModeratorUserEmail(String email) {
        super.setEmail(email);
    }

    // Getter and setter for 'password' 
    public String getModeratorUserPassword() {
        return super.getPassword();
    }

    public void setModeratorUserPassword(String password) {
        super.setPassword(password);
    }

    // Getter and setter for 'registrationDate' 
    public Date getModeratorUserRegistrationDate() {
        return super.getRegistrationDate();
    }

    public void setModeratorUserRegistrationDate(Date registrationDate) {
        super.setRegistrationDate(registrationDate);
    }

    
    public void approvePost(){
        // TODO
    }

    public void disapprovePost(){
        // TODO
    }

    public void submitPost(){
        // TODO
    }
}
