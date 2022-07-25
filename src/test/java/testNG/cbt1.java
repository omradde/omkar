package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cbt1 {
	WebDriver driver;
	
	@Parameters({"BrowserName"})
	@BeforeMethod
	public void a1(String BrowserName ) {
		if(BrowserName.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}
		else if(BrowserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			 driver=new EdgeDriver();
			driver.manage().window().maximize();
		}
	}
		@Test
		public void test4() {
		driver.get("https://www.google.co.in/");
	}
		@AfterMethod
		public void an1() {
			driver.close();
		}
}
