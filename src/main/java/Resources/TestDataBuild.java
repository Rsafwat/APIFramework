package Resources;

import java.util.ArrayList;
import java.util.List;

import Pojo.AddPlaces;
import Pojo.Location;

/**
 * The TestDataBuild class provides methods to build test data for adding and
 * deleting places.
 */
public class TestDataBuild {

    /**
     * Builds and returns the payload for adding a place.
     *
     * @param name     The name of the place.
     * @param language The language of the place.
     * @param address  The address of the place.
     * @return The AddPlaces object representing the payload.
     */
    public AddPlaces addPlacePayload(final String name, final String language, final String address) {

        final List<String> typesList = new ArrayList<>();
        typesList.add("shoe park");
        typesList.add("shop");
        final AddPlaces place = new AddPlaces();
        final Location location = new Location();
        location.setLat(-38.383494);
        location.setLng(33.427362);
        place.setAccuracy(50);
        place.setAddress(address);
        place.setLanguage(language);
        place.setName(name);
        place.setWebsite("http://google.com");
        place.setPhone_number("(+91) 983 893 3937");
        place.setTypes(typesList);
        place.setLocation(location);

        return place;
    }

    /**
     * Builds and returns the payload for deleting a place by placeId.
     *
     * @param placeId The placeId of the place to be deleted.
     * @return The JSON payload for deleting the place.
     */
    public String deletePlaceIdPlayload(final String placeId) {
        return "{\n" +
            "  \"place_id\": \""
            + placeId
            + "\"\n"
            +
            "}";
    }
}
