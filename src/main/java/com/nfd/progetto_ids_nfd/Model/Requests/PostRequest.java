package com.nfd.progetto_ids_nfd.Model.Requests;

import com.nfd.progetto_ids_nfd.Model.Contents.Post;

/*
 * This is a request for publishing a Post, it's defined by its
 * Post and other than being approved or disapproved it can also be
 * forwarded to a Gestor.
 */
public class PostRequest extends Request {
    // Property
    protected Post post; // The post associated with the request

    // Method to approve the post request
    @Override
    public void Approve() {
        // TODO Implementation of the Approve method for the post request
    }

    // Method to disapprove the post request
    @Override
    public void Disapprove() {
        // TODO Implementation of the Disapprove method for the post request
    }
}