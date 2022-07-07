package Automation.Jason;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ts032_TestClientAuthDevicesGroup extends init_class {
	@Test(priority=31)
	public static void authDevices()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='s2id_clientSwitcher']/a/span[2]/b")).click();
		//driver.findElement(By.xpath("//*[@id='select2-result-label-4']")).click();
		try {
			WebElement authdevices = driver.findElement(By.xpath("//*[@id='left-panel']/nav/ul/li[10]/a/span"));
			WebDriverWait wait = new WebDriverWait(driver,3);
			wait.until(ExpectedConditions.elementToBeClickable(authdevices));
			Actions a = new Actions(driver);
			a.moveToElement(authdevices).click().build().perform();
		}catch(Throwable t)
		{
			WebElement authdevices = driver.findElement(By.xpath("//*[@id='left-panel']/nav/ul/li[10]/a/span"));
			WebDriverWait wait = new WebDriverWait(driver,3);
			wait.until(ExpectedConditions.elementToBeClickable(authdevices));
			Actions a = new Actions(driver);
			a.moveToElement(authdevices).click().build().perform();
		}
		
		
			driver.findElement(By.xpath("//*[@id='left-panel']/nav/ul/li[10]/ul/li[2]/a")).click();
			driver.findElement(By.xpath("//div//a[@title='Add New']")).click();
			Assert.assertEquals(driver.getTitle(), "Authdevicegroups - Create");
			
			driver.findElement(By.name("name")).sendKeys("Test");
			driver.findElement(By.name("description")).sendKeys("Testing");
			driver.findElement(By.xpath("//*[@id='DataTables_Table_0']/tbody/tr[1]/td[4]/input")).click();
			driver.findElement(By.name("session_timeout")).sendKeys("1");
			driver.findElement(By.name("limit_upload_speed")).sendKeys("12");
			driver.findElement(By.name("limit_download_speed")).sendKeys("10");
			driver.findElement(By.xpath("//*[@id='content']/div/div/form/div[7]/div/div/button")).click();
			driver.navigate().back();
			
			driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Virgin");
			driver.findElement(By.xpath("//button[contains(text(),'Search')]")).click();
			
			WebDriverWait wait = new WebDriverWait(driver, 3);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Edit']")));
			driver.findElement(By.xpath("//a[@title='Edit']")).click();
			
			Assert.assertEquals(driver.getTitle(), "Auth Device Groups - Edit");
			driver.navigate().back();
			//info
			
			WebDriverWait wait1 = new WebDriverWait(driver, 3);
			wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='More information']")));
			driver.findElement(By.xpath("//a[@title='More information']")).click();
			
			Assert.assertEquals(driver.getTitle(), "Authdevicegroups");
			driver.navigate().back();
			
			
	}

}
