package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class D01LaunchingChrome {

	public static void main(String[] args) {
 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.findElement(By.xpath( "//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys( "Ashwini");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("Theng");
		driver.findElement(By.xpath(" //*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("Pune");
		driver.findElement(By.xpath( "//*[@id=\"eid\"]/input")).sendKeys("register123@gmail.com");
		driver.findElement(By.xpath( "//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("12345678900");
		driver.findElement(By.xpath( " //*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]/input")).click();
		driver.findElement(By.id("checkbox1")).click();
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[16]/a")).click();
		Select skills= new Select(driver.findElement(By.id("Skills")));
		skills.selectByVisibleText("Data Analytics");
		Select countries= new Select(driver.findElement(By.id("countries")));
		countries.selectByVisibleText("Denmark");
		Select year = new Select(driver.findElement(By.id("yearbox")));
		year.selectByVisibleText("1996");
		
 		

	}

}
