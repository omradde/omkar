package AutoPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigatAndRefresh {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com/login/");
driver.manage().window().maximize();
Thread.sleep(2000);
driver.navigate().to("https://accounts.snapchat.com/accounts/login?client_id=geo");
//driver.navigate().back();
Thread.sleep(3000);
driver.navigate().forward();
Thread.sleep(2000);
driver.navigate().refresh();
driver.navigate().to("https://www.instagram.com/accounts/login/");
Thread.sleep(2000);
driver.navigate().back();		// if we navigate back then command goes for previous webpage
Thread.sleep(2000);

driver.close();

	}

}
