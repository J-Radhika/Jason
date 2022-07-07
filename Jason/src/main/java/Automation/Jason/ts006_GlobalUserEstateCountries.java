package Automation.Jason;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;



public class ts006_GlobalUserEstateCountries extends init_class {
	@Test(priority=5)
	public static void estateCountries()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='left-panel']/nav/ul/li[3]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"left-panel\"]/nav/ul/li[3]/ul/li[1]/a")).click();
		//Adding new country
		driver.findElement(By.xpath("//div//a[@title='Add New']")).click();
		Assert.assertEquals(driver.getTitle(), "Countries - Create");
		driver.findElement(By.name("name")).sendKeys("Test");
		driver.findElement(By.name("code")).sendKeys("100");
		driver.findElement(By.xpath("//*[@id='DataTables_Table_0']/tbody/tr[2]/td[4]/input")).click();
		driver.findElement(By.xpath("//*[@id='content']/div/div/form/div[4]/div/div/button")).click();
		
		driver.navigate().back();
		
		//Edit
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Jersey");
		driver.findElement(By.xpath("//button[contains(text(),'Search')]")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 3);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Edit']")));
		driver.findElement(By.xpath("//a[@title='Edit']")).click();
		
		Assert.assertEquals(driver.getTitle(), "Countries - Edit");
		driver.navigate().back();
		//info
		
		WebDriverWait wait1 = new WebDriverWait(driver, 3);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='More information']")));
		driver.findElement(By.xpath("//a[@title='More information']")).click();
		
		Assert.assertEquals(driver.getTitle(), "Countries");
		driver.navigate().back();
		
		
		
		
		//info
		
	}
}
