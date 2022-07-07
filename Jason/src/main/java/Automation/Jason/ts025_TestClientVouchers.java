package Automation.Jason;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ts025_TestClientVouchers extends init_class {

	@Test(priority=24)
	public static void vouchers()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//*[@id='s2id_clientSwitcher']/a/span[2]/b")).click();
		//driver.findElement(By.xpath("//*[@id='select2-result-label-4']")).click();
		try {
		WebElement vouchers =driver.findElement(By.xpath("//*[@id='left-panel']/nav/ul/li[6]/a/span"));
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
		
		driver.findElement(By.xpath("//*[@id='left-panel']/nav/ul/li[6]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//div//a[@title='Add New']")).click();
		Assert.assertEquals(driver.getTitle(), "Vouchers - Create");
		
		driver.findElement(By.xpath("//*[@id='s2id_autogen2']/a/span[2]")).click();
		driver.findElement(By.xpath("//*[@id='s2id_autogen3_search']")).sendKeys("testing 24 hours");
		driver.findElement(By.xpath("//div[@class='select2-result-label']")).click();
		
		driver.findElement(By.name("quantity")).sendKeys("1");
		driver.findElement(By.xpath("//button[contains(text(),'Generate to screen')]")).click();
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("//input[@name='code']")).sendKeys("TCXJBB74");
		driver.findElement(By.xpath("//button[contains(text(),'Search')]")).click();
		
		/*WebDriverWait wait = new WebDriverWait(driver, 3);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Edit']")));
		driver.findElement(By.xpath("//a[@title='Edit']")).click();
		
		Assert.assertEquals(driver.getTitle(), "Vouchers - Edit");
		driver.navigate().back();
		//info
		
		WebDriverWait wait1 = new WebDriverWait(driver, 3);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='More information']")));
		driver.findElement(By.xpath("//a[@title='More information']")).click();
		
		Assert.assertEquals(driver.getTitle(), "Vouchers");
		driver.navigate().back();*/
		
	}
}
