package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class crossbrowser {
	WebDriver driver; 
	@Parameters({"BrowserName"})
	@BeforeMethod
	public void op(String BrowserName) {
		if(BrowserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		}
		else if (BrowserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			 driver=new EdgeDriver();
			driver.manage().window().maximize();
			
		}
		
		
	}
	
	@Test
	public void abc() {
		driver.get("https://web.whatsapp.com/");
	}
	@AfterMethod
	public void b2() {
		driver.close();
	}
	

}
