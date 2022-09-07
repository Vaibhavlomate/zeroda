package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime_App_By_Using_Css_Selector {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ABC\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
    driver.findElement(By.cssSelector("input[type='text']")).sendKeys("admin");
    driver.findElement(By.cssSelector("input[type='password']")).sendKeys("manager");
    driver.findElement(By.id("loginButton")).click();
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


