package Automation.Jason;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ts005_GlobaluserUserGroup extends init_class {
	
	@Test(priority=4)
	public static void userGroup()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='left-panel']/nav/ul/li[2]/a/span")).click();
		driver.findElement(By.xpath("//*[@id='left-panel']/nav/ul/li[2]/ul/li[3]/a")).click();
		String heading = driver.getTitle();
		System.out.println(heading);
		
		driver.findElement(By.xpath("//*[@id='content']/div/div/div/table/tbody/tr[1]/td[5]/a[1]")).click();
		Assert.assertEquals(driver.getTitle(),"User Groups Management - Details");
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("//*[@id='content']/div/div/div/table/tbody/tr[1]/td[5]/a[2]")).click();
		Assert.assertEquals(driver.getTitle(),"User Groups Management - Edit");
		driver.navigate().back();
		
		
	}

}
