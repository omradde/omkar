package testNG;

import org.junit.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	@Test
	public void a1() {
		System.out.println("email");
		System.out.println("password");
		System.out.println("loginn button");
		String Expected="test";
		String Actual="test01";
		Assert.assertEquals(Expected, Actual);
		System.out.println("browser close");
		
	}
	@Test
	public void a2() {
		System.out.println("this is a2");
	}

}
