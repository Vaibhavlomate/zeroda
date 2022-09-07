package Pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kite_Login_Test {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ABC\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://kite.zerodha.com/dashboard");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	//1st pom class la call
	Kite_Login1_Page p1=new Kite_Login1_Page(driver);
	p1.UN();
	p1.PWD();
	p1.LOGINBTN();
	//2nd pom class
	Kite_Login2_Page login2=new Kite_Login2_Page(driver);
	login2.PIN();
	login2.CNTBTN();
	//3rd pom class 
	Kite_Home_Page home=new Kite_Home_Page(driver);
	home.userId();
	driver.close();
}
}
