package Pom_From_Exel_Sheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pom.Kite_Login1_Page;

public class Kite_Login_Page {
public static void main(String[] args, String expId) throws Throwable {
	FileInputStream file=new FileInputStream("\"C:\\Users\\ABC\\Downloads\\may7.xlsx\"");
	Sheet sh = WorkbookFactory.create(file).getSheet("may7");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ABC\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://kite.zerodha.com/dashboard");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	//1st pom class la call
	 String username = sh.getRow(0).getCell(0).getStringCellValue();
	 Kite_Login1_Page login1=new Kite_Login1_Page(driver);
	 login1.UN(username);
	 //for password
	 String password = sh.getRow(0).getCell(1).getStringCellValue();
	 login1.PWD(password);
	 //click on login button
	 login1.LOGINBTN();
	 //call 2nd pom class
	 Kite_Login2_Page login2=new Kite_Login2_Page(driver);
	 String pin = sh.getRow(0).getCell(2).getStringCellValue();
	 login2.PIN(pin);
	 login2.CNTBTN();
	 //call 3rd pom class
	 Kite_Home_Page login3=new Kite_Home_Page(driver);
	 String userId = sh.getRow(0).getCell(3).getStringCellValue();
	 login3.userId(expId);  //eth ()madhe expId jari takal tari ans yetay ani userId takal tari ans yetay
	 driver.close();
}
}
