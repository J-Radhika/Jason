package Automation.Jason;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ts009_GlobaluserMessages extends init_class{
	
	@Test(priority=8)
	public static void messages()
	{
		driver.findElement(By.xpath("//*[@id='left-panel']/nav/ul/li[7]/a/span")).click();
		driver.findElement(By.xpath("//*[@id='left-panel']/nav/ul/li[7]/ul/li/a")).click();
		
		//Adding new message
		/*driver.findElement(By.xpath("//div//a[@title='Add New']")).click();
		Assert.assertEquals(driver.getTitle(), "Messages");
		driver.findElement(By.xpath("//*[@id='s2id_autogen2']/a/span[2]")).click();
		driver.findElement(By.xpath("//*[@id='s2id_autogen3_search']")).sendKeys("User");
		driver.findElement(By.xpath("//*[@class='select2-result-label']")).click();
		
		
		driver.findElement(By.name("targets_text_0")).sendKeys("Test");
		driver.findElement(By.name("subject")).sendKeys("Testing");
		driver.findElement(By.name("message")).sendKeys("Hello check");
		driver.findElement(By.name("publish_from")).click();
		driver.findElement(By.name("publish_to")).sendKeys("2022-07-25 20:17:27");
		driver.findElement(By.name("btn_save_publish")).click();
		driver.navigate().back();*/
		
		//Edit
		//edit
		/*driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Test");
		driver.findElement(By.xpath("//button[contains(text(),'Search')]")).click();
		
		WebDriverWait wait1 = new WebDriverWait(driver, 3);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Edit']")));
		driver.findElement(By.xpath("//a[@title='Edit']")).click();
		
		Assert.assertEquals(driver.getTitle(), "Messages - Edit");
		driver.navigate().back();
		//info
		
		WebDriverWait wait2 = new WebDriverWait(driver, 3);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='More information']")));
		driver.findElement(By.xpath("//a[@title='More information']")).click();
		
		Assert.assertEquals(driver.getTitle(), "Messages");
		driver.navigate().back();*/
		
		
		//view info
		
		
	}

}
