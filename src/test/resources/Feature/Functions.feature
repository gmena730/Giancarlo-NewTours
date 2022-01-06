Feature: Testing Functions

  Scenario: Verify if User is able to login with correct credentials
    Given User is on home page
    When User clicks sign on button
    And User enters username
    And User enters password
    And User clicks submit button
    Then User lands on succesful login page

  Scenario: Verify if User is able to register
    Given User is on home page
    When User clicks on register button
    And User enters first name
    And User enters last name
    And User enters phone number
    And User enters email
    And User enters address
    And User enters city
    And User enters state
    And User enters zip code
    And User selects country
    And User enters username2
    And User enters password2
    And User enters confirm password
    And User click on submit button
    Then User lands on succesful registration page

  Scenario: Verify if User can book a flight
    Given User is on home page
    When User clicks on flight button
    And User selects type
    And User selects passengers
    And User select departing from
    And User selects departing month
    And User selects departing date
    And User selects arriving in
    And User selects returning month
    And User selects returning day
    And User selects service class
    And User selects airline
    And User selects continue button
    Then User lands on available flights page
