package TestNG_Practicals;

import org.testng.annotations.Test;

public class Test_05 {

	@Test(priority=-1)
	public void A() {
		System.out.println("Test A");
	}
	@Test(priority=1)
	public void C() {
		System.out.println("Test C");
	}
	@Test(priority=0)
	public void B() {
		System.out.println("Test B");
	}



}
