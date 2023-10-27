import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login {
	
	
	@Test
	public void verifyLoginwithValidCredentials() throws InterruptedException
	{
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(3000);
		
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	
	 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	 
	 driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	 
	
	//Assert.assertTrue(driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]/span[1]")).isDisplayed());
	
	
	Thread.sleep(2000);
	
	driver.quit();
		
		
		
		
		
	}

}
