package TestNG_Practicals;

import org.testng.annotations.Test;

public class Test_08 {
	@Test(groups="sanity")
	public void A() {
		System.out.println("Test A");
	}
	@Test(groups="critical Regression")
	public void B() {
		System.out.println("Test B");
	}
	@Test(groups="Regression")
	public void C() {
		System.out.println("Test C");
	}
	@Test(groups="Regression")
	public void D() {
		System.out.println("Test D");
	}
}
