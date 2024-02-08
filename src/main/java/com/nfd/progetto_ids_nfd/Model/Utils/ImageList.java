package com.nfd.progetto_ids_nfd.Model.Utils;

import java.util.ArrayList;
import java.util.List;

public class ImageList {
    private List<Image> images;

    public ImageList() {
        this.images = new ArrayList<>();
    }

    // Add an image to the list
    public void addImage(Image image) {
        images.add(image);
    }

    // Remove an image from the list
    public void removeImage(Image image) {
        images.remove(image);
    }

    // Get all images in the list
    public List<Image> getImages() {
        return images;
    }

    // Get the number of images in the list
    public int size() {
        return images.size();
    }
}

