package com.fb.qa.base;

import com.fb.qa.util.UtilityClass;
import com.fb.qa.util.WebEventListener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


public class TestBase {

	public static WebDriver driver;
	public static EventFiringWebDriver e_driver;
	public static Properties prop;
	public static EventFiringWebDriver eventFiringWebdriver;
	public static WebEventListener eventListener;

	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					"C:\\Users\\HP\\IdeaProjects\\FaceBookPageObjectModel\\src\\main\\java\\com\\fb\\qa\\config\\config.properties");
			prop.load(ip);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void initialization() {
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver","C:\\SeleiumDriver\\chromedriver.exe");
			 driver = new ChromeDriver();
		}
		else if(browserName.equals("firefox")){
			System.setProperty("webdriver.gecko.driver", "C:\\SeleiumDriver\\geckodriver.exe");	
			driver = new FirefoxDriver(); 
		}

		eventFiringWebdriver = new EventFiringWebDriver(driver);
		eventListener = new WebEventListener();
		eventFiringWebdriver.register(eventListener);
		driver = eventFiringWebdriver;

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(UtilityClass.IMPLICIT_WAIT_TIME, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(UtilityClass.PAGE_LOAD_TIME, TimeUnit.SECONDS);

		driver.get(prop.getProperty("url"));
	}
	
	public void setProperties(){
        System.setProperty("webdriver.chrome.driver", "C:\\SeleiumDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }
}
