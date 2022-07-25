package testNG;

import org.testng.annotations.Test;

public class Test_1 extends Browser_open {
	
	
	@Test (enabled=false)
	public void Z() {
		driver.get("https://www.google.com");
		
	}
	
	@Test (invocationCount=2)
	public void B() {
		driver.get("https://www.youtube.com");
	}
	
	@Test(dependsOnMethods= {"M"})
	public void R() {
		driver.get("https://maven.apache.org");
	}
	
	@Test()
	public void M() {
		System.out.println("this is M");
	}
	

}
