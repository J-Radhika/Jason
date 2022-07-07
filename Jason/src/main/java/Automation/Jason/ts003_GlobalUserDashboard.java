package Automation.Jason;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ts003_GlobalUserDashboard extends init_class{
	@Test(priority=2)
	public static void userDashboard()
	{
		/*driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Vignesh.Jayagopal@virginmedia.co.uk");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Prodapt*67");
		driver.findElement(By.xpath("//button[@type='submit']")).click();*/

		driver.findElement(By.xpath("//*[@id='left-panel']/nav/ul/li[1]/a/i")).click();
		
		driver.findElement(By.xpath("//*[@id='s2id_goal']/a/span[2]")).click();
		driver.findElement(By.xpath("//*[@id='s2id_autogen2_search']")).sendKeys("Customer");
		driver.findElement(By.xpath("//*[@class='select2-result-label']")).click();
		driver.findElement(By.xpath("//input[@name='value']")).sendKeys("Test");
		
		driver.findElement(By.xpath("//*[@id='search-form']/div[3]/div/button")).click();
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("//*[@id='s2id_goal']/a/span[2]")).click();
		driver.findElement(By.xpath("//*[@id='s2id_autogen2_search']")).sendKeys("Device");
		driver.findElement(By.xpath("//*[@class='select2-result-label']")).click();
		
		driver.findElement(By.xpath("//input[@name='mac']")).sendKeys("Test");
		
		driver.findElement(By.xpath("//*[@id='search-form']/div[3]/div/button")).click();
		
		driver.navigate().back();
		
		
		
	}

}
