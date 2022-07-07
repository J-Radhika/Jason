package Automation.Jason;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class init_class {
	public static WebDriver driver;
	
	@BeforeTest
	public void launchbrowser()
	{
		System.setProperty("webdriver.edge.driver", "H:\\Automation\\drivers\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin.staging.virginwifi.com/login");
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Vignesh.Jayagopal@virginmedia.co.uk");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Prodapt*67");
		driver.findElement(By.xpath("//button[@type='submit']")).click();


}
	
	
}
