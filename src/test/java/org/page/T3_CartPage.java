package org.page;

import java.util.List;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class T3_CartPage extends BaseClass {

	public T3_CartPage() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath="//a[@class='shopping_cart_link']")
	private WebElement cartLogo;

	public WebElement getCartLogo() {
		return cartLogo;
	}

	@FindBy(xpath="//div[@class='cart_item']")
	private List<WebElement> noOfCartItems;

	public List<WebElement> getNoOfCartItems() {
		return noOfCartItems;
	}
	
	
	
}
