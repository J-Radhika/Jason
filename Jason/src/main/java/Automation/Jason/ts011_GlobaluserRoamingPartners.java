package Automation.Jason;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ts011_GlobaluserRoamingPartners extends init_class
{
	
	@Test(priority=10)
	public static void roamingPartners()
	{
		driver.findElement(By.xpath("//*[@id='left-panel']/nav/ul/li[10]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"left-panel\"]/nav/ul/li[10]/ul/li/a")).click();
		driver.findElement(By.xpath("//div//a[@title='Add New']")).click();
		Assert.assertEquals(driver.getTitle(), "Roamingpartners - Create");
		
		driver.findElement(By.name("name")).sendKeys("iTest");
		driver.findElement(By.name("realm")).sendKeys("Testing");
		WebDriverWait wait = new WebDriverWait(driver,3);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='DataTables_Table_0']/tbody/tr[1]/td[4]/input")));
		
		driver.findElement(By.xpath("//*[@id='DataTables_Table_0']/tbody/tr[1]/td[4]/input")).click();
		driver.findElement(By.xpath("//*[@id='content']/div/div/form/div[5]/div/div/button")).click();
		
		driver.navigate().back();
		
		//edit
				driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iPass");
				driver.findElement(By.xpath("//button[contains(text(),'Search')]")).click();
				
				WebDriverWait wait1 = new WebDriverWait(driver, 3);
				wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Edit']")));
				driver.findElement(By.xpath("//a[@title='Edit']")).click();
				
				Assert.assertEquals(driver.getTitle(), "Roamingpartners - Edit");
				driver.navigate().back();
				//info
				
				WebDriverWait wait2 = new WebDriverWait(driver, 3);
				wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='More information']")));
				driver.findElement(By.xpath("//a[@title='More information']")).click();
				
				Assert.assertEquals(driver.getTitle(), "Roamingpartners");
				driver.navigate().back();
				
	}

}
