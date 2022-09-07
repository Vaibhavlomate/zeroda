package Robot_Class;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import net.bytebuddy.utility.RandomString;

public class Screenshot_By_Using_Rndom_String_Class {
public static void main(String[] args) throws Throwable {

	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ABC\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amezon.com/");
	//eth agodar r.s.class ghe nantar make();ghe nanta small random navacha r.v. ghe
	String random = RandomString.make();
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File dest=new File("C:\\Screenshot\\"+random+".jgp");
	Files.copy(src, dest);
}
}
