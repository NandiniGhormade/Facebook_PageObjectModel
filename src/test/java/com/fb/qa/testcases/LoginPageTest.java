package com.fb.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.fb.qa.base.TestBase;
import com.fb.qa.pages.HomePage;
import com.fb.qa.pages.LoginPage;
import com.fb.qa.util.UtilityClass;
import org.apache.log4j.Logger;

public class LoginPageTest extends TestBase {
	
	LoginPage loginPage;
    HomePage homepage;
    String sheetName = "Login";
    Logger logger;

    public LoginPageTest() {
        super();
        logger = Logger.getLogger(LoginPageTest.class.getName());

    }

    @BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new LoginPage();	
	}
	
    @Test(priority = 1)
    public void loginPageTitleTest() {
        loginPage = new LoginPage();
        String loginPageTitle = loginPage.verifyPageTitle();
        Assert.assertEquals(loginPageTitle, "Facebook – log in or sign up", loginPageTitle);
    }
    
      @Test
    public void loginTest() {
          logger.info("login start...");
        loginPage = new LoginPage();
//        homepage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
    }
    @DataProvider
    public Object[][] getLoginTestdata() {
        return UtilityClass.getTestData(sheetName);
    }

    @Test(priority = 2, dataProvider = "getLoginTestdata")
    public void loginTest(String username, String password) {
    	logger.warn("warning");
        loginPage = new LoginPage();
        homepage = loginPage.login(username, password);
    }
    @AfterMethod
    public void tearDown() {

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}