package Automation.Jason;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ts035_TestClientServiceNetworks extends init_class{
	@Test(priority=34)
	public static void serviceNetworks()
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
		driver.findElement(By.xpath("//*[@id='left-panel']/nav/ul/li[4]/ul/li[3]/a")).click();
		
		driver.findElement(By.xpath("//div//a[@title='Add New']")).click();
		Assert.assertEquals(driver.getTitle(), "Networks - Create");
		
		driver.findElement(By.name("name_private")).sendKeys("test");
		driver.findElement(By.name("name_public")).sendKeys("virgin");
		driver.findElement(By.name("servername")).sendKeys("jason");
		driver.findElement(By.name("support_email")).sendKeys("jason@gmail.com");
		driver.findElement(By.name("support_phone")).sendKeys("07439445578");
		driver.findElement(By.name("support_web")).sendKeys("test");
		driver.findElement(By.name("support_terms")).sendKeys("test");
		driver.findElement(By.name("support_privacy")).sendKeys("test");
		
		driver.findElement(By.xpath("//*[@id='DataTables_Table_0']/tbody/tr[1]/td[4]/input")).click();
		driver.findElement(By.xpath("//*[@id='DataTables_Table_1']/tbody/tr[1]/td[4]/input")).click();
		
		driver.findElement(By.xpath("//*[@id='content']/div/div/form/div[12]/div/div/button")).click();
		driver.navigate().back();
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Virgin Test2");
		driver.findElement(By.xpath("//button[contains(text(),'Search')]")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 3);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Edit']")));
		driver.findElement(By.xpath("//a[@title='Edit']")).click();
		
		Assert.assertEquals(driver.getTitle(), "Networks - Edit");
		driver.navigate().back();
		//info
		
		WebDriverWait wait1 = new WebDriverWait(driver, 3);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='More information']")));
		driver.findElement(By.xpath("//a[@title='More information']")).click();
		
		Assert.assertEquals(driver.getTitle(), "Networks");
		driver.navigate().back();
		
		

}

}
