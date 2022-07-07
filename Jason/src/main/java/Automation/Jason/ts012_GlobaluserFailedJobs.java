package Automation.Jason;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;



public class ts012_GlobaluserFailedJobs extends init_class {
	
	@Test(priority=11)
	public static void failedJobs()
	
	{
		driver.findElement(By.xpath("//*[@id='left-panel']/nav/ul/li[9]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"left-panel\"]/nav/ul/li[9]/ul/li/a")).click();
		driver.findElement(By.xpath("//div//a[@title='Add New']")).click();
		Assert.assertEquals(driver.getTitle(), "Failedjobs - Create");
		driver.navigate().back();
		
		//error undefined api method
		//no data available to check
	}

}
