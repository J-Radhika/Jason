package Automation.Jason;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ts016_GlobaluserEstateAcs extends init_class {
	
	@Test(priority=15)
	public static void estateAcs()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='left-panel']/nav/ul/li[3]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"left-panel\"]/nav/ul/li[3]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//div//a[@title='Add New']")).click();
		
		
		Assert.assertEquals(driver.getTitle(), "Acss - Create");
		
		driver.findElement(By.name("ip_address")).sendKeys("193.38.82.36");
		driver.findElement(By.name("type")).sendKeys("Test");
		driver.findElement(By.name("login_token")).sendKeys("Testing");
		driver.findElement(By.name("login_key")).sendKeys("123");
		driver.findElement(By.xpath("//*[@id='DataTables_Table_0']/tbody/tr[1]/td[4]/input")).click();
		
		driver.findElement(By.xpath("//*[@id='content']/div/div/form/div[6]/div/div/button")).click();
		driver.navigate().back();
		
		//edit data
		
				driver.findElement(By.xpath("//input[@name='q']")).sendKeys("1");
				driver.findElement(By.xpath("//button[contains(text(),'Search')]")).click();
				WebDriverWait wait = new WebDriverWait(driver, 3);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Edit']")));
				driver.findElement(By.xpath("//a[@title='Edit']")).click();
				
				Assert.assertEquals(driver.getTitle(), "Acss - Edit");
				driver.navigate().back();
				//info
				
				WebDriverWait wait1 = new WebDriverWait(driver, 3);
				wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='More information']")));
				driver.findElement(By.xpath("//a[@title='More information']")).click();
				
				Assert.assertEquals(driver.getTitle(), "Acss");
				driver.navigate().back();
				driver.findElement(By.xpath("//*[@id='logout']/span/a")).click();
				
				driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Vignesh.Jayagopal@virginmedia.co.uk");
				driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Prodapt*67");
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				
				/*driver.findElement(By.xpath("//*[@id='s2id_clientSwitcher']/a/span[2]/b")).click();
				driver.findElement(By.xpath("//*[@id='select2-result-label-4']")).click();*/
	}

}
