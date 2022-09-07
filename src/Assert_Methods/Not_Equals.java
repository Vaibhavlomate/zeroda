package Assert_Methods;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Not_Equals {
	@Test
	public void tc1() {
		Reporter.log("hii", true);
		String expR="hii";
		String actR="byy";
		Assert.assertNotEquals(expR, actR);
	}
}
