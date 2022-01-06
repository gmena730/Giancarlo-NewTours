package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class HomePage extends CommonUI {
	
	@FindBy(css = "a[href='login.php']")
	WebElement signOnButton;
	
	@FindBy(xpath = "//a[normalize-space()='REGISTER']")
	WebElement registerButton;
	
	@FindBy(css = "a[href='reservation.php']")
	WebElement flightsButton;
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickSignOn() {
		click(signOnButton);
	}
	
	public void clickRegister() {
		click(registerButton);
	}
	
	public void clickFlights() {
		click(flightsButton);
	}
	
}
