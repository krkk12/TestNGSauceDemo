package org.page;

import java.util.List;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class T4_RemoveProduct extends BaseClass {

	public T4_RemoveProduct() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//div[@class='inventory_item_price']")
	private List<WebElement> itemPricing;

	public List<WebElement> getitemPricing() {
		return itemPricing;
	}

	@FindBy(xpath = "//button[@class='btn btn_secondary btn_small cart_button']")
	private WebElement removeBtn;

	public WebElement getRemoveBtn() {
		return removeBtn;
	}

	@FindBy(xpath="//div[@class='cart_item']")
	private WebElement productTitle;


	public WebElement getProductTitle() {
		return productTitle;
	}
	
	
	
	
	
	
	
	
}
