package Automation.Jason;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ts022_TestClientEstateLocations extends init_class {
	
	@Test(priority=21)
	public static void estateLocations()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//*[@id='s2id_clientSwitcher']/a/span[2]/b")).click();
		//driver.findElement(By.xpath("//*[@id='select2-result-label-4']")).click();
		try {
			WebElement estate = driver.findElement(By.xpath("//*[@id='left-panel']/nav/ul/li[3]/a/i"));
			WebDriverWait wait = new WebDriverWait(driver,3);
			wait.until(ExpectedConditions.elementToBeClickable(estate));
			Actions a = new Actions(driver);
			a.moveToElement(estate).click().build().perform();
			
		}catch(Throwable t)
		{
			WebElement estate = driver.findElement(By.xpath("//*[@id='left-panel']/nav/ul/li[3]/a/i"));
			WebDriverWait wait = new WebDriverWait(driver,3);
			wait.until(ExpectedConditions.elementToBeClickable(estate));
			Actions a = new Actions(driver);
			a.moveToElement(estate).click().build().perform();
		}
		driver.findElement(By.xpath("//*[@id='left-panel']/nav/ul/li[3]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//div//a[@title='Add New']")).click();
		Assert.assertEquals(driver.getTitle(), "Locations - Create");
		
		driver.findElement(By.name("nasid")).sendKeys("123");
		driver.findElement(By.name("name")).sendKeys("Testing");
		driver.findElement(By.xpath("//*[@id='DataTables_Table_0']/tbody/tr[7]/td[3]/input")).click();
		driver.findElement(By.name("address_line1")).sendKeys("Test Street");
		driver.findElement(By.name("address_city")).sendKeys("Manchester");
		driver.findElement(By.name("address_county")).sendKeys("UK");
		driver.findElement(By.name("address_postcode")).sendKeys("EC1N 2HT");
		driver.findElement(By.name("latitude")).sendKeys("100");
		driver.findElement(By.name("longitude")).sendKeys("70");
		driver.findElement(By.name("central_parent")).sendKeys("Test");
		driver.findElement(By.xpath("//*[@id='DataTables_Table_1']/tbody/tr[1]/td[4]/input")).click();
		driver.findElement(By.xpath("//*[@id='content']/div/div/form/div[16]/div/div/button")).click();
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("VRtest02");
		driver.findElement(By.xpath("//button[contains(text(),'Search')]")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 3);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Edit']")));
		driver.findElement(By.xpath("//a[@title='Edit']")).click();
		
		Assert.assertEquals(driver.getTitle(), "Locations - Edit");
		driver.navigate().back();
		//info
		
		WebDriverWait wait1 = new WebDriverWait(driver, 3);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='More information']")));
		driver.findElement(By.xpath("//a[@title='More information']")).click();
		
		Assert.assertEquals(driver.getTitle(), "Locations");
		driver.navigate().back();
		
		
	}

}
