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

   public void approve(){

   }

   public void disapprove(){
    
   }
}
