package AutoPrograms;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mouseActivity {	

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize(); 
		Actions act =new Actions(driver);
		WebElement login=driver.findElement(By.xpath("//button[@id='loginbutton']"));
		act.moveToElement(login);//.click().build().perform();
		Thread.sleep(4000);

	//	act.doubleClick(); if we want to double click on a element,use this method
		
	// act.contextClick(); if we want right click on element,we can use this method
		driver.close();
		
	}

}
