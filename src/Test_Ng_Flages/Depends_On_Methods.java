package Test_Ng_Flages;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Depends_On_Methods {
	@Test(priority=4)
	public void tc1() {
		Reporter.log("byy",true);
	}
	@Test(dependsOnMethods = {"tc1"}) 
		public void tc2() {
			Reporter.log("fine",true);
		}
}
