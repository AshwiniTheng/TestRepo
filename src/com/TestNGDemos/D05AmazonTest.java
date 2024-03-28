package com.TestNGDemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class D05AmazonTest { 
	WebDriver driver;
	@Test(priority = 1)
	public void ClickonBestSeller() {
		driver.findElement(By.partialLinkText("Best")).click();
		System.out.println("Title:     "+  driver.getTitle());

	}
	@Test(priority = 2)
	public void ClickonMobile() {
		driver.findElement(By.partialLinkText("Mobile")).click();
		System.out.println("Title:     "+  driver.getTitle());

	}
	@Test(priority = 3)
	public void ClickonTodayssDeal() {
		driver.findElement(By.partialLinkText("Today")).click();
		System.out.println("Title:     "+  driver.getTitle());

	}
	@Test(priority = 4)
	public void ClickonElectronics() {
		driver.findElement(By.partialLinkText("Electronics")).click();
		System.out.println("Title:     "+  driver.getTitle());

	}
	@Test(priority = 5)
	public void ClickonGiftIdea() {
		driver.findElement(By.partialLinkText("Gift")).click();
		System.out.println("Title:     "+  driver.getTitle());

	}

	@BeforeMethod
	public void OpenAmazon() {
		driver.get("https://www.amazon.in/");
		System.out.println("Title:     "+  driver.getTitle());

	}

	@AfterMethod
	public void PrintTitle() {
		System.out.println("Title:     "+  driver.getTitle());

	}

	@BeforeTest
	public void OpenBroweser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@AfterTest
	public void CloseBrowesr() {
		driver.close();

	}

}
