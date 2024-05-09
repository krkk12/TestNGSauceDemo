package org.page;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class T8_OrderConfirmationPage extends BaseClass {

	public T8_OrderConfirmationPage() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//span[@class='title']")

	private WebElement orderConfirmationPage;

	public WebElement getOrderConfirmationPage() {
		return orderConfirmationPage;
	}

	@FindBy(xpath = "//h2[@class='complete-header']")
	private WebElement orderSuccessfulMsg;

	public WebElement getorderSuccessfulMsg() {
		return orderSuccessfulMsg;
	}

	@FindBy(id = "back-to-products")
	private WebElement backHomeBtn;

	public WebElement getOrderSuccessfulMsg() {
		return orderSuccessfulMsg;
	}

	public WebElement getBackHomeBtn() {
		return backHomeBtn;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
