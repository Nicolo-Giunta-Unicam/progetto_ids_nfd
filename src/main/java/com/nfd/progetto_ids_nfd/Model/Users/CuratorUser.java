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

    public void createPostRequest(){
        // TODO
    }

    public void createActivityRequest(){
        // TODO
    }
}
