package org.page;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class T6_CheckOutPage extends BaseClass {

	public T6_CheckOutPage() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//button[@id='checkout']")
	private WebElement checkOutBtn;

	public WebElement getCheckOutBtn() {
		return checkOutBtn;
	}
	
	@FindBy(xpath = "//span[@class='title']")
	private WebElement checkOutPageValidation;
	
	public WebElement getcheckOutPageValidation() {
		return checkOutPageValidation;
	}

	@FindBy(id = "first-name")
	private WebElement firstName;
	
	public WebElement getFirstName() {
		return firstName;
	}
	
	@FindBy(id = "last-name")
	private WebElement lastName;
	
	public WebElement getLastName() {
		return lastName;
	}
	
	@FindBy(id = "postal-code")
	private WebElement postalCode;
	
	public WebElement getPostalCode() {
		return postalCode;
	}
	
	@FindBy(id = "continue")
	private WebElement continueBtn;
	
	public WebElement getContinueBtn() {
		return continueBtn;
	}
	
	
	
	
	
	
}
