package org.flipkartPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsListPage {

	public ProductsListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='_4rR01T']")
	private List<WebElement> iphoneItems;

	public List<WebElement> getIphoneItems() {
		return iphoneItems;
	}
}
