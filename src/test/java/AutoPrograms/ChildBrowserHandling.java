package AutoPrograms;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChildBrowserHandling {

	private static Iterator<String> it;

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");		
		driver.manage().window().maximize();
		driver.findElement(By.name("field-keywords")).sendKeys("iphone iphone Apple iPhone 13 (128GB) - Blue");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		
		
		String parentwindAdd=driver.getWindowHandle();
		driver.findElement(By.xpath("//span[text()='Apple iPhone 13 (128GB) - Blue']")).click();
		Thread.sleep(3000);   //prog running till here
		
		
	Set<String> allAddress =driver.getWindowHandles();
	//Thread.sleep(4000);
	Iterator <String> it=allAddress.iterator();
	while(it.hasNext()) {
		String childwindAdd = it.next();
		if(!parentwindAdd.equals(childwindAdd)) {
			driver.switchTo().window(childwindAdd);
	WebElement addtoCart=driver.findElement(By.xpath("//input[@name='submit.buy-now']"));
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].ScrollIntoView",addtoCart);
//	driver.findElement(By.id("add-to-cart-button")).click();
	//Screenshot2.getcapture(driver);
	Thread.sleep(2000);	
	
		driver.close();
		}
	}
	driver.switchTo().window(parentwindAdd);
	//driver.quit();
}
}
