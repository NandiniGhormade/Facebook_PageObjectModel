package com.fb.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fb.qa.base.TestBase;
import java.util.logging.Logger;

public class LoginPage extends TestBase {

	Logger logger;
	
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(name="pass")
	WebElement password;
	
	@FindBy(xpath="//button[@name='login']")
	WebElement loginBtn;

    @FindBy(xpath = "//a[contains(text(),'Create New Account')]")
    WebElement signUpBtn;

    public LoginPage() {
        PageFactory.initElements(driver, this);
        logger = Logger.getLogger(LoginPage.class.getName());
    }
    
    public String verifyPageTitle() {
        logger.info(".....Verify the Page Title.....");
        return driver.getTitle();
    }
    
    public HomePage login(String username, String password) {
        logger.info(".....login.....");
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        /* click on login button*/
        loginBtn.click();
        return new HomePage();
    }
}

