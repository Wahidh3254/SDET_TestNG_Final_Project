package org.test;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.base.BaseClass;
import org.flipkartPages.HomePage;
import org.flipkartPages.ProductDetailsPage;
import org.flipkartPages.ProductsListPage;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Scenario2_Test extends BaseClass {

	@Test
	public void verifyFlipkartSearchFunctionality() {
		driver.get("https://www.flipkart.com/");

		HomePage homePage = new HomePage(driver);
		homePage.getLoginPopupCloseBtn().click();
		Assert.assertTrue(homePage.getFlipkartLogo().isDisplayed());

		homePage.getSearchBox().sendKeys("iphone 14");
		homePage.getSearchBox().sendKeys(Keys.ENTER);

		ProductsListPage productListPage = new ProductsListPage(driver);
		int noOfProducts = productListPage.getIphoneItems().size();
		System.out.println("Number of Product Displayed in the page " + noOfProducts);
		String firstProductName = productListPage.getIphoneItems().get(0).getText();
		productListPage.getIphoneItems().get(0).click();

		Set<String> allWindows=driver.getWindowHandles();
		List<String> windows=new LinkedList<String>();
		windows.addAll(allWindows);
		driver.switchTo().window(windows.get(1));
		
		ProductDetailsPage productDetailsPage = new ProductDetailsPage(driver);
		String selectedProductName = productDetailsPage.getProductName().getText();
		Assert.assertEquals(firstProductName, selectedProductName);
	}
}