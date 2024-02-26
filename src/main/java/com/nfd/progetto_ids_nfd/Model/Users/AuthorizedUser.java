package com.nfd.progetto_ids_nfd.Model.Users;

import java.util.Date;
import java.util.List;

import com.nfd.progetto_ids_nfd.Model.Contents.Itinerary;
import com.nfd.progetto_ids_nfd.Model.Contents.Post;
import com.nfd.progetto_ids_nfd.Model.Requests.ItineraryRequest;
import com.nfd.progetto_ids_nfd.Model.Requests.Request;
import com.nfd.progetto_ids_nfd.Model.Requests.RequestFactory;
import com.nfd.progetto_ids_nfd.Model.Themes.Theme;
import com.nfd.progetto_ids_nfd.Model.Utils.Enumerables.Role;

/*
 * AuthorizedUser is a user who is authorized by a moderator to publish without
 * having to ask for review each time.
 */
public class AuthorizedUser extends AuthenticatedUser {

    public AuthorizedUser(String name, String surname, String email, String password, Date registrationDate) {
        super(name, surname, email, password, registrationDate);
    }

    /**
     * Creates a post request and automatically approves it.
     * 
     * @param post The post for which the request is created.
     */
    @Override
    public void createPostRequest(Post post) {
        // Create a post request using the RequestFactory
        Request request = RequestFactory.createPostRequest(this, post);

        // Automatically approve the request
        request.approve(this);

        // TODO: Send the request to the database
    }

    /**
     * Creates an itinerary.
     * 
     * @param themeList The list of themes for the itinerary.
     */
    @Override
    public void createItinerary(List<Theme> themeList) {
        // Create an itinerary using the provided theme list
        Itinerary itinerary = new Itinerary(this, themeList);
        Request request = new ItineraryRequest(this, Role.Authorized, itinerary);
        request.approve(this);
        // TODO: Send the request to the database
    }
}
