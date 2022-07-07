package Automation.Jason;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ts036_TestClientLandingpageFlows extends init_class {
	
	@Test(priority=35)
	public static void flows()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		try {
			
			WebElement landingpage =driver.findElement(By.xpath("//*[@id=\"left-panel\"]/nav/ul/li[5]/a/span"));
					WebDriverWait wait = new WebDriverWait(driver,3);
			wait.until(ExpectedConditions.elementToBeClickable(landingpage));
			Actions a = new Actions(driver);
			a.moveToElement(landingpage).click().build().perform();
			
		}catch(Throwable t)
		{
			WebElement landingpage= driver.findElement(By.xpath("//*[@id=\"left-panel\"]/nav/ul/li[5]/a/span"));
			WebDriverWait wait = new WebDriverWait(driver,3);
			wait.until(ExpectedConditions.elementToBeClickable(landingpage));
			Actions a = new Actions(driver);
			a.moveToElement(landingpage).click().build().perform();
			
		}
			driver.findElement(By.xpath("//*[@id='left-panel']/nav/ul/li[5]/ul/li[2]/a")).click();
			//driver.findElement(By.xpath("//div//a[@title='Add New']")).click();
			Assert.assertEquals(driver.getTitle(), "Jason Dashboard");
			driver.findElement(By.id("createNewFlow")).click();
			driver.findElement(By.id("flowName")).sendKeys("Test");
			driver.findElement(By.name("description")).sendKeys("testing");
			
			driver.findElement(By.xpath("//*[@id='createNewFlowForm']/div[2]/button[2]")).click();
			
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/button/span")).click();
			
			
	}

}
