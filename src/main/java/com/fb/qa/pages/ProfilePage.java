package com.fb.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.fb.qa.base.TestBase;

public class ProfilePage extends TestBase {

	@FindBy(xpath = "//span[contains(text(),'Posts')]")
	WebElement posts;

	@FindBy(xpath = "//span[contains(text(), 'About')]")
	WebElement about;

	@FindBy(xpath = "//span[contains(@xpath,'1')]")
	WebElement friends;

	@FindBy(xpath = "//span[contains(text(), 'Photos')]")
	WebElement photos;

	@FindBy(xpath = "//span[contains(text(),'Videos')]")
	WebElement videos;

	@FindBy(xpath = "//span[contains(text(),'Check-ins')]")
	WebElement check;

	public String verifyPostsField() {
		posts = driver.findElement(By.xpath("//span[contains(text(),'Posts')]"));
		return posts.getAttribute("xpath");
	}

	public String verifyFriendField() {
		friends = driver.findElement(By.xpath("//span[contains(text(), 'About')]"));
		return friends.getAttribute("xpath");
	}

	public String verifyAboutField() {
		about = driver.findElement(By.xpath("//span[contains(@xpath,'1')]"));
		return about.getAttribute("xpath");
	}

	public String verifyPhotosField() {
		photos = driver.findElement(By.xpath("//span[contains(text(), 'Photos')]"));
		return photos.getAttribute("xpath");
	}

	public String verifyVideosField() {
		videos = driver.findElement(By.xpath("//span[contains(text(),'Videos')]"));
		return videos.getAttribute("xpath");
	}

	public String verifyCheckField() {
		check = driver.findElement(By.xpath("//span[contains(text(),'Check-ins')]"));
		return check.getAttribute("xpath");
	}
}
