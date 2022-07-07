package Automation.Jason;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ts026_TestClientReports extends init_class {
	
	@Test(priority=25)
	public static void reports()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//*[@id='s2id_clientSwitcher']/a/span[2]/b")).click();
		//driver.findElement(By.xpath("//*[@id='select2-result-label-4']")).click();
		
		try {
			WebElement reports =driver.findElement(By.xpath("//*[@id='left-panel']/nav/ul/li[8]/a/span"));
			WebDriverWait wait = new WebDriverWait(driver,3);
			wait.until(ExpectedConditions.elementToBeClickable(reports));
			
			Actions a = new Actions(driver);
			
			a.moveToElement(reports).click().build().perform();
		}catch(Throwable t)
		{
			WebElement reports =driver.findElement(By.xpath("//*[@id='left-panel']/nav/ul/li[8]/a/span"));
			WebDriverWait wait = new WebDriverWait(driver,3);
			wait.until(ExpectedConditions.elementToBeClickable(reports));
			
			Actions a = new Actions(driver);
			
			a.moveToElement(reports).click().build().perform();
		}
		
		driver.findElement(By.xpath("//*[@id='left-panel']/nav/ul/li[8]/ul/li[1]/a")).click();
		
	}

}
