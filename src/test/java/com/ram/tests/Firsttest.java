package com.ram.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Firsttest {
	
	@Parameters("browsername")
	@Test
	public void TestGoogle(String browsername) throws InterruptedException
	{
		switch (browsername) {
		case "chrome":
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://www.google.com/");
			
		      	driver.findElement(By.name("q")).sendKeys("BJS",Keys.ENTER);
		      	
			break;

		case "firefox":
			

			WebDriver driver1 = new FirefoxDriver();
			driver1.manage().window().maximize();
			
			driver1.get("https://www.google.com/");
			
		      	driver1.findElement(By.name("q")).sendKeys("BJS",Keys.ENTER);
		      
		      	default:
		      		System.out.println("browser name is invalid");
			
			break;
		}
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
	      	driver.findElement(By.name("q")).sendKeys("BJS",Keys.ENTER);
	      	
 	String expectedtitle = "BJS - Google Search";
	      	
	      	String actualtitle = driver.getTitle();
	      	
	      	//Assert.assertEquals(actualtitle, expectedtitle, "Title is mismatched");
	      	
	      	SoftAssert aasert = new SoftAssert();
	      	
	      	aasert.assertEquals(actualtitle, expectedtitle, "ttile is wrong");
	      	
	      	
	      	
	      	driver.quit();
	      	aasert.assertAll();
	   
				
	}
	
	@Test
	public void TestFacebook() throws InterruptedException
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
	      	driver.findElement(By.name("email")).sendKeys("BJS",Keys.ENTER);
	      	
	   
	      	 System.out.println(driver.getTitle());
	      	 
	      	 driver.quit();
	      	
	      	
	}
	
			
			
			

}
