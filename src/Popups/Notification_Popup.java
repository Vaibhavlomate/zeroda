package Popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification_Popup {
public static void main(String[] args) throws Throwable {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ABC\\Downloads\\chromedriver_win32\\chromedriver.exe");
	ChromeOptions c= new ChromeOptions();
	c.addArguments("--disable-notifications");
	Thread.sleep(3000);
	WebDriver driver=new ChromeDriver(c);
	driver.get("https://www.hdfcbank.com/");
	
	
}
}