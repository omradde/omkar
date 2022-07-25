package AutoPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window().maximize(); 
		Actions act =new Actions(driver);
		WebElement src=driver.findElement(By.xpath("//h5[text()='High Tatras']"));
		WebElement destn=driver.findElement(By.id("trash"));
		act.dragAndDrop(src, destn).build().perform();
	}

}
