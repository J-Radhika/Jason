package Automation.Jason;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ts034_TestClientServiceProductUpgrades extends init_class  {
	
	@Test(priority=33)
	public static void serviceProducts()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//*[@id='s2id_clientSwitcher']/a/span[2]/b")).click();
		//driver.findElement(By.xpath("//*[@id='select2-result-label-4']")).click();
		try {
			WebElement service = driver.findElement(By.xpath("//*[@id='left-panel']/nav/ul/li[4]/a/i"));
			WebDriverWait wait = new WebDriverWait(driver,3);
			wait.until(ExpectedConditions.elementToBeClickable(service));
			Actions a = new Actions(driver);
			a.moveToElement(service).click().build().perform();
		}catch(Throwable t)
		{
			WebElement service = driver.findElement(By.xpath("//*[@id='left-panel']/nav/ul/li[4]/a/i"));
			WebDriverWait wait = new WebDriverWait(driver,3);
			wait.until(ExpectedConditions.elementToBeClickable(service));
			
			Actions a = new Actions(driver);
			a.moveToElement(service).click().build().perform();
		}
		driver.findElement(By.xpath("//*[@id='left-panel']/nav/ul/li[4]/a/i")).click();
		driver.findElement(By.xpath("//*[@id='left-panel']/nav/ul/li[4]/ul/li[2]/a")).click();
		
		driver.findElement(By.xpath("//div//a[@title='Add New']")).click();
		Assert.assertEquals(driver.getTitle(), "Productupgrades - Create");
		
		driver.findElement(By.name("name_public")).sendKeys("Testing");
		driver.findElement(By.name("name_private")).sendKeys("Test");
		driver.findElement(By.name("description_private")).sendKeys("Test");
		driver.findElement(By.name("description_public")).sendKeys("Testing");
		driver.findElement(By.name("cost")).sendKeys("10");
		driver.findElement(By.xpath("//*[@id='DataTables_Table_0']/tbody/tr[1]/td[4]/input")).click();
		driver.findElement(By.name("prorata_precision")).sendKeys("Test");
		driver.findElement(By.name("limit_length")).sendKeys("1");
		driver.findElement(By.name("limit_device")).sendKeys("1");
		driver.findElement(By.name("limit_download_data")).sendKeys("10");
		driver.findElement(By.name("limit_upload_data")).sendKeys("10");
		driver.findElement(By.name("limit_combined_data")).sendKeys("10");
		driver.findElement(By.name("limit_download_speed")).sendKeys("20");
		driver.findElement(By.name("limit_upload_speed")).sendKeys("10");
		
		driver.findElement(By.name("active_from")).click();
		driver.findElement(By.name("active_to")).click();
		driver.findElement(By.name("order")).sendKeys("test product");
		driver.findElement(By.xpath("//*[@id='content']/div/div/form/div[20]/div/div/button")).click();
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("test");
		driver.findElement(By.xpath("//button[contains(text(),'Search')]")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 3);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Edit']")));
		driver.findElement(By.xpath("//a[@title='Edit']")).click();
		
		Assert.assertEquals(driver.getTitle(), "Productupgrades - Edit");
		driver.navigate().back();
		//info
		
		WebDriverWait wait1 = new WebDriverWait(driver, 3);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='More information']")));
		driver.findElement(By.xpath("//a[@title='More information']")).click();
		
		Assert.assertEquals(driver.getTitle(), "Productupgrades");
		driver.navigate().back();
		

}
}
