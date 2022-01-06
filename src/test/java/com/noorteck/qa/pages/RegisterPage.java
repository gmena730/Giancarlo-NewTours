package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class RegisterPage extends CommonUI {
	
	@FindBy(css = "input[name='firstName']")
	WebElement firstNameField;
	
	@FindBy(css = "input[name='lastName']")
	WebElement lastNameField;
	
	@FindBy(css = "input[name='phone']")
	WebElement phoneField;
	
	@FindBy(css = "#userName")
	WebElement emailField;
	
	@FindBy(css = "input[name='address1']")
	WebElement addressField;
	
	@FindBy(css = "input[name='city']")
	WebElement cityField;
	
	@FindBy(css = "input[name='state']")
	WebElement stateField;
	
	@FindBy(css = "input[name='postalCode']")
	WebElement zipCodeField;
	
	@FindBy(css = "select[name='country']")
	WebElement countryDropdown;
	
	@FindBy(css = "#email")
	WebElement userNameField;
	
	@FindBy(css = "input[name='password']")
	WebElement passwordField;
	
	@FindBy(css = "input[name='confirmPassword']")
	WebElement confirmPasswordField;
	
	@FindBy(css = "input[name='submit']")
	WebElement submitButton;
	
	@FindBy(xpath = "//*[contains(text(), 'Thank you for registering.')]")
	WebElement thankYouMessage;
	
	
	public RegisterPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void enterFirstName(String firstName) {
		enter(firstNameField, firstName);
	}
	
	public void enterLastName(String lastName) {
		enter(lastNameField, lastName);
	}
	
	public void enterPhone(String phone) {
		enter(phoneField, phone);
	}
	
	public void enterEmail(String email) {
		enter(emailField, email);
	}
	
	public void enterAddress(String address) {
		enter(addressField, address);
	}
	
	public void enterCity(String city) {
		enter(cityField, city);
	}
	
	public void enterState(String state) {
		enter(stateField, state);
	}
	
	public void enterZipCode(String zipCode) {
		enter(zipCodeField, zipCode);
	}
	
	public void selectCountry(String methodName, String indexValueText) {
		selectFromDropdown(countryDropdown, methodName, indexValueText);
	}
	
	public void enterUserName(String userName) {
		enter(userNameField, userName);
	}
	
	public void enterPassword(String password) {
		enter(passwordField, password);
	}
	
	public void confirmPassword(String confirmPassword) {
		enter(confirmPasswordField, confirmPassword);
	}
	
	public void clickSubmit() {
		click(submitButton);
	}
	
	public void isThankYouMessageDisplayed() {
		isDisplayed(thankYouMessage);
	}
	
}
