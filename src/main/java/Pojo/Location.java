package Pojo;

/**
 * The Location class represents the geographical coordinates (latitude and
 * longitude) of a place.
 */
public class Location {

    /**
     * Represents the latitude of the location.
     */
    private double lat;

    /**
     * Represents the longitude of the location.
     */
    private double lng;

    /**
     * Gets the latitude of the location.
     *
     * @return The latitude.
     */
    public double getLat() {
        return lat;
    }

    /**
     * Sets the latitude of the location.
     *
     * @param lat The latitude to set.
     */
    public void setLat(final double lat) {
        this.lat = lat;
    }

    /**
     * Gets the longitude of the location.
     *
     * @return The longitude.
     */
    public double getLng() {
        return lng;
    }

    /**
     * Sets the longitude of the location.
     *
     * @param lng The longitude to set.
     */
    public void setLng(final double lng) {
        this.lng = lng;
    }
}
