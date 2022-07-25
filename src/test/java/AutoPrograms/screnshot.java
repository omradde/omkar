package AutoPrograms;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class screnshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525805964%7Ce%7Cfacebook%20sign%20up%7C&placement=&creative=550525805964&keyword=facebook%20sign%20up&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221832%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-5066597374%26loc_physical_ms%3D1007788%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=Cj0KCQjwidSWBhDdARIsAIoTVb0SERFtlBhHTC3tDVS5qVK1kks4WVnBAzgfB-e4X9RE4kLe71LA3ZIaAmEGEALw_wcB");
		driver.manage().window().maximize();
		
		String rm=RandomString.make();
		String path="C:\\Users\\omkar\\eclipse-workspace\\AutomationMain\\src\\test\\java\\scrinshot1";


TakesScreenshot ts=(TakesScreenshot) driver;
File src=ts.getScreenshotAs(OutputType.FILE);
File destn = new File(path+"//"+rm+".png");
FileUtils.copyFile(src, destn);
Thread.sleep(3000);
driver.close();
	}

}
