package Automation.Jason;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;


public class ts004_GlobalUserExternalGroup extends init_class {
	
	@Test(priority=3)
	public static void externalGroup()
	{
	
	driver.findElement(By.xpath("//*[@id='left-panel']/nav/ul/li[2]/a/span")).click();
	WebElement externaluser = driver.findElement(By.xpath("//*[@id='left-panel']/nav/ul/li[2]/ul/li[2]/a[contains(text(),'External users')]"));
	Actions a = new Actions(driver);
	
	a.moveToElement(externaluser).click().build().perform();
	
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
