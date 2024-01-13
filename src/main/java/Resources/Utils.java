package Resources;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

/**
 * The Utils class provides utility methods for handling REST requests and
 * responses.
 */
public class Utils {

    /**
     * Represents the RequestSpecification used for REST requests.
     */
    public static RequestSpecification reqSpecification;

    /**
     * Creates and returns the RequestSpecification for REST requests.
     *
     * @return The RequestSpecification.
     * @throws IOException If an I/O error occurs.
     */
    public RequestSpecification requestSpecification() throws IOException {
        if (reqSpecification == null) {
            final PrintStream log = new PrintStream(new FileOutputStream("TestLogging.txt"));
            reqSpecification = new RequestSpecBuilder()
                .setBaseUri(getGlobalPropertiesValues("baseUrl"))
                .addQueryParam("key", "qaclick123")
                .addFilter(RequestLoggingFilter.logRequestTo(log))
                .addFilter(ResponseLoggingFilter.logResponseTo(log))
                .setContentType(ContentType.JSON)
                .build();

            return reqSpecification;
        }
        return reqSpecification;
    }

    /**
     * Reads the value of a key from the global properties file.
     *
     * @param key The key for which the value is to be retrieved.
     * @return The value associated with the key.
     * @throws IOException If an I/O error occurs.
     */
    public static String getGlobalPropertiesValues(final String key) throws IOException {
        final Properties properties = new Properties();
        properties.load(new FileInputStream("src/main/resources/global.properties"));
        return properties.getProperty(key);
    }

    /**
     * Extracts a value from the JSON response using a provided key.
     *
     * @param response The REST response.
     * @param key      The key for which the value is to be extracted.
     * @return The extracted value.
     */
    public String getJsonPath(final Response response, final String key) {
        final String res = response.asString();
        final JsonPath js = new JsonPath(res);
        return js.get(key).toString();
    }
}
