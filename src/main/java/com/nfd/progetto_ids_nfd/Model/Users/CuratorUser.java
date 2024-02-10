package com.nfd.progetto_ids_nfd.Model.Users;
import java.util.Date;

import com.nfd.progetto_ids_nfd.Model.Contents.Post;
import com.nfd.progetto_ids_nfd.Model.Requests.Request;
import com.nfd.progetto_ids_nfd.Model.Requests.RequestFactory;
import com.nfd.progetto_ids_nfd.Model.Themes.Theme;
/*
 * CuratorUser can upload contests, events or tourist places/services of 
 * which it has authority.
 */
public class CuratorUser extends AuthenticatedUser {

    public CuratorUser(String name, String surname, String email, String password, Date registrationDate) {
        super(name, surname, email, password, registrationDate);
    }

    @Override
    public void createPostRequest(Post post){
        Request request = RequestFactory.createPostRequest(this, post);
        // If the user is also the curator of the choosen theme approve automatically the request
        if(post.getRelatedTheme().getCurator().equals(this)) 
            request.approve(this);

        // TODO send request to DB
    }

    public void createThemeRequest(Theme theme){
        Request request = RequestFactory.createThemeRequest(this, theme);
        // TODO send request to DB
    }
}
