package Robot_Class;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Prticular_Logo_Print {
public static void main(String[] args) throws Throwable {
	

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ABC\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	WebElement gettitle = driver.findElement(By.xpath("//img[@class='lnXdpd']"));
	File src = gettitle.getScreenshotAs(OutputType.FILE);
	File dest=new File("C:\\Screenshot\\google.jpg");
	Files.copy(src, dest);
	
	
}
}
