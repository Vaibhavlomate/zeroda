package Test_Ng;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Anotations {
	@BeforeClass
public void openBrowser() {
	Reporter.log("open the browser",true);
}
	@BeforeMethod
	public void loginApp() {
		Reporter.log("login to app",true);
	}
	@Test
	public void verifyId() {
		Reporter.log("verify user id",true);
	}
	@AfterMethod
	public void logoutApp() {
		Reporter.log("logot from app",true);
	}
	@AfterClass
	public void closeTheBrowser() {
		Reporter.log("close the browser",true);
	}
}
