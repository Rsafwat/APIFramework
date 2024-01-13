package StepDefinitions;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

import java.io.IOException;

import Resources.APIResources;
import Resources.TestDataBuild;
import Resources.Utils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

/**
 * The StepDefinition class defines the step definitions for Cucumber scenarios
 * related to API testing.
 */
public class StepDefinition extends Utils {
    RequestSpecification res;
    ResponseSpecification resSpec;
    Response response;
    static String placeID;
    TestDataBuild testData = new TestDataBuild();

    /**
     * Sets up the request specification with the payload for adding a place.
     *
     * @param name     The name of the place.
     * @param language The language of the place.
     * @param address  The address of the place.
     * @throws IOException If an I/O error occurs.
     */
    @Given("Add Place Payload with {string} {string} {string}")
    public void addPlacePayload(final String name, final String language, final String address) throws IOException {
        res = given().spec(requestSpecification()).body(testData.addPlacePayload(name, language, address));
    }

    /**
     * Calls the specified API with the given HTTP request method.
     *
     * @param resource  The API resource.
     * @param apiMethod The HTTP request method (POST, GET, DELETE).
     */
    @When("User calls {string} with {string} http request")
    public void userCallsApiWithPostRequest(final String resource, final String apiMethod) {
        final APIResources apiResources = APIResources.valueOf(resource);
        System.out.println(apiResources.getResource());
        resSpec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();

        if (apiMethod.equalsIgnoreCase("POST")) {
            response = res.when().post(apiResources.getResource());
            placeID = getJsonPath(response, "place_id");
        } else if (apiMethod.equalsIgnoreCase("GET")) {
            response = res.when().get(apiResources.getResource());
        } else if (apiMethod.equalsIgnoreCase("DELETE")) {
            response = res.when().delete(apiResources.getResource());
        }
    }

    /**
     * Verifies the status code of the API response.
     *
     * @param expectedStatusCode The expected status code.
     */
    @Then("The API call got success with status code {int}")
    public void verifyStatusCode(final int expectedStatusCode) {
        assertEquals(response.getStatusCode(), 200);
    }

    /**
     * Verifies a specific key in the response body.
     *
     * @param key            The key in the response body.
     * @param expectedStatus The expected value of the key.
     */
    @And("{string} in the response body is {string}")
    public void verifyStatusInResponseBody(final String key, final String expectedStatus) {
        assertEquals(getJsonPath(response, key), expectedStatus);
    }

    /**
     * Sets up the request specification with the payload for getting place
     * information.
     *
     * @throws IOException If an I/O error occurs.
     */
    @Given("Get Place Payload")
    public void getPlacePayload() throws IOException {
        res = given().spec(requestSpecification()).queryParam("place_id", placeID);
    }

    /**
     * Sets up the request specification with the payload for deleting a place.
     *
     * @throws IOException If an I/O error occurs.
     */
    @Given("DeletePlace payload")
    public void deletePlacePayload() throws IOException {
        res = given().spec(requestSpecification()).body(testData.deletePlaceIdPlayload(placeID));
    }

    /**
     * Verifies that the place id created maps to the expected value.
     *
     * @param expectedValue The expected value for the place id.
     * @throws IOException If an I/O error occurs.
     */
    @And("Verify place id that is created maps to {string}")
    public void verifyPlaceIdMapsToName(final String expectedValue) throws IOException {
        assertEquals(getJsonPath(response, "name"), expectedValue);
    }
}
