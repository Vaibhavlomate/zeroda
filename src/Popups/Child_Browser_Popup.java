package Popups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_Browser_Popup {
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
	for(String singlew:allws) {
		driver.switchTo().window(singlew);   //aata tuza control c.browse var aala
	}
	//for conformation get the text of c.browser
	Thread.sleep(3000);
	String extT=("realme C21 (Cross Blue, 32 GB)  (3 GB RAM)");
	String actT = driver.findElement(By.xpath("//span[@class='B_NuCI']")).getText();
	System.out.println(actT);
	Thread.sleep(3000);
	//varify kar c.window handle zali ka nahi by using if condition
	if(actT.equals(extT)) {
	System.out.println("child window is handeled and test case is pass");
	}
	else {
		System.out.println("test case is fail");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
