package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class FlightsPage extends CommonUI {
	
	@FindBy(css = "input[value='oneway']")
	WebElement oneWayRadio;
	
	@FindBy(css = "select[name='passCount']")
	WebElement passengersDropdown;
	
	@FindBy(css = "select[name='fromPort']")
	WebElement departingFromDropdown;
	
	@FindBy(css = "select[name='fromMonth']")
	WebElement fromMonthDropdown;
	
	@FindBy(css = "select[name='fromDay']")
	WebElement fromDayDropdown;
	
	@FindBy(css = "select[name='toPort']")
	WebElement arrivingIn;
	
	@FindBy(css = "select[name='toMonth']")
	WebElement toMonthDropdown;
	
	@FindBy(css = "select[name='toDay']")
	WebElement toDayDropdown;
	
	@FindBy(css = "input[value='First']")
	WebElement firstClassRadio;
	
	@FindBy(css = "select[name='airline']")
	WebElement airlineDropdown;
	
	@FindBy(css = "input[name='findFlights']")
	WebElement continueButton;
	
	@FindBy(xpath = "//tbody/tr[@valign='top']/td/p[@align='left']/font[@face='Arial, Helvetica, sans-serif']/b/font[1]")
	WebElement noSeatsMessage;
	
	public FlightsPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickOneWay() {
		click(oneWayRadio);
	}
	
	public void selectPassengersDropdown(String methodName, String indexValueText) {
		selectFromDropdown(passengersDropdown, methodName, indexValueText);
	}
	
	public void selectDepartingFromDropdown(String methodName, String indexValueText) {
		selectFromDropdown(departingFromDropdown, methodName, indexValueText);
	}
	
	public void selectFromMonthDropdown(String methodName, String indexValueText) {
		selectFromDropdown(fromMonthDropdown, methodName, indexValueText);
	}
	
	public void selectFromDayDropdown(String methodName, String indexValueText) {
		selectFromDropdown(fromDayDropdown, methodName, indexValueText);
	}
	
	public void selectArrivingIn(String methodName, String indexValueText) {
		selectFromDropdown(arrivingIn, methodName, indexValueText);
	}
	
	public void selectToMonthDropdown(String methodName, String indexValueText) {
		selectFromDropdown(toMonthDropdown, methodName, indexValueText);
	}
	
	public void selectToDayDropdown(String methodName, String indexValueText) {
		selectFromDropdown(toDayDropdown, methodName, indexValueText);
	}
	
	public void clickFirstClass() {
		click(firstClassRadio);
	}
	
	public void selectAirlineDropdown(String methodName, String indexValueText) {
		selectFromDropdown(airlineDropdown, methodName, indexValueText);
	}
	
	public void clickContinue() {
		click(continueButton);
	}
	
	public void isNoSeatMessageDisplayed() {
		isDisplayed(noSeatsMessage);
	}
	
}
