package com.fb.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.fb.qa.base.TestBase;

public class SignUpPage extends TestBase {

	public static String title;
	public static WebElement firstName;
	public static WebElement lastName;
	public static WebElement email;
	public static WebElement confirmEmail;
	public static WebElement password;
	public static WebElement birthDay;
	public static WebElement birthmonth;
	public static WebElement birthYear;
	public static WebElement gender;
	public static WebElement submitBtn;
	
	
	public String verifyTitleOfSignUpPage() {
		title = driver.getTitle();
		return title;
	}
	
	public String verifyFirstName() {
		firstName = driver.findElement(By.name("firstname"));
		return firstName.getAttribute("name");
	}

	public String verifyLastName() {
		lastName = driver.findElement(By.name("lastname"));
		return lastName.getAttribute("name");
	}

	public String verifyEmail() {
		email = driver.findElement(By.name("reg_email__"));
		return email.getAttribute("name");
	}

	public String verifyConfirmEmail() {
		confirmEmail = driver.findElement(By.name("reg_email_confirmation__"));
		return confirmEmail.getAttribute("name");
	}

	public String verifyPassword() {
		password = driver.findElement(By.id("password_step_input"));
		return password.getAttribute("name");
	}

	public String verifyBirthDay() {
		birthDay = driver.findElement(By.name("birthday_day"));
		return birthDay.getAttribute("name");
	}

	public String verifyBirthmonth() {
		birthmonth = driver.findElement(By.name("birthday_month"));
		return birthmonth.getAttribute("name");
	}

	public String verifyBirthYear() {
		birthYear = driver.findElement(By.name("birthday_year"));
		return birthYear.getAttribute("name");
	}

	public String verifyGender() {
		gender = driver.findElements(By.name("sex")).get(1);
		return gender.getAttribute("name");
	}

	public String verifySignUpBtn() {
		submitBtn = driver.findElement(By.name("websubmit"));
		return submitBtn.getAttribute("name");
	}
}