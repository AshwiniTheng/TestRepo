package com.TestNGDemos;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class DO8KeywordDataDrivenTesting {
	WebDriver driver;
	String fpath="G:\\NewAshwiniSelenium\\NewMyAutomationProject\\src\\com\\TestNGDemos\\MyData.Properties";
	File file;
	FileInputStream fis;
	Properties prop;
	
	@Test
	public void login() {
		driver.findElement(By.xpath(prop.getProperty("unTxBxXpath"))).sendKeys("kavya");
		driver.findElement(By.xpath(prop.getProperty("psTxBxXpath"))).sendKeys("kavya123");
		driver.findElement(By.xpath(prop.getProperty("loginBtnXpat"))).click();
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println(driver.findElement(By.xpath(prop.getProperty("errMsgXpath"))).getText());
	}

	@BeforeTest
	public void beforeTest() throws IOException {
		file = new File(fpath);
		fis = new FileInputStream(file);
		prop = new Properties();
		prop.load(fis);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(prop.getProperty("url"));
		
		
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
