// Define the package for the class
package com.nfd.progetto_ids_nfd.Model.Utils;

/**
 * This class represents geographical coordinates using latitude and longitude.
 * It may include functionalities related to OpenStreetMap (OSM) compatibility.
 */
public class Coordinates {
    // Instance variables to store latitude and longitude
    private double latitude; // The latitude of the coordinates
    private double longitude; // The longitude of the coordinates

    /**
     * Constructor to initialize the coordinates.
     * @param latitude The latitude value of the coordinates
     * @param longitude The longitude value of the coordinates
     */
    public Coordinates(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    /**
     * Gets the latitude of the coordinates.
     * @return The latitude value of the coordinates
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     * Gets the longitude of the coordinates.
     * @return The longitude value of the coordinates
     */
    public double getLongitude() {
        return longitude;
    } 

    /**
     * Sets the coordinates to the specified latitude and longitude.
     * @param latitude The latitude value to set
     * @param longitude The longitude value to set
     */
    public void setCoordinates(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    /**
     * Calculates the distance between two coordinates using the Haversine formula.
     * @param c1 The first set of coordinates
     * @param c2 The second set of coordinates
     * @return The distance between the two sets of coordinates in kilometers
     */
    public static double calculateDistance(Coordinates c1, Coordinates c2) {

        // Radius of the Earth in kilometers
        final double EARTH_RADIUS = 6371.0;

        // Convert latitude and longitude from degrees to radians
        double c1LatRad = Math.toRadians(c1.getLatitude());
        double c1LonRad = Math.toRadians(c1.getLongitude());
        double c2LatRad = Math.toRadians(c2.getLatitude());
        double c2LonRad = Math.toRadians(c2.getLongitude());

        // Calculate differences in coordinates
        double latDiff = c2LatRad - c1LatRad;
        double lonDiff = c2LonRad - c1LonRad;

        // Haversine formula, because we're not in a 2D model
        double a = Math.sin(latDiff / 2) * Math.sin(latDiff / 2) + Math.cos(c1LatRad) * Math.cos(c2LatRad)
                 * Math.sin(lonDiff / 2) * Math.sin(lonDiff / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        // Calculate the distance
        double distance = EARTH_RADIUS * c;

        return distance;
    }
}
