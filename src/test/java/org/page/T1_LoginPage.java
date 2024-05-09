package org.page;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class T1_LoginPage extends BaseClass {

	
	public T1_LoginPage() {
			
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath="//input[@id='user-name']")
	private WebElement username;
	public WebElement getUsername() {
		return username;
	}
	
	
	@FindBy(id="password")
	private WebElement password;
	public WebElement getPassword() {
		return password;
	}
	
	
	@FindBy(id="login-button")
	private WebElement loginBtn;
	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	@FindBy(xpath="//span[@class='title']")
	private WebElement loginValidation;
	public WebElement getLoginValidation() {
		return loginValidation;
	}
	
	
	
	
	
	
	
	
	
}
