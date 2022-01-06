package com.noorteck.qa.test;

import com.noorteck.qa.utils.CommonUI;
import com.noorteck.qa.utils.ObjInitialize;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NewtourTest extends ObjInitialize {
	
	// ***Test Case One***
	
	@Given("User is on home page")
	public void user_is_on_home_page() {
		CommonUI.openBrowser("Chrome");
		CommonUI.navigate("http://demo.guru99.com/test/newtours/");
		ObjInitialize.initializeClassObj();
	}

	@When("User clicks sign on button")
	public void user_clicks_sign_on_button() {
		homePageObj.clickSignOn();
	}

	@When("User enters username")
	public void user_enters_username() {
		signOnPageObj.enterUserName("gmena730");
	}

	@When("User enters password")
	public void user_enters_password() {
		signOnPageObj.enterPassword("123456");
	}

	@When("User clicks submit button")
	public void user_clicks_submit_button() {
		signOnPageObj.clickSubmit();
	}

	@Then("User lands on succesful login page")
	public void user_lands_on_succesful_login_page() {
		signOnPageObj.isloginSuccessfulMessageDisplayed();
		signOnPageObj.isthankYouMessageDisplayed();
		
		CommonUI.quitBrowser();
	}
	
	// *** Test Case Two ***
	
	@When("User clicks on register button")
	public void user_clicks_on_register_button() {
		CommonUI.navigate("http://demo.guru99.com/test/newtours/");
		homePageObj.clickRegister();
	}

	@When("User enters first name")
	public void user_enters_first_name() {
		registerPageObj.enterFirstName("Giancarlo");
	}

	@When("User enters last name")
	public void user_enters_last_name() {
		registerPageObj.enterLastName("Mena");
	}

	@When("User enters phone number")
	public void user_enters_phone_number() {
		registerPageObj.enterPhone("7873680546");
	}

	@When("User enters email")
	public void user_enters_email() {
		registerPageObj.enterEmail("gmena730@gmail.com");
	}

	@When("User enters address")
	public void user_enters_address() {
		registerPageObj.enterAddress("RR1 Box 11961");
	}

	@When("User enters city")
	public void user_enters_city() {
		registerPageObj.enterCity("Manati");
	}

	@When("User enters state")
	public void user_enters_state() {
		registerPageObj.enterState("PR");
	}

	@When("User enters zip code")
	public void user_enters_zip_code() {
		registerPageObj.enterZipCode("00674");
	}

	@When("User selects country")
	public void user_selects_country() {
		registerPageObj.selectCountry("text", "UNITED STATES");
	}
	
	@When("User enters username2")
	public void user_enters_username2() {
		registerPageObj.enterUserName("gmena730");
	}
	
	@When("User enters password2")
	public void user_enters_password2() {
		registerPageObj.enterPassword("123456");
	}
	
	@When("User enters confirm password")
	public void user_enters_confirm_password() {
		registerPageObj.confirmPassword("123456");
	}

	@When("User click on submit button")
	public void user_click_on_submit_button() {
		registerPageObj.clickSubmit();
	}

	@Then("User lands on succesful registration page")
	public void user_lands_on_succesful_registration_page() {
		registerPageObj.isThankYouMessageDisplayed();
		
		CommonUI.quitBrowser();
	}

	// *** Test Case Scenario Three ***
	
	@When("User clicks on flight button")
	public void user_clicks_on_flight_button() {
		CommonUI.navigate("http://demo.guru99.com/test/newtours/");
		homePageObj.clickFlights();
	}

	@When("User selects type")
	public void user_selects_type() {
		flightsPageObj.clickOneWay();
	}

	@When("User selects passengers")
	public void user_selects_passengers() {
		flightsPageObj.selectPassengersDropdown("text", "3");
	}

	@When("User select departing from")
	public void user_select_departing_from() {
		flightsPageObj.selectDepartingFromDropdown("text", "New York");
	}

	@When("User selects departing month")
	public void user_selects_departing_month() {
		flightsPageObj.selectFromMonthDropdown("text", "January");
	}

	@When("User selects departing date")
	public void user_selects_departing_date() {
		flightsPageObj.selectFromDayDropdown("text", "5");
	}

	@When("User selects arriving in")
	public void user_selects_arriving_in() {
		flightsPageObj.selectArrivingIn("text", "London");
	}

	@When("User selects returning month")
	public void user_selects_returning_month() {
		flightsPageObj.selectToMonthDropdown("text", "January");
	}

	@When("User selects returning day")
	public void user_selects_returning_day() {
		flightsPageObj.selectToDayDropdown("text", "31");
	}

	@When("User selects service class")
	public void user_selects_service_class() {
		flightsPageObj.clickFirstClass();
	}

	@When("User selects airline")
	public void user_selects_airline() {
		flightsPageObj.selectAirlineDropdown("text", "Unified Airlines");
	}

	@When("User selects continue button")
	public void user_selects_continue_button() {
		flightsPageObj.clickContinue();
	}

	@Then("User lands on available flights page")
	public void user_lands_on_available_flights_page() {
		flightsPageObj.isNoSeatMessageDisplayed();
		
		CommonUI.quitBrowser();
	}
}