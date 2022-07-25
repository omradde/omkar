package testNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssets {
	@Test
	public void a10() {
		SoftAssert soft=new SoftAssert();
		System.out.println("email");
		System.out.println("password");
		System.out.println("loginn button");
		String Expected="test";
		String Actual="test01";
		soft.assertEquals(Expected, Actual);
		System.out.println("browser close"); //if exception present then also,it will not show exception
		
		soft.assertAll(); //if we take this then it shows exception

}
}