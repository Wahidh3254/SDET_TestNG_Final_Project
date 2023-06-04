package org.flipkartPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//img[@title='Flipkart']")
	private WebElement flipkartLogo;

	@FindBy(xpath = "//button[@class='_2KpZ6l _2doB4z']")
	private WebElement loginPopupCloseBtn;

	@FindBy(name = "q")
	private WebElement searchBox;

	public WebElement getFlipkartLogo() {
		return flipkartLogo;
	}

	public WebElement getLoginPopupCloseBtn() {
		return loginPopupCloseBtn;
	}

	public WebElement getSearchBox() {
		return searchBox;
	}
}
