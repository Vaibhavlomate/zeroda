package Selenium_13_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
public static void main(String[] args) throws Throwable {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ABC\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.google.com/");
	Thread.sleep(3000);
	driver.navigate().to("https://www.amazon.com/");
	driver.navigate().back();
	Thread.sleep(3000);
	driver.navigate().forward();
	driver.navigate().refresh();
	driver.get("https://www.google.com/");
}
}
