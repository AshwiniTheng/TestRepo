package com.TestNGDemos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class D02MultipleTest {
  @Test
	  public void OpenMyntra() {
		  WebDriver driver =new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  
		  driver.get("https://www.myntra.com/");
		  System.out.println("Title:   "  + driver.getTitle());
		  driver.close();
  }
  @Test
  public void Openbewkoof() {
	  WebDriver driver =new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://www.bewakoof.com/men-t-shirts?gad_source=1&%243p=a_google_adwords&~campaign=BEWA_12829_adyogi_Brand-Search_Engage_Exact_match&~channel=google&~feature=paid%20advertising&utm_source=google&utm_medium=cpc&utm_campaign=BEWA_12829_adyogi_Brand-Search_Engage_Exact_match&gclid=CjwKCAjwte-vBhBFEiwAQSv_xUoev99y4esdA9xOL2oroyLUw02noZwoMGB1N8_MHuokhS_NwWmETBoCbr8QAvD_BwE&~ad_set_id=148824424465&~campaign_id=20174446926&~keyword=bewakoof&~placement&_branch_match_id=1228626635535261280");
	  System.out.println("Title:   "  + driver.getTitle());
	  driver.close();
	  }
  @Test
  public void OpenAmazon() {
	  WebDriver driver =new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=676742245123&hvpos=&hvnetw=g&hvrand=8841745790755914944&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9299534&hvtargid=kwd-10573980&hydadcr=14453_2367553&gad_source=1");
	  System.out.println("Title:   "  + driver.getTitle());
	  driver.close();
	  }
  @Test
  public void OpenZepto() {
	  WebDriver driver =new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://www.zeptonow.com/");
	  System.out.println("Title:   "  + driver.getTitle());
	  driver.close();
	  }
  @Test
  public void OpenMeezsho() {
	  WebDriver driver =new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://www.meesho.com/");
	  System.out.println("Title:   "  + driver.getTitle());
	  driver.close();
	  }
  }

