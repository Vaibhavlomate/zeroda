package Multibrowser_Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class B {
	@Test
	public void tc1() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ABC\\Downloads\\geckodriver-v0.31.0-win32\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com/");	
	}
}
