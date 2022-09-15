package com.fb.qa.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fb.qa.base.TestBase;
import com.fb.qa.pages.HomePage;

public class HomePageTest extends TestBase {

    HomePage homePage;
//    LoginPage loginPage;
//    HomePage homePage;
//    TestUtil testUtil;

    public HomePageTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
    	 setProperties();
    	 homePage = new HomePage();
         driver.get("https://www.facebook.com/");
         driver.findElement(By.name("email")).sendKeys("kadambarighormade@gmail.com");
         driver.findElement(By.name("pass")).sendKeys("Kadambari@28");
         driver.findElement(By.name("login")).click();
//        homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
    }
//    @Test(priority = 1)
//    public void verifySearchFieldInHomePage(){
//        boolean searchField = homePage.verifySearchFieldOfHomePage();
//        Assert.assertTrue(searchField);
//    }
    @Test(priority=1)
    public void verifyHomePageTitleTest(){
        String homePageTitle = homePage.verifyHomePageTitle();
        Assert.assertEquals(homePageTitle, "Facebook","Home page title not matched");
    }
    
    @Test(priority = 1)
	public void verifySubmitbtnOfSignUpPage() {
		String findFriend = homePage.verifyFindFriends();
		Assert.assertEquals(findFriend, "Find Friend","find Friend button is working or not");
	}
    
    @Test(priority = 2)
    public void verifyWelcomeField() {
    	String welcome = homePage.verifyWelcomeField();
    	Assert.assertEquals(welcome, "//span[contains(text(),'Welcome')]");
    	 
    }
    
    @Test(priority = 3)
    public void verifyGroupsField() {
    	String groups = homePage.verifyGroupsField();
    	Assert.assertEquals(groups, "//span[contains(text(),'Groups')]");
	}
    
    @Test(priority = 4)
    public void verifyWatchField() {
    	String watch = homePage.verifyWatchField();
    	Assert.assertEquals(watch, "//span[contains(text(),'Watch')]");
	}
    
    @Test(priority = 5)
    public void verifyMemoriesField() {
    	String memories = homePage.verifyMemoriesField();
    	Assert.assertEquals(memories, "//span[contains(text(),'Memories')]");
    }
    
    @Test(priority = 6)
    public void verifyPagesField() {
    	String pages = homePage.verifyPagesField();
    	Assert.assertEquals(pages, "//span[contains(text(),'Pages')]");
	}

    public void verifyBloodDoationField() {
    	String bloodDonations = homePage.verifyBloodDoationField(); ;
    	Assert.assertEquals(bloodDonations, "//span[contains(text(),'Blood Donations')]");
    }
    
    @AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
