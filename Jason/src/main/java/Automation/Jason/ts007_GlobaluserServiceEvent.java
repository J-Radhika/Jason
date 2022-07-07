package Automation.Jason;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;



public class ts007_GlobaluserServiceEvent extends init_class {
	@Test(priority=6)
	public static void serviceEvent()
	{
		driver.findElement(By.xpath("//*[@id='left-panel']/nav/ul/li[4]/a/span")).click();
		driver.findElement(By.xpath("//*[@id='left-panel']/nav/ul/li[4]/ul/li/a")).click();
		
		//adding new service event
		driver.findElement(By.xpath("//div//a[@title='Add New']")).click();
		Assert.assertEquals(driver.getTitle(), "Serviceevents - Create");
		
		WebDriverWait wait1 = new WebDriverWait(driver, 3);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='DataTables_Table_0']/tbody/tr[1]/td[4]/input")));
		
		
		driver.findElement(By.xpath("//*[@id='DataTables_Table_0']/tbody/tr[1]/td[4]/input")).click();
		driver.findElement(By.name("message")).sendKeys("testing");
		driver.findElement(By.name("description")).sendKeys("Test");
		driver.findElement(By.name("limit_download_speed")).sendKeys("20");
		driver.findElement(By.name("limit_upload_speed")).sendKeys("10");
		driver.findElement(By.name("session_timeout")).sendKeys("1");
		driver.findElement(By.name("active_from")).click();
		driver.findElement(By.name("active_to")).click();
		driver.findElement(By.xpath("//*[@id='content']/div/div/form/div[9]/div/div/button")).click();
		
		driver.navigate().back();
		
		
		//edit
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Jersey");
		driver.findElement(By.xpath("//button[contains(text(),'Search')]")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 3);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='DataTables_Table_0']/tbody/tr[1]/td[9]/div/a[2]")));
		driver.findElement(By.xpath("//*[@id='DataTables_Table_0']/tbody/tr[1]/td[9]/div/a[2]")).click();
		
		Assert.assertEquals(driver.getTitle(), "Serviceevents");
		driver.navigate().back();
		//info
		
		WebDriverWait wait11 = new WebDriverWait(driver, 3);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='DataTables_Table_0']/tbody/tr[1]/td[9]/div/a[1]")));
		driver.findElement(By.xpath("//*[@id='DataTables_Table_0']/tbody/tr[1]/td[9]/div/a[1]")).click();
		
		Assert.assertEquals(driver.getTitle(), "Serviceevents");
		driver.navigate().back();
		
	}

}
