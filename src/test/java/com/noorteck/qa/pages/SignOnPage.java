package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class SignOnPage extends CommonUI {
	
	@FindBy(css = "input[name='userName']")
	WebElement userNameField;
	
	@FindBy(css = "input[name='password']")
	WebElement passwordField;
	
	@FindBy(css = "input[value='Submit']")
	WebElement submitButton;
	
	@FindBy(css = "tbody tr td h3")
	WebElement loginSuccessfulMessage;
	
	@FindBy(css = "tbody tr td b")
	WebElement thankYouMessage;
	
	public SignOnPage() {
		PageFactory.initElements(driver, this);
	}

	
	public void enterUserName(String userName) {
		enter(userNameField, userName);
	}
	
	public void enterPassword(String password) {
		enter(passwordField, password);
	}
	
	public void clickSubmit() {
		click(submitButton);
	}
	
	public void isloginSuccessfulMessageDisplayed() {
		isDisplayed(loginSuccessfulMessage);
	}
	
	public void isthankYouMessageDisplayed() {
		isDisplayed(thankYouMessage);
	}
	
}
