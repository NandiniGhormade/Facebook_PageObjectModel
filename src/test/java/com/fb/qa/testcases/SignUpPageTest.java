package com.fb.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fb.qa.base.TestBase;
import com.fb.qa.pages.SignUpPage;

public class SignUpPageTest extends TestBase {
	
	SignUpPage signUpPage;

	public SignUpPageTest(){
		super();
	}

	@BeforeMethod
	public void setUp() {
		setProperties();
		driver.get("https://www.facebook.com/signup");
		signUpPage = new SignUpPage();	
	}

	@Test(priority = 1)
	public void verifyFirstNameOfSignUpPage() {
		String Name1 = signUpPage.verifyFirstName();
		Assert.assertEquals(Name1, "firstname");
	}

	@Test(priority = 2)
	public void verifyLastNameOfSignUpPage() {
		String Name2 = signUpPage.verifyLastName();
		Assert.assertEquals(Name2, "lastname");
	}

	@Test(priority = 3)
	public void verifyEmailFieldOfSignUpPage() {
		String email = signUpPage.verifyEmail();
		Assert.assertEquals(email, "reg_email__");
	}

	@Test(priority = 4)
	public void verifyConfirmEmailFieldOfSignUpPage() {
		String confEmail = signUpPage.verifyConfirmEmail();
		Assert.assertEquals(confEmail, "reg_email_confirmation__");
	}

	@Test(priority = 5)
	public void verifypassFieldOfSignUpPage() {
		String pass = signUpPage.verifyPassword();
		Assert.assertEquals(pass, "reg_passwd__");
	}

	@Test(priority = 6)
	public void verifyBirthDayFieldOfSignUpPage() {
		String birth_Day = signUpPage.verifyBirthDay();
		Assert.assertEquals(birth_Day, "birthday_day");
	}

	@Test(priority = 7)
	public void verifyBirthMonthFieldOfSignUpPage() {
		String birth_Month = signUpPage.verifyBirthmonth();
		Assert.assertEquals(birth_Month, "birthday_month");
	}

	@Test(priority = 8)
	public void verifyBirthYearFieldOfSignUpPage() {
		String birth_Year = signUpPage.verifyBirthYear();
		Assert.assertEquals(birth_Year, "birthday_year");
	}

	@Test(priority = 9)
	public void verifyGenderFieldOfSignUpPage() {
		String gender = signUpPage.verifyGender();
		Assert.assertEquals(gender, "sex");
	}

	@Test(priority = 10)
	public void verifySubmitbtnOfSignUpPage() {
		String subBtn = signUpPage.verifySignUpBtn();
		Assert.assertEquals(subBtn, "websubmit");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}