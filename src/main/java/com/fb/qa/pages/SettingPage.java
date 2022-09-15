package com.fb.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.fb.qa.base.TestBase;

public class SettingPage extends TestBase {

	@FindBy(xpath = "//span[normalize-space()='General']")
	WebElement general;

	@FindBy(xpath = "//span[normalize-space()='Security and login']")
	WebElement securityAndLogin;

	@FindBy(xpath = "//span[normalize-space()='Your Facebook information']")
	WebElement yourFacebookInformation;

	@FindBy(xpath = "//span[normalize-space()='Privacy']")
	WebElement privacy;

	@FindBy(xpath = "//span[normalize-space()='Profile and tagging']")
	WebElement profileAndTagging;

	@FindBy(xpath = "//span[normalize-space()='Public posts']")
	WebElement publicPosts;

	@FindBy(xpath = "//span[normalize-space()='Location']")
	WebElement location;

	@FindBy(xpath = "//span[normalize-space()='Blocking']")
	WebElement blocking;

	@FindBy(xpath = "//span[normalize-space()='Stories']")
	WebElement stories;

	public String verifyGeneralField() {
		general = driver.findElement(By.xpath("//span[normalize-space()='General']"));
		return general.getTagName();
	}

	public String verifySecurityAndLoginField() {
		securityAndLogin = driver.findElement(By.xpath("//span[normalize-space()='Security and login']"));
		return securityAndLogin.getAttribute("xpath");
	}

	public String verifyYourFacebookInfoField() {
		yourFacebookInformation = driver.findElement(By.xpath("//span[normalize-space()='Your Facebook information']"));
		return yourFacebookInformation.getAttribute("xpath");
	}

	public String verifyPrivacyField() {
		privacy = driver.findElement(By.xpath("//span[normalize-space()='Privacy']"));
		return privacy.getAttribute("xpath");
	}

	public String verifyProfileTaggingField() {
		profileAndTagging = driver.findElement(By.xpath("//span[normalize-space()='Profile and tagging']"));
		return profileAndTagging.getAttribute("xpath");
	}

	public String verifyPublicPostsField() {
		publicPosts = driver.findElement(By.xpath("//span[normalize-space()='Public posts']"));
		return publicPosts.getAttribute("xpath");
	}

	public String verifyLocationField() {
		location = driver.findElement(By.xpath("//span[normalize-space()='Location']"));
		return location.getTagName();
	}

	public String verifyBlockingField() {
		blocking = driver.findElement(By.xpath("//span[normalize-space()='Blocking']"));
		return blocking.getAttribute("xpath");
	}

	public String verifyStoriesField() {
		stories = (WebElement) driver.findElement(By.xpath("//span[normalize-space()='Stories']"));
		return stories.getAttribute("xpath");
	}
}
