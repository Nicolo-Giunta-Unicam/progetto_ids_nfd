package com.nfd.progetto_ids_nfd.Model.Requests;

import com.nfd.progetto_ids_nfd.Model.Contents.Post;
import com.nfd.progetto_ids_nfd.Model.Themes.Theme;
import com.nfd.progetto_ids_nfd.Model.Users.AuthenticatedUser;
import com.nfd.progetto_ids_nfd.Model.Users.CuratorUser;
import com.nfd.progetto_ids_nfd.Model.Utils.Enumerables.Role;

/*
 * RequestFactory is the application of the factory design pattern and
 * is responsible of creating the different types of request.
 */
public class RequestFactory {
    // Method to create a PostRequest
    public static Request createPostRequest(AuthenticatedUser sender, Post post) {
        return new PostRequest(sender, Role.Moderator, post);
    }

    // Method to create a RevisionRequest
    public static Request createRevisionRequest(AuthenticatedUser sender, Post post) {
        return new RevisionRequest(sender, Role.Moderator, post);
    }

    // Method to create a RoleRequest
    public static Request createRoleRequest(AuthenticatedUser sender, Role role) {
        return new RoleRequest(sender, Role.Gestor, role);
    }

    // Method to create a ThemeRequest
    public static Request createThemeRequest(CuratorUser sender, Theme theme) {
        return new ThemeRequest(sender, Role.Gestor, theme);
    }
}
