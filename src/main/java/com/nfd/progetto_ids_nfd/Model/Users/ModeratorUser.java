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
