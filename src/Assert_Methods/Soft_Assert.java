package Assert_Methods;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert {
	@Test
	public void tc1() {
		Reporter.log("hii", true);
		String expR="hii";
		String actR="byy";
		SoftAssert s=new SoftAssert();
		s.assertEquals(expR, actR);     //verification
		System.out.println("i am after failed verification");
		s.assertAll();
	}
	@Test
	public void tc2() {
		Reporter.log("Hi", true);
	}
}
