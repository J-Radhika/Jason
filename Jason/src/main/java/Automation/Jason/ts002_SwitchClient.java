package Automation.Jason;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;





public class ts002_SwitchClient extends init_class{
	@Test(priority=1)
	public static void switchClient() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id='left-panel']/nav/ul/li[2]/a/span")).click();
		driver.findElement(By.xpath("//*[@id='left-panel']/nav/ul/li[2]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("vignesh");
		driver.findElement(By.xpath("//button[contains(text(), 'Search')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@data-model='internalusers']/tbody/tr/td[6]/div/a[3]")).click();
		driver.findElement(By.xpath("//div[@id='addrole']")).click();
		driver.findElement(By.xpath("//div[@id='s2id_autogen22']/a/span[2]/b")).click();
		driver.findElement(By.xpath("//input[@id='s2id_autogen23_search']")).sendKeys("Test Client 1");
		driver.findElement(By.xpath("//*[@class='select2-result-label']")).click();
		driver.findElement(By.xpath("//*[@id='content']/div/div/form/div[8]/div/div/button")).click();
		driver.navigate().refresh();
		/*driver.findElement(By.xpath("//*[@id='logout']/span/a")).click();
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Vignesh.Jayagopal@virginmedia.co.uk");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Prodapt*67");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//*[@id='s2id_clientSwitcher']/a/span[2]/b")).click();
		driver.findElement(By.xpath("//*[@id='select2-result-label-4']")).click();*/
		
	}

}
