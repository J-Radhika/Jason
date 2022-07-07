package Automation.Jason;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;




public class ts010_GlobaluserClients extends init_class{
	
	@Test(priority=9)
	
	public static void clients()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='left-panel']/nav/ul/li[8]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"left-panel\"]/nav/ul/li[8]/ul/li/a")).click();
		
		//Adding new client
		driver.findElement(By.xpath("//div//a[@title='Add New']")).click();
		Assert.assertEquals(driver.getTitle(), "Clients - Create");
		driver.findElement(By.name("name")).sendKeys("Test");
		driver.findElement(By.name("name_full")).sendKeys("Check Test");
		driver.findElement(By.xpath("//*[@id='DataTables_Table_0']/tbody/tr[2]/td[4]/input")).click();
		driver.findElement(By.xpath("//*[@id='content']/div/div/form/div[4]/div/div/button")).click();
		driver.navigate().back();
		
		
		//edit
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Pendragon");
		driver.findElement(By.xpath("//button[contains(text(),'Search')]")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 3);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Edit']")));
		driver.findElement(By.xpath("//a[@title='Edit']")).click();
		
		Assert.assertEquals(driver.getTitle(), "Clients - Edit");
		driver.navigate().back();
		//info
		
		WebDriverWait wait1 = new WebDriverWait(driver, 3);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='More information']")));
		driver.findElement(By.xpath("//a[@title='More information']")).click();
		
		Assert.assertEquals(driver.getTitle(), "Clients");
		driver.navigate().back();
		
	
	}

}
