package com.nfd.progetto_ids_nfd.Model.Users;

import java.util.Date;

import com.nfd.progetto_ids_nfd.Model.Contents.Post;
import com.nfd.progetto_ids_nfd.Model.Requests.InvitationRequest;
import com.nfd.progetto_ids_nfd.Model.Requests.Request;
import com.nfd.progetto_ids_nfd.Model.Requests.RequestFactory;
import com.nfd.progetto_ids_nfd.Model.Themes.Theme;

/*
 * CuratorUser can upload contests, events, or tourist places/services of 
 * which it has authority.
 */
public class CuratorUser extends AuthenticatedUser {

    public CuratorUser(String name, String surname, String email, String password, Date registrationDate) {
        super(name, surname, email, password, registrationDate);
    }

    /**
     * Creates a post request.
     * 
     * @param post The post for which the request is created.
     */
    @Override
    public void createPostRequest(Post post) {
        // Create a post request using the RequestFactory
        Request request = RequestFactory.createPostRequest(this, post);

        // If the user is also the curator of the chosen theme, approve the request automatically
        if (post.getRelatedTheme().getCurator().equals(this)) {
            request.approve(this);
        }

        // TODO: Send the request to the database
    }

    /**
     * Creates a theme request.
     * 
     * @param theme The theme for which the request is created.
     */
    public void createThemeRequest(Theme theme) {
        // Create a theme request using the RequestFactory
        Request request = RequestFactory.createThemeRequest(this, theme);

        // TODO: Send the request to the database
    }

    /**
     * Creates an InvitationRequest and adds it to the database.
     * 
     * @param receiver The user receiving the invitation request.
     * @param theme The theme for which the user is requesting permission to create posts.
     */
    public void createInvitationRequest(AuthenticatedUser recevier, Theme theme)
    {
        Request request = new InvitationRequest(recevier, theme);
        request.approve(this);
    }
}
