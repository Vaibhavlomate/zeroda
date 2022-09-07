package Key_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
public static void main(String[] args) throws Throwable {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ABC\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
//	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
//	driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
//	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	Thread.sleep(3000);
	//use key class
	driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
}
}
