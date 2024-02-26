package com.nfd.progetto_ids_nfd.Model.Requests;

import com.nfd.progetto_ids_nfd.Model.Contents.Post;
import com.nfd.progetto_ids_nfd.Model.Themes.Theme;
import com.nfd.progetto_ids_nfd.Model.Users.AuthenticatedUser;
import com.nfd.progetto_ids_nfd.Model.Users.CuratorUser;
import com.nfd.progetto_ids_nfd.Model.Utils.Enumerables.Role;

/**
 * RequestFactory is the application of the factory design pattern and
 * is responsible for creating the different types of requests.
 */
public class RequestFactory {
    
    /**
     * Creates a PostRequest object.
     * 
     * @param sender The authenticated user who sends the request.
     * @param post The post associated with the request.
     * @return A PostRequest object.
     */
    public static Request createPostRequest(AuthenticatedUser sender, Post post) {
        return new PostRequest(sender, Role.Moderator, post);
    }

    /**
     * Creates a RevisionRequest object.
     * 
     * @param sender The authenticated user who sends the request.
     * @param post The post associated with the request.
     * @return A RevisionRequest object.
     */
    public static Request createRevisionRequest(AuthenticatedUser sender, Post post) {
        return new RevisionRequest(sender, Role.Moderator, post);
    }

    /**
     * Creates a RoleRequest object.
     * 
     * @param sender The authenticated user who sends the request.
     * @param role The role requested.
     * @return A RoleRequest object.
     */
    public static Request createRoleRequest(AuthenticatedUser sender, Role role) {
        return new RoleRequest(sender, Role.Gestor, role);
    }

    /**
     * Creates a ThemeRequest object.
     * 
     * @param sender The curator user who sends the request.
     * @param theme The theme associated with the request.
     * @return A ThemeRequest object.
     */
    public static Request createThemeRequest(CuratorUser sender, Theme theme) {
        return new ThemeRequest(sender, Role.Gestor, theme);
    }

    /**
     * Creates an InvitationRequest object.
     * 
     * @param sender The authenticated user who sends the request.
     * @param theme The theme associated with the request.
     * @return An InvitationRequest object.
     */
    public static Request createInvitationRequest(AuthenticatedUser sender, Theme theme) {
        return new InvitationRequest(sender, theme);
    }
}
