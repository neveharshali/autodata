package TestNG_Practicals;

import org.testng.annotations.Test;

public class Test_06 {
	@Test(priority=2,invocationCount=3)
	public void A() {
		System.out.println("A test");
	}
	@Test(priority=0,enabled=false)
	public void B() {
		System.out.println("B test");
	}
	@Test(priority=-1)
	public void C() {
		System.out.println("C test");
	}
	@Test(priority=1)
	public void D() {
		System.out.println("D test");
	}
}
