package Droup_Down;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Droup_Down {
public static void main(String[] args) throws Throwable {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ABC\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
	driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	driver.findElement(By.xpath("//b[text()='Admin']")).click();
	Thread.sleep(2000);
	WebElement droupDown = driver.findElement(By.xpath("//select[@id='searchSystemUser_status']"));
	Thread.sleep(2000);
	Select s=new Select( droupDown);
	Thread.sleep(2000);
	//s.selectByIndex(1);
	//s.selectByVisibleText("enabled");
	s.selectByValue("0");
	s.selectByIndex(2);
}
}
