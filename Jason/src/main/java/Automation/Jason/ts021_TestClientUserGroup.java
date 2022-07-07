package Automation.Jason;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ts021_TestClientUserGroup extends init_class {
	
	@Test(priority=20)
	public static void userGroup()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//*[@id='s2id_clientSwitcher']/a/span[2]/b")).click();
		//driver.findElement(By.xpath("//*[@id='select2-result-label-4']")).click();
		try {
			WebElement usergroup = driver.findElement(By.xpath("//*[@id='left-panel']/nav/ul/li[2]/a/span"));
			WebDriverWait wait = new WebDriverWait(driver,3);
			wait.until(ExpectedConditions.elementToBeClickable(usergroup));
			Actions a = new Actions(driver);
			a.moveToElement(usergroup).click().build().perform();
		}catch(Throwable T)
		{
			WebElement usergroup = driver.findElement(By.xpath("//*[@id='left-panel']/nav/ul/li[2]/a/span"));
			WebDriverWait wait = new WebDriverWait(driver,3);
			wait.until(ExpectedConditions.elementToBeClickable(usergroup));
			Actions a = new Actions(driver);
			a.moveToElement(usergroup).click().build().perform();
			
			
		}
		driver.findElement(By.xpath("//*[@id='left-panel']/nav/ul/li[2]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id='content']/div/div/div/table/tbody/tr[1]/td[5]/a[1]")).click();
		Assert.assertEquals(driver.getTitle(),"User Groups Management - Details");
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("//*[@id='content']/div/div/div/table/tbody/tr[1]/td[5]/a[2]")).click();
		Assert.assertEquals(driver.getTitle(),"User Groups Management - Edit");
		driver.navigate().back();
	}

}
