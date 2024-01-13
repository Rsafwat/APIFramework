package StepDefinitions;

import java.io.IOException;

import io.cucumber.java.Before;

public class Hooks {

    @Before("@DeletePlace")

    public void BeforeDeleteScienrio() throws IOException {
        if (StepDefinition.placeID == null) {
            final StepDefinition stepDefinition = new StepDefinition();
            stepDefinition.addPlacePayload("Shetty", "French", "Aisa");
            stepDefinition.userCallsApiWithPostRequest("addPlaceAPI", "post");
        }
    }
}
