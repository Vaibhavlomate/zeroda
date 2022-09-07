package Selenium_13_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Company_Work {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ABC\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
              String exptLink = ("Google");	
	          String actualLink = driver.getTitle();
	if(actualLink.equals(exptLink)) {
		System.out.println("test case is pass");
	}
	else {
		System.out.println("test case is fail");
	}
}
}
