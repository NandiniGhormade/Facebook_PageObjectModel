package com.fb.qa.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fb.qa.base.TestBase;
import com.fb.qa.pages.ProfilePage;

public class ProfilePageTest extends TestBase {

	ProfilePage profilePage;

	public ProfilePageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		setProperties();
		profilePage = new ProfilePage();
		driver.get("https://www.facebook.com/?sk=welcome");
		driver.findElement(By.name("email")).sendKeys("kadambarighormade@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Kadambari@28");
		driver.findElement(By.name("login")).click();
	}

	@Test(priority = 1)
	public void verifyPostsField() {
		String postField = profilePage.verifyPostsField();
		Assert.assertEquals(postField, "//span[contains(text(),'Posts')]");
	}

	@Test(priority = 2)
	public void verifyFriendField() {
		String friendsField = profilePage.verifyFriendField();
		Assert.assertEquals(friendsField, "//span[contains(text(), 'About')]");
	}

	@Test(priority = 3)
	public void verifyAboutField() {
		String aboutField = profilePage.verifyAboutField();
		Assert.assertEquals(aboutField, "//span[contains(@xpath,'1')]");
	}

	@Test(priority = 4)
	public void verifyPhotosField() {
		String photosField = profilePage.verifyPhotosField();
		Assert.assertEquals(photosField, "//span[contains(text(), 'Photos')]");
	}

	@Test(priority = 5)
	public void verifyVideosField() {
		String videosField = profilePage.verifyVideosField();
		Assert.assertEquals(videosField, "//span[contains(text(),'Videos')]");
	}

	@Test(priority = 2)
	public void verifyCheckField() {
		String checkField = profilePage.verifyCheckField();
		Assert.assertEquals(checkField, "//span[contains(text(),'Check-ins')]");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
