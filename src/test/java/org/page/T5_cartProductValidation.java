package org.page;

import java.util.List;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class T5_cartProductValidation extends BaseClass {

	public T5_cartProductValidation() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//div[@class='cart_item']")
	private List<WebElement> cartProductsRemaining;

	public List<WebElement> getCartProductsRemaining() {
		return cartProductsRemaining;
	}

}
