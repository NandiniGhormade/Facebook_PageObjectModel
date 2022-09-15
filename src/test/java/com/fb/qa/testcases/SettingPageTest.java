package com.fb.qa.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fb.qa.base.TestBase;
import com.fb.qa.pages.SettingPage;

public class SettingPageTest extends TestBase {
	
	SettingPage settingPage;
	
	public SettingPageTest(){
        super();
    }
	
    @BeforeMethod
    public void setUp(){
    	settingPage = new SettingPage();
        setProperties();
        driver.get("https://www.facebook.com/?sk=welcome");
        driver.findElement(By.name("email")).sendKeys("kadambarighormade@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("Kadambari@28");
        driver.findElement(By.name("login")).click();
    }

    @Test(priority = 1)
    public void verifyGeneralFieldOfPage(){
        String generalField = settingPage.verifyGeneralField();
        Assert.assertEquals(generalField,"//span[normalize-space()='General']");
    }
    @Test(priority = 2)
    public void verifySecurityAndPrivacyFieldOfPage(){
        String securityAndPrivacyField = settingPage.verifySecurityAndLoginField();
        Assert.assertEquals(securityAndPrivacyField,"//span[normalize-space()='Security and login']");
    }
    @Test(priority = 3)
    public void verifyFacebookInfoOfPage(){
        String facebookInfoField = settingPage.verifyYourFacebookInfoField();
        Assert.assertEquals(facebookInfoField,"//span[normalize-space()='Your Facebook information']");
    }
    @Test(priority = 4)
    public void verifyPrivacyFieldOfPage(){
        String privacyField = settingPage.verifyPrivacyField();
        Assert.assertEquals(privacyField,"//span[normalize-space()='Privacy']");
    }
    @Test(priority = 5)
    public void verifyPublicPostsOfPage(){
        String publicPostsField = settingPage.verifyPublicPostsField();
        Assert.assertEquals(publicPostsField,"//span[normalize-space()='Public posts']");
    }
    @Test(priority = 6)
    public void verifyBlockingFieldOfPage(){
        String blockingField = settingPage.verifyBlockingField();
        Assert.assertEquals(blockingField,"//span[normalize-space()='Blocking']");
    }
    @Test(priority = 7)
    public void verifyLocationFieldOfPage(){
        String locationOfField = settingPage.verifyLocationField();
        Assert.assertEquals(locationOfField,"//span[normalize-space()='Location']");
    }
 
    @Test(priority = 8)
    public void verifyStoriesofPage(){
        String storiesField = settingPage.verifyStoriesField();
        Assert.assertEquals(storiesField,"//span[normalize-space()='Stories']");
    }
    
    @Test(priority = 9)
    public void verifyProfileTaggingField() {
    	String profileTaggingField = settingPage.verifyProfileTaggingField();
        Assert.assertEquals(profileTaggingField,"//span[normalize-space()='Profile and tagging']");
    
    }
    
    @AfterMethod
	public void tearDown() {
		driver.quit();
    }
	
}