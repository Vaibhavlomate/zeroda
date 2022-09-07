package Zeroda;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Without_DDF {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ABC\\Downloads\\chromedriver_win32\\chromedriver.exe");
	ChromeOptions c= new ChromeOptions();
	c.addArguments("--disable-notifications");
	WebDriver driver=new ChromeDriver();
	driver.get("https://kite.zerodha.com/dashboard");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("DPG458");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Amol@1234",Keys.ENTER);
	driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("171992");
	driver.findElement(By.xpath("//button[text()='Continue ']")).click();
	//tc pass aahe ka fail check kar
	String exp=("DPG458");
	String act = driver.findElement(By.xpath("//span[@class='user-id']")).getText();
	if(exp.equals(act)) {
		System.out.println("pass");
	}
	else {
		System.out.println("fail");
	}
}
}
