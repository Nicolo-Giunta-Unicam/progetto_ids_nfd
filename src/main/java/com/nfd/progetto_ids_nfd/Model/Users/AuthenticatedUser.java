package com.nfd.progetto_ids_nfd.Model.Users;
import java.util.Date;
import java.util.List;
import com.nfd.progetto_ids_nfd.Model.Contents.Itinerary;
import com.nfd.progetto_ids_nfd.Model.Contents.Post;
import com.nfd.progetto_ids_nfd.Model.Requests.Request;
import com.nfd.progetto_ids_nfd.Model.Requests.RequestFactory;
import com.nfd.progetto_ids_nfd.Model.Themes.Theme;
/*
 * AuthenticatedUser can publish text and multimedia content related to existing themes 
 * and animations, requires verification by moderator, can report content or save them.
 */
public class AuthenticatedUser extends User {

    public AuthenticatedUser(String name, String surname, String email, String password, Date registrationDate) {
        super(name, surname, email, password, registrationDate);

    }

    public void createPostRequest(Post post){
        Request request = RequestFactory.createPostRequest(this, post);
        
    }

    public void createItinerary(List<Theme> themeList){
        Itinerary itinerary = new Itinerary(this, themeList);
        // TODO send request to DB
    }
    
}
