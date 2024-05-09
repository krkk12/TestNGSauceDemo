	package org.page;

import java.util.List;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class T2_ProductPage extends BaseClass {

	public T2_ProductPage() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//button[contains(text(),'Add to cart')]")
	private List<WebElement> addtocart;

	public List<WebElement> getAddtocart() {
		return addtocart;
	}
	
	
	@FindBy(id="react-burger-menu-btn")
	private WebElement sideBarOption;

	public WebElement getSideBarOption() {
		return sideBarOption;
	}

	@FindBy(xpath="//a[@id='logout_sidebar_link']")
	private WebElement logOutOption;

	public WebElement getLogOutOption() {
		return logOutOption;
	}
	
	
	
	
	
	
	
	
	
	
	
}
