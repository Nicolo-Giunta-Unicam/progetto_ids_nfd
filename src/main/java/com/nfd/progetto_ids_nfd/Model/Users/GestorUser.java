package com.nfd.progetto_ids_nfd.Model.Users;

import java.util.Date;
import com.nfd.progetto_ids_nfd.Model.Requests.Request;

/*
 * GestorUser deals with reviewing content, reporting, providing roles 
 * to users, higher level.
 */
public class GestorUser extends User {

    public GestorUser(String name, String surname, String email, String password, Date registrationDate) {
        super(name, surname, email, password, registrationDate);
    }

    /**
     * Approves a request.
     * 
     * @param request The request to be approved.
     */
    public void approve(Request request) {
        request.approve(this);
    }

    /**
     * Disapproves a request.
     * 
     * @param request The request to be disapproved.
     */
    public void disapprove(Request request) {
        request.disapprove(this);
    }
}
