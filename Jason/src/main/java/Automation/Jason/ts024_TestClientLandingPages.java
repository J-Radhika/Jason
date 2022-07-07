package Automation.Jason;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ts024_TestClientLandingPages extends init_class {
	@Test(priority=23)
	public static void landingPages()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//*[@id='s2id_clientSwitcher']/a/span[2]/b")).click();
		//driver.findElement(By.xpath("//*[@id='select2-result-label-4']")).click();
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
			driver.findElement(By.xpath("//*[@id='left-panel']/nav/ul/li[5]/ul/li[3]/a")).click();
			driver.findElement(By.xpath("//div//a[@title='Add New']")).click();
			Assert.assertEquals(driver.getTitle(), "Surveys - Create");
			
			driver.findElement(By.name("name")).sendKeys("test");
			driver.findElement(By.name("description")).sendKeys("surveys");
			driver.findElement(By.xpath("//*[@id='DataTables_Table_0']/tbody/tr[6]/td[4]/input")).click();
			driver.findElement(By.xpath("//*[@id='content']/div/div/form/div[5]/div/div/button")).click();
			
			driver.navigate().back();
			
			driver.findElement(By.xpath("//input[@name='q']")).sendKeys("poll");
			driver.findElement(By.xpath("//button[contains(text(),'Search')]")).click();
			
			WebDriverWait wait = new WebDriverWait(driver, 3);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Edit']")));
			driver.findElement(By.xpath("//a[@title='Edit']")).click();
			
			Assert.assertEquals(driver.getTitle(), "Surveys - Edit");
			driver.navigate().back();
			//info
			
			WebDriverWait wait1 = new WebDriverWait(driver, 3);
			wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='More information']")));
			driver.findElement(By.xpath("//a[@title='More information']")).click();
			
			Assert.assertEquals(driver.getTitle(), "Surveys");
			driver.navigate().back();
			
	
	
	
	
	}
	
	
	

}
