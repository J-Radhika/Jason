package Automation.Jason;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ts018_TestClientDashboard extends init_class {
	@Test(priority=17)
	public static void dashboard() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//*[@id='s2id_clientSwitcher']/a/span[2]/b")).click();
		//driver.findElement(By.xpath("//*[@id='select2-result-label-4']")).click();
		try {
			 WebElement dashboard = driver.findElement(By.xpath("//span[contains(text(),'Select search option')]"));
			 Actions a = new Actions(driver);
				
				a.moveToElement(dashboard).click().build().perform();
		}
		catch(Throwable t)
		{
		WebElement dashboard = driver.findElement(By.xpath("//*[@id='s2id_goal']/a/span[2]"));
		WebDriverWait wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.elementToBeClickable(dashboard));
		dashboard.click();
		}
		driver.findElement(By.xpath("//*[@id='s2id_goal']/a/span[2]")).click();
		WebDriverWait wait = new WebDriverWait(driver,5);
		
		WebElement customer= driver.findElement(By.xpath("//*[@id='s2id_autogen2_search']"));
		//wait.until(ExpectedConditions.elementToBeClickable(customer));
		customer.sendKeys("Customer");
		driver.findElement(By.xpath("//*[@class='select2-result-label']")).click();
		driver.findElement(By.xpath("//input[@name='value']")).sendKeys("Test");
		
		driver.findElement(By.xpath("//*[@id='search-form']/div[3]/div/button")).click();
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("//*[@id='s2id_goal']/a/span[2]")).click();
		driver.findElement(By.xpath("//*[@id='s2id_autogen2_search']")).sendKeys("Device");
		driver.findElement(By.xpath("//*[@class='select2-result-label']")).click();
		
		driver.findElement(By.xpath("//input[@name='mac']")).sendKeys("Test");
		
		driver.findElement(By.xpath("//*[@id='search-form']/div[3]/div/button")).click();
		
		driver.navigate().back();
	}

}
