package testNG;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class group {
	WebDriver driver;

	@Test(groups="sanity")
	public void test_1() {
		System.out.println(44445);
	}
	@Test(groups="sanity")
	public void test_2() {
		System.out.println(44445);
}
	@Test(groups="regression")
	public void test_3() {
		System.out.println(44445);
}
	@Test(groups="regression")
	public void test_4() {
		System.out.println(44445);
}
}
