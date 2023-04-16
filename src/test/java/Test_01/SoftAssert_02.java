package Test_01;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert_02 {
	@Test
	public void verify_Test_01() {
		System.out.println("Test_01");
		System.out.println("Hello_Everyone");
		
		String Expected="HELLO";
		String actual="hello";
		
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(actual, Expected);
		System.out.println("Test_Done");
		
		soft.assertAll();
	}
	@Test
	public void verify_Test_02() {
		System.out.println("Test_02");
		System.out.println("Hello_Everyone");
		
		String Expected="HELLO";
		String actual="HELLO";
		
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(actual, Expected);
		System.out.println("Test_Done");
		
		//soft.assertAll();
	}


}
