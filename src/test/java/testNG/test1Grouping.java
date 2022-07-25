package testNG;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class test1Grouping extends browseropen {
	
	WebDriver driver;
	
	
	@Test (groups="Regression")
	public void test1() {
		driver.get("https://www.instagram.com/accounts/login/");
	}
	@Test (groups="Sanity")
	public void test2() {
		driver.get("https://www.facebook.com/login/");
	}
	
	@Test (groups="Regression")
	public void test3() {
		driver.get("https://maven.apache.org/");
	}
@Test(groups="Sanity")
public void test4() {
	driver.get("https://www.youtube.com/");
}
}
