package Automation.Jason;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ts013_RIPA extends init_class {
	
	@Test(priority=12)
	public static void ripaServices() {
		
		driver.findElement(By.xpath("//*[@id='left-panel']/nav/ul/li[11]/a/span")).click();
		driver.findElement(By.xpath("//*[@id='left-panel']/nav/ul/li[11]/ul/li/a")).click();
		
	}

}
