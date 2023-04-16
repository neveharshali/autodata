package TestNG_Practicals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_07 {
	@Test(enabled=false)
	public void B() {
		System.out.println("B TEST ");
	}
	@Test(dependsOnMethods="A")
	public void C() {
		System.out.println("C TEST ");
	}
	@Test
	public void A() {
		System.out.println("A TEST ");
		//Assert.assertTrue(false);
	}

}
