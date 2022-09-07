package Relative_X_Path;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class X_Path_By_Attribute {
public static void main(String[] args) throws Throwable {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ABC\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[text()='View Time-Track']")).click();
	WebElement droupdown = driver.findElement(By.xpath("//td[@class='middle-right-cell customLeftPart']"));
	Select s=new Select(droupdown);
	//s.selectByVisibleText("")
	//s.selectByIndex(0);
	//s.selectByVisibleText("//span[@id='ext-gen45']");
	//s.selectByVisibleText("//span[@id='ext-gen45']"); //eth je gheyachay te inspect kar nantar eth chukatos-te gheyachay te jya line la aahe tyala click kar ani tyach tagname,id ghe
	Thread.sleep(3000);
	s.selectByIndex(6);
	
	
	
//	
//	String exptTitle=("actiTIME - Login");
//	String actualTitle=driver.getTitle();
//	if(actualTitle.equals(exptTitle)) {
//		System.out.println("pass");
//	}
//	else {
//		System.out.println("fail");
//	}
}
}
