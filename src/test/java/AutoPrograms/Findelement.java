package AutoPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Findelement {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		WebElement email=driver.findElement(By.name("email"));
		email.sendKeys("xmhu56l.com");
		WebElement password=driver.findElement(By.name("pass"));
		password.sendKeys("123245678");
		WebElement login=driver.findElement(By.xpath("//button[text()='Log In']"));
				login.click();
		if(login.isEnabled()) {
			login.click();	
		}
		else {
			System.out.println("login button is disabled");
		}
		
		
	}

}
