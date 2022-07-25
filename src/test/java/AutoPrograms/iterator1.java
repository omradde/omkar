package AutoPrograms;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iterator1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");		
		driver.manage().window().maximize();
		driver.findElement(By.name("field-keywords")).sendKeys("iphone iphone Apple iPhone 13 (128GB) - Blue");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		String parentwindadd=driver.getWindowHandle();
		driver.findElement(By.xpath("//span[text()='Apple iPhone 13 (128GB) - Blue']")).click();
Set<String> alladdress=driver.getWindowHandles();
Iterator <String> it=alladdress.iterator();
while(it.hasNext()) {
	String childwindadd=it.next();
	if(!parentwindadd.equals(childwindadd));
	driver.switchTo().window(childwindadd);
	WebElement addtoCart=driver.findElement(By.xpath("//input[@name='submit.buy-now']"));
JavascriptExecutor js=(JavascriptExecutor) driver;
js.executeScript("aguments[0].ScrollIntoView", addtoCart);
driver.close();

}
driver.switchTo().window(parentwindadd);
driver.close();
	}

	
}
