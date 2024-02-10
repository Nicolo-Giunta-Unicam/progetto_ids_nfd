package com.nfd.progetto_ids_nfd.Model.Users;

import java.util.Date;
import com.nfd.progetto_ids_nfd.Model.Requests.PostRequest;
import com.nfd.progetto_ids_nfd.Model.Requests.RevisionRequest;

/*
 * ModeratorUser is an evolution of the authorized user who can examine 
 * user content and reports.
 */
public class ModeratorUser extends AuthorizedUser {
    
    public ModeratorUser(String name, String surname, String email, String password, Date registrationDate) {
        super(name, surname, email, password, registrationDate);
    }

    /**
     * Approves a post request.
     * 
     * @param postRequest The post request to be approved.
     */
    public void approvePost(PostRequest postRequest) {
        postRequest.approve(this);

    }

    /**
     * Disapproves a post request.
     * 
     * @param postRequest The post request to be disapproved.
     */
    public void disapprovePost(PostRequest postRequest) {
        postRequest.disapprove(this);
    }

    /**
     * Approves a revision request.
     * 
     * @param revisionRequest The revision request to be approved.
     */
    public void approveRevision(RevisionRequest revisionRequest) {
        revisionRequest.approve(this);
    }

    /**
     * Disapproves a revision request.
     * 
     * @param revisionRequest The revision request to be disapproved.
     */
    public void diapproveRevision(RevisionRequest revisionRequest) {
        revisionRequest.disapprove(this);
    }

    /**
     * Forwards a post request.
     * 
     * @param postRequest The post request to be forwarded.
     */
    public void forwardPost(PostRequest postRequest) {
        postRequest.forward();
    }
}
