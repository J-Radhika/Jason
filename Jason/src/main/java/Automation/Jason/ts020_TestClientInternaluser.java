package Automation.Jason;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ts020_TestClientInternaluser extends init_class {
	@Test(priority=19)
	public static void internalUser()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//*[@id='s2id_clientSwitcher']/a/span[2]/b")).click();
		//driver.findElement(By.xpath("//*[@id='select2-result-label-4']")).click();
		driver.findElement(By.xpath("//*[@id='left-panel']/nav/ul/li[2]/a/span")).click();
		
		try {
			WebElement externaluser = driver.findElement(By.xpath("//*[@id='left-panel']/nav/ul/li[2]/a/span"));
			Actions a = new Actions(driver);
			
			a.moveToElement(externaluser).click().build().perform();
			
		}catch(Throwable t)
		{
			WebElement externaluser = driver.findElement(By.xpath("//*[@id='left-panel']/nav/ul/li[2]/a/span"));
			WebDriverWait wait = new WebDriverWait(driver,3);
			wait.until(ExpectedConditions.elementToBeClickable(externaluser));
			
			Actions a = new Actions(driver);
			
			a.moveToElement(externaluser).click().build().perform();
		}
		WebElement externaluser = driver.findElement(By.xpath("//*[@id='left-panel']/nav/ul/li[2]/ul/li[1]/a"));
		Actions a = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver,3);
		wait.until(ExpectedConditions.elementToBeClickable(externaluser));
		a.moveToElement(externaluser).click().build().perform();
		driver.findElement(By.xpath("//div//a[@title='Add New']")).click();
		Assert.assertEquals(driver.getTitle(), "Jason Dashboard");
		driver.navigate().back();
		
		//edit data
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("sandy");
		driver.findElement(By.xpath("//button[contains(text(),'Search')]")).click();
		
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
