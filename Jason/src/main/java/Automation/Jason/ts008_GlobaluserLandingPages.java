package Automation.Jason;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;



public class ts008_GlobaluserLandingPages extends init_class {
	
	@Test(priority=7)
	public static void landingPages()
	{
		driver.findElement(By.xpath("//*[@id='left-panel']/nav/ul/li[5]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"left-panel\"]/nav/ul/li[5]/ul/li/a")).click();
		//Adding new data
		driver.findElement(By.xpath("//div//a[@title='Add New']")).click();
		Assert.assertEquals(driver.getTitle(),"Datafields - Create");
		
		driver.findElement(By.name("name")).sendKeys("Test");
		driver.findElement(By.xpath("//*[@id='s2id_type']/a/span[2]")).click();
		driver.findElement(By.xpath("//*[@id='s2id_autogen2_search']")).sendKeys("Email");
		driver.findElement(By.xpath("//div[@class='select2-result-label']")).click();
		driver.findElement(By.name("placeholder")).sendKeys("Test");
		driver.findElement(By.name("info")).sendKeys("Testing");
		driver.findElement(By.xpath("//*[@id='s2id_personal']/a/span[2]")).click();
		driver.findElement(By.xpath("//*[@id='s2id_autogen3_search']")).sendKeys("No");
		driver.findElement(By.xpath("//*[@class='select2-result-label']")).click();
		driver.findElement(By.xpath("//*[@id='s2id_editable']/a/span[2]")).click();
		driver.findElement(By.xpath("//*[@id='s2id_autogen4_search']")).sendKeys("Yes");
		driver.findElement(By.xpath("//div[@class='select2-result-label']")).click();
		driver.findElement(By.name("validation")).sendKeys("Tested");
		
		driver.findElement(By.xpath("//*[@id='s2id_chartable']/a/span[2]")).click();
		driver.findElement(By.xpath("//*[@id='s2id_autogen5_search']")).sendKeys("Yes");
		driver.findElement(By.xpath("//div[@class='select2-result-label']")).click();
		
		driver.findElement(By.xpath("//*[@id='s2id_repeatable']/a/span[2]")).click();
		driver.findElement(By.xpath("//*[@id='s2id_autogen6_search']")).sendKeys("Yes");
		driver.findElement(By.xpath("//div[@class='select2-result-label']")).click();
		
		driver.findElement(By.xpath("//*[@id='s2id_prefill']/a/span[2]")).click();
		driver.findElement(By.xpath("//*[@id='s2id_autogen7_search']")).sendKeys("Yes");
		driver.findElement(By.xpath("//div[@class='select2-result-label']")).click();
		
		driver.findElement(By.xpath("//*[@id='content']/div/div/form/div[13]/div/div/button")).click();
		
		
		
		driver.navigate().back();
		
		//Edit
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("MAG_Visit");
		driver.findElement(By.xpath("//button[contains(text(),'Search')]")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 3);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Edit']")));
		driver.findElement(By.xpath("//a[@title='Edit']")).click();
		
		Assert.assertEquals(driver.getTitle(), "Datafields - Edit");
		driver.navigate().back();
		//info
		
		WebDriverWait wait1 = new WebDriverWait(driver, 3);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='More information']")));
		driver.findElement(By.xpath("//a[@title='More information']")).click();
		
		Assert.assertEquals(driver.getTitle(), "Datafields");
		driver.navigate().back();
		
		
		//View info
	}

}
