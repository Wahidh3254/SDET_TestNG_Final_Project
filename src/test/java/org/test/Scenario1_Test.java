package org.test;

import org.automationPandaPages.ContactPage;
import org.automationPandaPages.HomePage;
import org.base.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Scenario1_Test extends BaseClass {
    
	@Test
    public void verifyAutomationPandaContactPage() {
        
		driver.get("https://automationpanda.com/2021/12/29/want-to-practice-test-automation-try-these-demo-sites/");
        Assert.assertEquals(driver.getTitle(), "Want to practice test automation? Try these demo sites! | Automation Panda");
        
        HomePage homePage=new HomePage(driver);
        homePage.clickOnContactTab();
        
        Assert.assertEquals(driver.getTitle(), "Contact | Automation Panda");
        
        ContactPage contactPage = new ContactPage(driver);
        contactPage.fillContactForm("Test Name", "test@example.com", "This is a test comment");
        
        Assert.assertTrue(contactPage.isMessageSent());
    }
}