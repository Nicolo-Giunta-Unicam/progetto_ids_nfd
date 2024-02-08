package com.nfd.progetto_ids_nfd.Model.Requests;

import com.nfd.progetto_ids_nfd.Model.Contents.Post;
import com.nfd.progetto_ids_nfd.Model.Themes.Theme;
import com.nfd.progetto_ids_nfd.Model.Users.User;
import com.nfd.progetto_ids_nfd.Model.Utils.Enumerables.Role;

/*
 * RequestFactory is the application of the factory design pattern and
 * is responsible of creating the different types of request.
 */
public class RequestFactory {
    // Method to create a PostRequest
    public Request createPostRequest(User sender, Post post) {
        return new PostRequest();
    }

    // Method to create a RevisionRequest
    public Request createRevisionRequest(User sender, Post post) {
        return new RevisionRequest(); // TODO implement creation
    }

    // Method to create a RoleRequest
    public Request createRoleRequest(User sender, Role role) {
        return new RoleRequest(); // TODO implement creation
    }

    // Method to create a ThemeRequest
    public Request createThemeRequest(User sender, Theme theme) {
        return new ThemeRequest(); // TODO implement creation
    }
}
