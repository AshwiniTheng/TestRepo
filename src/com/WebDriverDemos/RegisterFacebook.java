package com.WebDriverDemos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterFacebook {

	public static void main(String[] args) {

		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://business.facebook.com/signup/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.name("firstname")).sendKeys("Ashwini");
		driver.findElement(By.name("lastname")).sendKeys("Theng");

		driver.findElement(By.name("reg_email__")).sendKeys("ashwi.nimbolkar27@gmail.com");

		driver.findElement(By.id("password_step_input")).sendKeys("ashwini123");


		Select BirthDay = new Select(driver.findElement(By.id("day")));
		BirthDay.selectByVisibleText("7");
		Select Months = new Select(driver.findElement(By.id("month")));
		Months.selectByVisibleText("Aug");
		Select Years = new Select(driver.findElement(By.id("year")));
		Years.selectByVisibleText("1996");
		driver.findElement(By.name("sex")).click();

		driver.findElement(By.partialLinkText("Sign")); 
		System.out.println("Resgistration completed");


		driver.close();

	}
 }
