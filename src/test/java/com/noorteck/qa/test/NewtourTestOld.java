package com.noorteck.qa.test;

import com.noorteck.qa.utils.CommonUI;
import com.noorteck.qa.utils.ObjInitialize;

public class NewtourTestOld extends ObjInitialize {

	public static void main(String[] args) throws InterruptedException {
		
	// *** Test Case One ***
	// 1) Open the browser
		CommonUI.openBrowser("Chrome");
	// 2) Enter the URL http://demo.guru99.com/test/newtours/
		CommonUI.navigate("http://demo.guru99.com/test/newtours/");
		
		ObjInitialize.initializeClassObj();
		
		testCaseOne();
	
	// *** Test Case Two ***
	// 1) Open the browser
	// 2) Enter the URL http://demo.guru99.com/test/newtours/	
		CommonUI.navigate("http://demo.guru99.com/test/newtours/");
		
		testCaseTwo();
		

	// *** Test Case Three ***
	// 1) Open the browser
	// 2) Enter the URL http://demo.guru99.com/test/newtours/
		CommonUI.navigate("http://demo.guru99.com/test/newtours/");

		testCaseThree();
	
		CommonUI.quitBrowser();
		
	}
	
	public static void testCaseOne() {	

	// 3) Click on SIGN-ON link
		homePageObj.clickSignOn();
	// 4) Enter username in username textbox
		signOnPageObj.enterUserName("gmena730");
	// 5) Enter password in password textbox
		signOnPageObj.enterPassword("123456");
	// 6) Click on Submit button
		signOnPageObj.clickSubmit();
	// 7) Verify “Login Successfully” messaged displayed
		signOnPageObj.isloginSuccessfulMessageDisplayed();
	// 8) Verify “Thank you for Loggin.” messaged displayed
		signOnPageObj.isthankYouMessageDisplayed();
		
	}
	
	
	public static void testCaseTwo() throws InterruptedException {
		

	// 3) Click on REGISTER link
		homePageObj.clickRegister();
	// 4) Enter first name in first name textbox
		registerPageObj.enterFirstName("Giancarlo");
	// 5) Enter last name in last name textbox
		registerPageObj.enterLastName("Mena");
	// 6) Enter phone number in phone textbox
		registerPageObj.enterPhone("7873680546");
	// 7) Enter email in email textbox
		registerPageObj.enterEmail("gmena730@gmail.com");
	// 8) Enter address in address textbox
		registerPageObj.enterAddress("RR1 Box 11961");
	// 9) Enter city in city textbox
		registerPageObj.enterCity("Manati");
	// 10) Enter state in state textbox
		registerPageObj.enterState("PR");
	// 11) Enter zipcode in postal code textbox
		registerPageObj.enterZipCode("00674");
	// 12) Select your country from country dropdown
		registerPageObj.selectCountry("text", "UNITED STATES");
	// 13) Enter username in username textbox
		registerPageObj.enterUserName("gmena730");
	// 14) Enter password in password textbox
		registerPageObj.enterPassword("123456");
	// 15) enter confirm password in confirm password textbox
		registerPageObj.confirmPassword("123456");
	// 16) Click on Submit button
		registerPageObj.clickSubmit();
	// 17) Verify “Thank you for registering” messaged displayed
		registerPageObj.isThankYouMessageDisplayed();
		
	}
	
	public static void testCaseThree() {
		
	// 3) Click on Flights tab
		homePageObj.clickFlights();
	// 4) Select One Way from Type Options
		flightsPageObj.clickOneWay();
	// 5) Select 3 from Passengers dropdown
		flightsPageObj.selectPassengersDropdown("text", "3");
	// 6) Select New York from Departing From dropdown
		flightsPageObj.selectDepartingFromDropdown("text", "New York");
	// 7) Select January from Month dropdown
		flightsPageObj.selectFromMonthDropdown("text", "January");
	// 8) Select 5 from date dropdown
		flightsPageObj.selectFromDayDropdown("text", "5");
	// 9) Select London from Arriving In dropdown
		flightsPageObj.selectArrivingIn("text", "London");
	// 10) Select January 31 from Returning date dropdown
		flightsPageObj.selectToMonthDropdown("text", "January");
		flightsPageObj.selectToDayDropdown("text", "31");
	// 11) Select First Class from Service Class Options
		flightsPageObj.clickFirstClass();
	// 12) Select Unified Airlines from Airline dropdown
		flightsPageObj.selectAirlineDropdown("text", "Unified Airlines");
	// 13) Click on Continue button
		flightsPageObj.clickContinue();
	// 14) Verify “After flight finder – No Seats Available” messaged displayed
		flightsPageObj.isNoSeatMessageDisplayed();
	}
}


/**
		--------------------------------------	INSTRUCTIONS --------------------------------------------
			
			---> Create JAVA CLASS for each page of the application
			---> Inspect the elements and store the values 
			---> Create the class constructor
			---> Create the methods
		
			---> DONT FORGET ***** 	EACH PAGE CLASS SHOULD INHERIT CommonUI Class 				*******************
			---> DONT FORGET ***** 	DECLARE PAGE CLASS OBJECT in CONSTANTS CLASS 				*******************
			---> DONT FOGET  ***** 	INITIALIZE PAGE CLASS OBJECTS IN ObjInitialize JAVA ClASS 	*******************
			---> DONT FOGET  ***** 	CHANGE JAVA VERSION TO 1.8 									*******************
			
			
			
			---> For each test case create a method then call those methods from main method. 
			---> DONT FORGET *****	Refer to the INSTRUCTION PDF file for the test cases to automate **************
			
			---> ONCE FINISHED AUTOMATING Create Repository in GitHub and push to GitHub
			---> Once pushed add US to the project then send picture in MENTORS GROUP CHAT
						 Crystal: 		--> Koritzerc23@gmail.com
						 Helen: 		--> Hnbehining@gmail.com
						 Ahmad: 		--> a.stanikzai77@gmail.com
						 Fahim: 		--> NTKBatch5


*/