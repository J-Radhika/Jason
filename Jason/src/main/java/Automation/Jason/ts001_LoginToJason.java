package Automation.Jason;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ts001_LoginToJason extends init_class {
	
	@Test
	public void launchbrowser()
	{
		System.out.println("Jason logged in successfully");
	}


}
