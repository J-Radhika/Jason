package Automation.Jason;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;



public class ts015_GlobaluserEstateBusiness extends init_class{
	
	@Test(priority=14)
	public static void business()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='left-panel']/nav/ul/li[3]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"left-panel\"]/nav/ul/li[3]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//div//a[@title='Add New']")).click();
		
		driver.findElement(By.name("name_public")).sendKeys("Testing");
		driver.findElement(By.name("name_private")).sendKeys("Test");
		driver.findElement(By.name("vatrate")).sendKeys("Testing");
		driver.findElement(By.name("regnumber")).sendKeys("1234");
		driver.findElement(By.name("vatnumber")).sendKeys("test");
		driver.findElement(By.name("address_line1")).sendKeys("no 8 test street");
		driver.findElement(By.name("address_city")).sendKeys("Sheffield");
		driver.findElement(By.name("address_county")).sendKeys("UK");
		driver.findElement(By.name("address_postcode")).sendKeys("EC1N 2HT");
		driver.findElement(By.xpath("//*[@id='content']/div/div/form/div[13]/div/div/button")).click();
		
		Assert.assertEquals(driver.getTitle(), "Businesses - Create");
		driver.navigate().back();
		
		//edit data
		
				driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Virgin");
				driver.findElement(By.xpath("//button[contains(text(),'Search')]")).click();
				WebDriverWait wait = new WebDriverWait(driver, 3);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Edit']")));
				driver.findElement(By.xpath("//a[@title='Edit']")).click();
				
				Assert.assertEquals(driver.getTitle(), "Businesses - Edit");
				driver.navigate().back();
				//info
				
				WebDriverWait wait1 = new WebDriverWait(driver, 3);
				wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='More information']")));
				driver.findElement(By.xpath("//a[@title='More information']")).click();
				
				Assert.assertEquals(driver.getTitle(), "Businesses");
				driver.navigate().back();
	}

}
