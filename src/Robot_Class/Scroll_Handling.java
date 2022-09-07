package Robot_Class;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Handling {
public static void main(String[] args) throws Throwable {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ABC\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amezon.com/");
	JavascriptExecutor jse=(JavascriptExecutor)driver;
    jse.executeScript("window.scrollBy(0,2000);");
    Thread.sleep(3000);
    jse.executeScript("window.scrollBy(0,-2000);");
    
}
}
