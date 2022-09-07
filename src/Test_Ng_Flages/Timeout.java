package Test_Ng_Flages;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Timeout {
	@Test(priority=4)
	public void tc1() {
		Reporter.log("byy",true);
	}
	@Test(priority=3)
		public void tc2() {
			Reporter.log("fine",true);
		}
	@Test(priority=2)
		public void tc3() {
			Reporter.log("h.r.u",true);
		}
	@Test(timeOut=3000)
		public void tc4() {
			Reporter.log("Hi",true);
		}
}
