package Test_Ng_Flages;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Invocation_Count {
	@Test(invocationCount=10)
public void tc() {
	Reporter.log("Hi",true);
}
}
