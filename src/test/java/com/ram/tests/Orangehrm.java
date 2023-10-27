package com.ram.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Orangehrm {
	
	WebDriver driver;
	
	@BeforeTest
	public void Intialsebrowser()
	{
		
		 driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
	}
	
	@AfterTest
	public void Teardown()
	{
	
		 
		driver.close();
		
		
	}
	
	@Test
	public void Launchapp() throws InterruptedException
	{
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
	}
	
	@Test
	public void EnterLoginDetails()
	{
//driver.findElement(By.xpath(" //body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]")
	                                                                                                                           	
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.xpath("button[type='submit']")).click();
		
		
	}
	

}
