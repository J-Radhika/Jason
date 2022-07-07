package Automation.Jason;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ts033_TestClientEstateRoamingLocations extends init_class {
	@Test(priority=32)
	public static void roamingLocations()
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
		driver.findElement(By.xpath("//*[@id='left-panel']/nav/ul/li[3]/ul/li[2]/a")).click();
	}

}
