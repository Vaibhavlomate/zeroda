package Assert_Methods;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_False {
	@Test
	public void tc1() {
		Reporter.log("hii", true);
		boolean actR=false;
		Assert.assertFalse(actR);
	}
}
