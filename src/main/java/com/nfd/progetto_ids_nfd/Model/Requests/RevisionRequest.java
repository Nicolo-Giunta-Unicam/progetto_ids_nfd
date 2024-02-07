package com.nfd.progetto_ids_nfd.Model.Requests;

import com.nfd.progetto_ids_nfd.Model.Contents.Post;

/*
 * This request is generated when a Post is reported by a User.
 * It's defined by Post and other than being approved or disapproved it can also be
 * forwarded to a Gestor.
 */
public class RevisionRequest extends Request {
    // Property
    protected Post post; // The post associated with the revision request

    // Method to approve the revision request
    @Override
    public void Approve() {
        // TODO Implementation of the Approve method for the revision request
    }

    // Method to disapprove the revision request
    @Override
    public void Disapprove() {
        // TODO Implementation of the Disapprove method for the revision request
    }
}
