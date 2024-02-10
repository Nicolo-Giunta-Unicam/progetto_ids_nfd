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
 * and animations, requires verification by a moderator, can report content, or save them.
 */
public class AuthenticatedUser extends User {

    public AuthenticatedUser(String name, String surname, String email, String password, Date registrationDate) {
        super(name, surname, email, password, registrationDate);
    }

    /**
     * Creates a post request.
     * 
     * @param post The post for which the request is created.
     */
    public void createPostRequest(Post post) {
        // Create a post request using the RequestFactory
        Request request = RequestFactory.createPostRequest(this, post);

        // TODO: Send the request to the database for moderator verification
    }

    /**
     * Creates an itinerary.
     * 
     * @param themeList The list of themes for the itinerary.
     */
    public void createItinerary(List<Theme> themeList) {
        // Create an itinerary using the provided theme list
        Itinerary itinerary = new Itinerary(this, themeList);

        // TODO: Send the request to the database
    }
}
