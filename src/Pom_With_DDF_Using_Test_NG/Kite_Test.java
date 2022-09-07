package Pom_With_DDF_Using_Test_NG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Kite_Test {
	//declare aal usefual members as globally
	 Kite_Login1_Page_NG login1;
	 Kite_Login2_Page_NG login2;
	 Kite_Home_Page_NG login3;
	 WebDriver driver;
	 Sheet sh;
@BeforeClass
public void openBrowser() throws Throwable {
	FileInputStream file=new FileInputStream("C:\\Users\\ABC\\Downloads\\may7.xlsx");
	 sh=WorkbookFactory.create(file).getSheet("may7");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ABC\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/dashboard");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();

	
	
	//all objects of pom classes
	 login1=new Kite_Login1_Page_NG (driver);   //login 1 chya agodarr kite-login1-page hot te cut kelay as a globally dseclare kel aahe
	 login2=new Kite_Login2_Page_NG(driver);
     login3=new  Kite_Home_Page_NG(driver); 
}
@BeforeMethod
public void loginToApp() {
	//enter UN
	 String username = sh.getRow(0).getCell(0).getStringCellValue();
	 login1.UN(username);
	 //enter PWD
	 String password = sh.getRow(0).getCell(1).getStringCellValue();
	 login1.PWD(password);
	 //click on login BTN
	 login1.LOGINBTN();
	 
	 //enter pin
	 String pin = sh.getRow(0).getCell(2).getStringCellValue();
	 login2.PIN(pin);
	 //click on login BTN
	 login2.CNTBTN();
}
@Test
public void verifyUserId() {
	Reporter.log("running verify user id", true);
	String actId=login3.userId();
	 String expId = sh.getRow(0).getCell(3).getStringCellValue();
	// String actId=null;
	Assert.assertEquals(expId, actId,"both are different tc is failed");   //he check kar
}
@AfterMethod
public void logOutApp() {
	Reporter.log("logout the application", true);
}
@AfterClass
public void closeTheBrowser() {
	Reporter.log("close the browser", true);
}
}
