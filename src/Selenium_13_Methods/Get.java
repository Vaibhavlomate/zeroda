package Selenium_13_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ABC\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver Driver=new ChromeDriver();
	Driver.get("https://www.google.com/");       //eth nit bagh com nantar / aal aahe to url copy kartana nasto
}
}
