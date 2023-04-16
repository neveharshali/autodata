package Test_01;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_01 {
	//HardAssert
	@Test
	public void verify_Test1() {
		System.out.println("Test_1");
		System.out.println("Email Enter");
		System.out.println("Password Enter");
		System.out.println("Click on login Button");
		
		String Expected="Harshali Neve";
		String actual="harshali neve";
		
		Assert.assertEquals(actual, Expected);//fail
		System.out.println("Test Done");
		
	}
	@Test
	public void verify_Test2() {
		System.out.println("Test_2");
		System.out.println("Email Enter");
		System.out.println("Password Enter");
		System.out.println("Click on login Button");
		
		String Expected="Harshali Neve";
		String actual="Harshali Neve";
		
		Assert.assertEquals(actual, Expected);//PASS
		System.out.println("Test Done");
		
	}


}
