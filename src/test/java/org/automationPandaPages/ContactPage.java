package org.automationPandaPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {

	public ContactPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "g3-name")
	private WebElement nameInput;

	@FindBy(id = "g3-email")
	private WebElement emailInput;

	@FindBy(id = "contact-form-comment-g3-message")
	private WebElement messageInput;

	@FindBy(xpath = "//button[@class='wp-block-button__link has-text-color has-black-color']")
	private WebElement submitButton;

	@FindBy(id = "contact-form-success-header")
	private WebElement messageSentLabel;

	public void fillContactForm(String name, String email, String comment) {
		nameInput.sendKeys(name);
		emailInput.sendKeys(email);
		messageInput.sendKeys(comment);
		submitButton.click();
	}

	public boolean isMessageSent() {
		return messageSentLabel.getText().equals("Your message has been sent");
	}
}