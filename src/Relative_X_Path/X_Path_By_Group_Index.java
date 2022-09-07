package Relative_X_Path;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_Path_By_Group_Index {
public static void main(String[] args) {
	

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ABC\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.xpath("(//input)[3]")).sendKeys("admin");           //jo paryant heighlight hot nahi 1 of 1 to paryant kar
	driver.findElement(By.xpath("(//input)[4]")).sendKeys("manager");
	driver.findElement(By.xpath("(//div)[13]n")).click();
	String exptTitle=("actiTIME - Login");
	String actualTitle=driver.getTitle();
	if(actualTitle.equals(exptTitle)) {
		System.out.println("pass");
	}
	else {
		System.out.println("fail");
	}
}
}
