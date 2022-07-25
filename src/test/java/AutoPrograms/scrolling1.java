package AutoPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class scrolling1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();  
		WebElement games=	driver.findElement(By.xpath("//a[text()='Games']"));
		 games.click();			// this is the important way |
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].ScrollIntoView", games);
	 
		Thread.sleep(4000);
		
		driver.close();
		
	
	}

}
