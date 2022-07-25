package AutoPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class keyboardKeys {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();  
		Actions act=new Actions(driver);
		WebElement email=driver.findElement(By.name("email"));
		act.keyDown(email, Keys.SHIFT).sendKeys("test");
		act.keyDown(email, Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		act.keyDown(email, Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		WebElement password=driver.findElement(By.xpath("//input[@name='pass']"));
		password.click();
		act.keyDown(password, Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
	}

}
