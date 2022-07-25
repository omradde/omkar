package AutoPrograms;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class Screenshot2 {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		String rm= RandomString.make(5);
		String path="C:\\Users\\omkar\\eclipse-workspace\\AutomationMain\\src\\test\\java\\scrinshot1";
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File destn=new File(path+"//"+rm+".png");
		FileUtils.copyFile(src, destn);
		
	}
public static void getcapture(WebDriver driver) throws IOException {
	
	//by using this(getcapture) method we can access anywhere in package,or we can capture screenshot everywhere. 
	//how to call - classname.getcapture(driver);
	
	String rm= RandomString.make(5);		
	String path="C:\\Users\\omkar\\eclipse-workspace\\AutomationMain\\src\\test\\java\\scrinshot1";
	TakesScreenshot ts = (TakesScreenshot) driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File destn=new File(path+"//"+rm+".png");
	FileUtils.copyFile(src, destn);
	driver.close();
	
}
	
}
