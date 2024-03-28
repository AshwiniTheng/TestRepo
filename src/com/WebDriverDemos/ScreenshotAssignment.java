package com.WebDriverDemos;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotAssignment {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");

		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(file, new File ("D:\\StarAgile.jpeg"));

		System.out.println("Screenshot Taken and Saved ");
		driver.close();
	}



}
