package AutoPrograms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/V4/");
		driver.manage().window().maximize();
driver.findElement(By.name("uid")).sendKeys("sgdgdrg44");
driver.findElement(By.name("password")).sendKeys("dsffd54444");
driver.findElement(By.name("btnLogin")).click();
Alert alt=driver.switchTo().alert();
System.out.println(alt.getText());
Thread.sleep(4000);
alt.accept();		//if there is only ok,then we have to accept the alert


		driver.close();
	}

}
