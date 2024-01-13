package Resources;

/**
 * The APIResources enum represents a collection of API endpoints for a mapping
 * service. It includes constants for adding, getting, and deleting places.
 */
public enum APIResources {

    /**
     * Represents the API endpoint for adding a place.
     */
    addPlaceAPI("/maps/api/place/add/json"),

    /**
     * Represents the API endpoint for getting place information.
     */
    getPlaceAPI("/maps/api/place/get/json"),

    /**
     * Represents the API endpoint for deleting a place.
     */
    deletePlaceAPI("/maps/api/place/delete/json");

    /**
     * Represents the resource string associated with the API endpoint.
     */
    private final String resource;

    /**
     * Constructor for APIResources enum.
     *
     * @param resource The resource string associated with the API endpoint.
     */
    APIResources(final String resource) {
        this.resource = resource;
    }

    /**
     * Gets the resource string associated with the API endpoint.
     *
     * @return The resource string.
     */
    public String getResource() {
        return resource;
    }

}
