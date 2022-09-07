package Smoke_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Smoke_Testing {
public static void main(String[] args) throws Throwable {
	

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ABC\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	//login page
	String expT=("actiTIME - Login");
	String actT=driver.getTitle();
	if(expT.equals(actT)) {
		System.out.println("pass");
	}
	else {
		System.out.println("fail");
	}
	//Thread.sleep(3000);
	//home page
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	//actual and expected
	String expTH="actiTIME - Enter Time-Track";
	String actTH = driver.getTitle();
	Thread.sleep(3000);
	if(actTH.equals(expTH)) {
		System.out.println("pass");
	}
	else {
		System.out.println("fail");
	}
	/*//type name and clear it
	driver.findElement(By.xpath("//input[@id='taskSearchControl_field']")).sendKeys("ankush");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='taskSearchControl_field']")).clear();*/
}
}
