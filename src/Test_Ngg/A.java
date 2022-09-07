package Test_Ngg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class A {
	@Test
public void tc1() {
	Reporter.log("hii", true);
}
	@Test
public void tc2() {
	Reporter.log("hii", true);
}
	@Test(enabled=false)
public void tc3() {
	Reporter.log("hii", true);
}
}
