package Assert_Methods;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_Fail {
	@Test
	public void tc1() {
		Reporter.log("hii", true);
		String expR="hii";
		String actR="hii";
		Assert.fail();   ///tu tc fail keli aahe hi
	}
}
