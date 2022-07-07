package Automation.Jason;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ts014_GlobaluserInternalGroup extends init_class {
	
	@Test(priority=13)
	public static void internalUsers()
	{
		driver.findElement(By.xpath("//*[@id='left-panel']/nav/ul/li[2]/a/span")).click();
		driver.findElement(By.xpath("//*[@id='left-panel']/nav/ul/li[2]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//div//a[@title='Add New']")).click();
		
		Assert.assertEquals(driver.getTitle(), "Jason Dashboard");
		driver.navigate().back();
		
		//edit data
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("vignesh");
		driver.findElement(By.xpath("//button[contains(text(),'Search')]")).click();
		WebDriverWait wait = new WebDriverWait(driver, 3);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Edit']")));
		driver.findElement(By.xpath("//a[@title='Edit']")).click();
		
		Assert.assertEquals(driver.getTitle(), "Jason Dashboard");
		driver.navigate().back();
		//info
		
		WebDriverWait wait1 = new WebDriverWait(driver, 3);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='More information']")));
		driver.findElement(By.xpath("//a[@title='More information']")).click();
		
		Assert.assertEquals(driver.getTitle(), "Jason Dashboard");
		driver.navigate().back();
		
		
	}

}
