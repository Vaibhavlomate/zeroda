package Multibrowser_Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class A {
	@Parameters("browsername") //annotation browser ch name pass karatoy
	@Test
	public void tc1(String browsername) {   //parameterised method manaje ()yat lihan
		WebDriver driver=null;
		if(browsername.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ABC\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	 driver=new ChromeDriver();
	}
		else if(browsername.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\ABC\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
			}
		driver.get("https://www.google.com/");
		}
}
