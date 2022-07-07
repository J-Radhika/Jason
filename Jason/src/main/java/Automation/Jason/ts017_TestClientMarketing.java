package Automation.Jason;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ts017_TestClientMarketing extends init_class {
	
	@Test(priority=16)
	public static void marketing()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='s2id_clientSwitcher']/a/span[2]/b")).click();
		driver.findElement(By.xpath("//*[@id='select2-result-label-4']")).click();
		
		/*try {
			WebDriverWait wait = new WebDriverWait(driver,3);
			WebElement marketing = driver.findElement(By.xpath("//*[@id='left-panel']/nav/ul/li[7]/a/i"));
			wait.until(ExpectedConditions.elementToBeClickable(marketing));
			Actions a = new Actions(driver);
			a.moveToElement(marketing).click().build().perform();
		}catch(Throwable t)
		{
		WebDriverWait wait = new WebDriverWait(driver,8);
		
		WebElement marketing = driver.findElement(By.xpath("//*[@id='left-panel']/nav/ul/li[7]/a/i"));
		wait.until(ExpectedConditions.elementToBeClickable(marketing));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='left-panel']/nav/ul/li[7]/a/i")));
		Actions a = new Actions(driver);
		a.moveToElement(marketing).click().build().perform();
		
		}
		WebElement reports = driver.findElement(By.xpath("//*[@id='left-panel']/nav/ul/li[7]/ul/li/a"));
		WebDriverWait wait = new WebDriverWait(driver,3);
		wait.until(ExpectedConditions.elementToBeClickable(reports));
		reports.click();
		driver.findElement(By.xpath("//a[@title='Add New']")).click();
		driver.findElement(By.id("reportName")).sendKeys("Test");
		driver.findElement(By.name("report_cd_whitelist")).sendKeys("1");
		driver.findElement(By.xpath("//*[@id='content']/div/div/form/div[6]/div/div/button")).click();
		driver.findElement(By.xpath("//a[@title='Edit report']")).click();
		System.out.println(driver.getTitle());
		driver.navigate().back();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='content']/div/div/div/table/tbody/tr[1]/td[6]/a[1]")));
		driver.findElement(By.xpath("//*[@id='content']/div/div/div/table/tbody/tr[1]/td[6]/a[1]")).click();
		
		driver.findElement(By.xpath("//*[@id='content']/div[1]/div/div/div/div[2]/div/div/div/div/form/div/div/div/button")).click();
		driver.switchTo().alert().accept();
		*/
	}

}
