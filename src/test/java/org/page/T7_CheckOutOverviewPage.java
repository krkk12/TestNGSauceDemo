package org.page;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class T7_CheckOutOverviewPage extends BaseClass {
	
	public T7_CheckOutOverviewPage() {
			
		PageFactory.initElements(driver, this);
		
		
	}

	
	@FindBy(xpath="//span[@class='title']")
	private WebElement checkOutOverviewTitle;

	public WebElement getCheckOutOverviewTitle() {
		return checkOutOverviewTitle;
	}
	
	@FindBy(xpath="//button[@id='finish']")
	private WebElement finishBtn;

	public WebElement getFinishBtn() {
		return finishBtn;
	}
	
	
	
	
	
	
	
	
}
