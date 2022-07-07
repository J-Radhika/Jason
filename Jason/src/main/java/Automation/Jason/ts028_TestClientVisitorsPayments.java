package Automation.Jason;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ts028_TestClientVisitorsPayments extends init_class {
	
	@Test(priority=27)
	public static void visitorsPayments()
	{

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//*[@id='s2id_clientSwitcher']/a/span[2]/b")).click();
		//driver.findElement(By.xpath("//*[@id='select2-result-label-4']")).click();
		try {
			WebElement visitors = driver.findElement(By.xpath("//*[@id=\"left-panel\"]/nav/ul/li[9]/a/i"));
			WebDriverWait wait = new WebDriverWait(driver,3);
			wait.until(ExpectedConditions.elementToBeClickable(visitors));
			Actions a = new Actions(driver);
			a.moveToElement(visitors).click().build().perform();
		}catch(Throwable t)
		{
			WebElement visitors = driver.findElement(By.xpath("//*[@id=\"left-panel\"]/nav/ul/li[9]/a/i"));
			WebDriverWait wait = new WebDriverWait(driver,3);
			wait.until(ExpectedConditions.elementToBeClickable(visitors));
			Actions a = new Actions(driver);
			a.moveToElement(visitors).click().build().perform();
		}
		driver.findElement(By.xpath("//*[@id='left-panel']/nav/ul/li[9]/ul/li[2]/a")).click();
		//*[@id='left-panel']/nav/ul/li[9]/ul/li[2]/a
	}

}
