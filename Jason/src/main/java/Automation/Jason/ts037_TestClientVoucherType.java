package Automation.Jason;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ts037_TestClientVoucherType extends init_class {
	
	@Test(priority=36)
	public static void voucherType()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//*[@id='s2id_clientSwitcher']/a/span[2]/b")).click();
		//driver.findElement(By.xpath("//*[@id='select2-result-label-4']")).click();
		try {
		WebElement vouchers =driver.findElement(By.xpath("//*[@id='left-panel']/nav/ul/li[6]/a/i"));
		WebDriverWait wait = new WebDriverWait(driver,3);
		wait.until(ExpectedConditions.elementToBeClickable(vouchers));
		
		Actions a = new Actions(driver);
		
		a.moveToElement(vouchers).click().build().perform();
		}catch(Throwable t)
		{
			WebElement vouchers = driver.findElement(By.xpath("//*[@id='left-panel']/nav/ul/li[6]/a/span"));
			WebDriverWait wait = new WebDriverWait(driver,3);
			wait.until(ExpectedConditions.elementToBeClickable(vouchers));
			Actions a = new Actions(driver);
			a.moveToElement(vouchers).click().build().perform();
			
		}
		driver.findElement(By.xpath("//*[@id='left-panel']/nav/ul/li[6]/a/span")).click();
		driver.findElement(By.xpath("//*[@id='left-panel']/nav/ul/li[6]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//div//a[@title='Add New']")).click();
		Assert.assertEquals(driver.getTitle(), "Vouchertypes - Create");
		
		driver.findElement(By.name("name")).sendKeys("Test");
		driver.findElement(By.name("description")).sendKeys("testing");
		driver.findElement(By.name("prefix")).sendKeys("ms");
		driver.findElement(By.name("suffix")).sendKeys("test");
		driver.findElement(By.name("charlist")).sendKeys("test");
		driver.findElement(By.name("length")).sendKeys("2");
		driver.findElement(By.name("batchqty")).sendKeys("10");
		driver.findElement(By.name("expires_after")).sendKeys("1");
		driver.findElement(By.name("usage_limit")).sendKeys("10");
		driver.findElement(By.xpath("//*[@id='DataTables_Table_0']/tbody/tr[1]/td[4]/input")).click();
		driver.findElement(By.xpath("//*[@id='content']/div/div/form/div[11]/div/div/button")).click();
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("testing 24 hours");
		driver.findElement(By.xpath("//button[contains(text(),'Search')]")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 3);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Edit']")));
		driver.findElement(By.xpath("//a[@title='Edit']")).click();
		
		Assert.assertEquals(driver.getTitle(), "Vouchertypes - Edit");
		driver.navigate().back();
		//info
		
		WebDriverWait wait1 = new WebDriverWait(driver, 3);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='More information']")));
		driver.findElement(By.xpath("//a[@title='More information']")).click();
		
		Assert.assertEquals(driver.getTitle(), "Vouchertypes");
		driver.navigate().back();
		
		
		
	}

}
