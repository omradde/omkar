package AutoPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	private static WebElement element;





	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("https://demo.guru99.com/test/newtours/register.php");
driver.manage().window().maximize();
WebElement country=driver.findElement(By.xpath("//select[@name='country']"));

Select select=new Select(country);

Thread.sleep(2000);
select.selectByIndex(4);			//select by index
Thread.sleep(2000);

select.selectByValue("THAILAND");			//select by value
Thread.sleep(2000);


select.selectByVisibleText("SWITZERLAND");		//select by visible text
//System.out.println(select.getFirstSelectedOption().getText());	//switzerland
List<WebElement>list=select.getOptions();

for (int a=0;a<list.size();a++) {
	Thread.sleep(2000);				//program runs,we got all countries names(values)
String value=list.get(a).getText();		//we got all the values from dropdown
System.out.println(value);

if (value.equals("AUSTRALIA")) {
	select.selectByVisibleText("AUSTRALIA");
	break;
}

}

	


		
	



	}

}






