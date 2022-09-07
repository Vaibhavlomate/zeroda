package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
public static void main(String[] args) throws Throwable {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ABC\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.switchTo().frame("packageListFrame");
	String text = driver.findElement(By.xpath("//a[text()='org.openqa.selenium']")).getText();
	System.out.println(text);
	Thread.sleep(3000);
	driver.switchTo().defaultContent();
	driver.switchTo().frame("packageFrame");
	String text1 = driver.findElement(By.xpath("//a[text()='AbstractAnnotations']")).getText();
	System.out.println(text1);
	driver.switchTo().defaultContent();
	driver.switchTo().frame("classFrame");
	String text2 = driver.findElement(By.xpath("//a[text()='org.openqa.selenium']")).getText();
	System.out.println(text2);
}
}
