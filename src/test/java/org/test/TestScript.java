package org.test;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.page.T3_CartPage;
import org.page.T7_CheckOutOverviewPage;
import org.page.T6_CheckOutPage;
import org.page.T1_LoginPage;
import org.page.T8_OrderConfirmationPage;
import org.page.T2_ProductPage;
import org.page.T4_RemoveProduct;
import org.page.T5_cartProductValidation;
import org.testng.annotations.Test;

public class TestScript extends BaseClass {

	public static BaseClass b = new BaseClass();
	public static T1_LoginPage page;
	public static T2_ProductPage productPage;
	public static T3_CartPage cartPage;
	public static T4_RemoveProduct removeProduct;
	public static T5_cartProductValidation productValidation;
	public static T6_CheckOutPage checkOutPage;
	public static T7_CheckOutOverviewPage overviewPage;
	public static T8_OrderConfirmationPage confirmationPage;

	@Test(priority = 1)
	private void urlLaunch() throws IOException, InterruptedException {
		b.getDriver(b.readExcell(0, 0));
		b.getUrl(b.readExcell(0, 1));
		b.maximize();

	}

	@Test(priority = 2)
	private void logIn() throws IOException {

		page = new T1_LoginPage();
		page.getUsername().sendKeys(b.readExcell(0, 2));
		page.getPassword().sendKeys(b.readExcell(0, 3));
		page.getLoginBtn().click();

	}

	@Test(priority = 3)
	private void userValidation() {

		String title = page.getLoginValidation().getText();
		if (title.equals("Products")) {
			System.out.println("LogIn Validation Successful");
		} else {
			System.out.println("LogIn Failed");
		}

	}

	@Test(priority = 4)
	private void addToCart() throws InterruptedException {
		productPage = new T2_ProductPage();
		List<WebElement> addtocart = productPage.getAddtocart();
//		for (int i = 0; i < addtocart.size(); i++) {
//			addtocart.get(i).click();
//		}

		for (WebElement add : addtocart) {
			add.click();
		}

	}

	@Test(priority = 5)
	private void cartValidation() {
		cartPage = new T3_CartPage();
		cartPage.getCartLogo().click();
		List<WebElement> noOfCartItems = cartPage.getNoOfCartItems();
		if (noOfCartItems.size() == 6) {
			System.out.println("Cart Items Validated");
		}

	}

	@Test(priority = 6)

	private void removeItem() throws InterruptedException {

		removeProduct = new T4_RemoveProduct();

		// getting prices of all added products
		List<WebElement> pricingList = removeProduct.getitemPricing();

		for (WebElement priceOfEachProduct : pricingList) {
			String priceWithCurrency = priceOfEachProduct.getText();
			String price = priceWithCurrency.substring(1);
//			int pricee = Integer.parseInt(price);
			double pricee = Double.parseDouble(price);
//			System.out.println(pricee);

			// removing two high priced items
			if (pricee > 27) {

				removeProduct.getRemoveBtn().click();
//				WebElement productTitle = removeProduct.getProductTitle();

			} else {
//				System.out.println(pricee+"L");
			}

		}

	}

	@Test(priority = 7)
	private void cartProductValidating() {

		productValidation = new T5_cartProductValidation();

		List<WebElement> cartProductsRemaining = productValidation.getCartProductsRemaining();

		if (cartProductsRemaining.size() == 4) {

			System.out.println("Cart Now Has 4 Items");
		}

	}

	@Test(priority = 8)
	private void clickcheckOutBtn() {

		checkOutPage = new T6_CheckOutPage();

		checkOutPage.getCheckOutBtn().click();

	}

	@Test(priority = 9)
	private void checkOutPageValidating() {

		checkOutPage = new T6_CheckOutPage();

		String text = checkOutPage.getcheckOutPageValidation().getText();

		if (text.equals("Checkout: Your Information")) {

			System.out.println("CheckOutPage is validated");
		} else {

			System.out.println("checkoutpage not validated");
		}

	}

	@Test(priority = 10)
	private void fillInCheckOutDetails() throws IOException {

		checkOutPage = new T6_CheckOutPage();

		checkOutPage.getFirstName().sendKeys(b.readExcell(0, 4));
		checkOutPage.getLastName().sendKeys(b.readExcell(0, 5));
		checkOutPage.getPostalCode().sendKeys(b.readExcell(0, 6));
		checkOutPage.getContinueBtn().click();

	}

	@Test(priority = 11)
	private void checkOutOverview() {

		overviewPage = new T7_CheckOutOverviewPage();

		String text = overviewPage.getCheckOutOverviewTitle().getText();

		if (text.equals("Checkout: Overview")) {

			System.out.println("CheckOut overview page is validated successfully");

		} else {
			System.out.println("checkoutOverview page not validated");
		}

		overviewPage.getFinishBtn().click();

	}

	@Test(priority = 12)
	private void orderConfirmation() {

		confirmationPage = new T8_OrderConfirmationPage();

		if (confirmationPage.getOrderConfirmationPage().getText().equals("Checkout: Complete!")) {
			System.out.println("Order Confirmation page validated Successfully");

		} else {
			System.out.println("Order Confirmation page  NOT validated");

		}

		if (confirmationPage.getorderSuccessfulMsg().getText().equals("Thank you for your order!")) {
			System.out.println("Order placed successfully");
		} else {
			System.out.println("Order placed NOT placed");

		}

	}

	@Test(priority = 13)
	private void backHome() throws InterruptedException {

		confirmationPage = new T8_OrderConfirmationPage();
		productPage = new T2_ProductPage();

		confirmationPage.getBackHomeBtn().click();

		b.sleep(2000);

		productPage.getSideBarOption().click();
		b.sleep(2000);
		productPage.getLogOutOption().click();

	}

	@Test(priority = 14)

	private void validateUserLoggedOut() {

		page = new T1_LoginPage();

		if (page.getLoginBtn().isDisplayed()) {

			System.out.println("User Logout validated successfully");

		} else {
			System.out.println("User Logout NOT validated");

		}

	}

}
