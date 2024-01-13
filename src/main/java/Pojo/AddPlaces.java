package Pojo;

import java.util.List;

/**
 * The AddPlaces class represents a Json payload for adding places API requests.
 * It includes information such as name, address, phone number, website, types,
 * etc.
 */
public class AddPlaces {

    /**
     * Represents the accuracy of the location.
     */
    private int accuracy;

    /**
     * Represents the language of the place.
     */
    private String language;

    /**
     * Represents the name of the place.
     */
    private String name;

    /**
     * Represents the phone number of the place.
     */
    private String phone_number;

    /**
     * Represents the address of the place.
     */
    private String address;

    /**
     * Represents the location (latitude and longitude) of the place.
     */
    private Location location;

    /**
     * Represents the website URL of the place.
     */
    private String website;

    /**
     * Represents the types or categories associated with the place.
     */
    private List<String> types;

    /**
     * Gets the list of types associated with the place.
     *
     * @return The list of types.
     */
    public List<String> getTypes() {
        return types;
    }

    /**
     * Sets the list of types associated with the place.
     *
     * @param types The list of types to set.
     */
    public void setTypes(final List<String> types) {
        this.types = types;
    }

    /**
     * Gets the website URL of the place.
     *
     * @return The website URL.
     */
    public String getWebsite() {
        return website;
    }

    /**
     * Sets the website URL of the place.
     *
     * @param website The website URL to set.
     */
    public void setWebsite(final String website) {
        this.website = website;
    }

    /**
     * Gets the language of the place.
     *
     * @return The language.
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the language of the place.
     *
     * @param language The language to set.
     */
    public void setLanguage(final String language) {
        this.language = language;
    }

    /**
     * Gets the name of the place.
     *
     * @return The name.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the place.
     *
     * @param name The name to set.
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * Gets the phone number of the place.
     *
     * @return The phone number.
     */
    public String getPhone_number() {
        return phone_number;
    }

    /**
     * Sets the phone number of the place.
     *
     * @param phone_number The phone number to set.
     */
    public void setPhone_number(final String phone_number) {
        this.phone_number = phone_number;
    }

    /**
     * Gets the address of the place.
     *
     * @return The address.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the address of the place.
     *
     * @param address The address to set.
     */
    public void setAddress(final String address) {
        this.address = address;
    }

    /**
     * Gets the location (latitude and longitude) of the place.
     *
     * @return The location.
     */
    public Location getLocation() {
        return location;
    }

    /**
     * Sets the location (latitude and longitude) of the place.
     *
     * @param location The location to set.
     */
    public void setLocation(final Location location) {
        this.location = location;
    }

    /**
     * Gets the accuracy of the location.
     *
     * @return The accuracy.
     */
    public int getAccuracy() {
        return accuracy;
    }

    /**
     * Sets the accuracy of the location.
     *
     * @param accuracy The accuracy to set.
     */
    public void setAccuracy(final int accuracy) {
        this.accuracy = accuracy;
    }
}
