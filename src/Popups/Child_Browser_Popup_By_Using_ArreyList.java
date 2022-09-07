package Popups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_Browser_Popup_By_Using_ArreyList {
public static void main(String[] args) throws Throwable {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ABC\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	//cancel button inspect
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	//search for mobiles
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobiles");
	//click on search button
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	Thread.sleep(3000);
	//click on first mobile so that new child open hoil
	driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
	//by default selenium cha control ha main webpage var asto tyalka aaplyala child browse var nayave lagel
	Set<String> allws = driver.getWindowHandles();
	ArrayList<String> al=new ArrayList<String>(allws);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
