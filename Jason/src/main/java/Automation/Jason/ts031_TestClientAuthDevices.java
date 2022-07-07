package Automation.Jason;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ts031_TestClientAuthDevices extends init_class {
	@Test(priority=30)
	public static void authDevices()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//*[@id='s2id_clientSwitcher']/a/span[2]/b")).click();
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
		driver.findElement(By.xpath("//*[@id='left-panel']/nav/ul/li[10]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id='content']/section[1]/div[1]/a[3]/i")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Download')]")).click();
		/*driver.findElement(By.xpath("//button[contains(text(),'Cancel')]")).click();
		driver.findElement(By.xpath("//*[@id=\"csv-download\"]/div/div/div[1]/button/span[2]")).click();
		WebDriverWait wait = new WebDriverWait(driver, 3);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Edit']")));
		driver.findElement(By.xpath("//a[@title='Edit']")).click();
		
		Assert.assertEquals(driver.getTitle(), "Authdevices - Edit");*/
		driver.navigate().back();
		
	}

}
