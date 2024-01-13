
Feature: Validating place APIs
@AddPlace @regression
 Scenario Outline: Verify if places is being added successfully using AddPlaceAPI
    Given Add Place Payload with "<name>" "<language>" "<address>"
    When User calls "addPlaceAPI" with "post" http request
    Then The API call got success with status code 200
    And "status" in the response body is "OK" 
    And "scope" in the response body is "APP" 
    
    Examples: 
        |name   | language | address           |
        |AAhouse| English  | World cross center|
       # |BBhouse| French   | Sea cross center  |
@GetPlace @regression
 Scenario Outline: Verify that the added places is retrieved  successfully using getPlaceAPI
    Given Get Place Payload
    When User calls "getPlaceAPI" with "get" http request
    Then The API call got success with status code 200
    And Verify place id that is created maps to "<name>"
    
    Examples: 
        |name   |
        |AAhouse| 
  
      
      
@DeletePlace @regression
Scenario: Verify that the added places can be deleted successfully
    Given DeletePlace payload
    When User calls "deletePlaceAPI" with "delete" http request
    Then The API call got success with status code 200
    And "status" in the response body is "OK" 
   