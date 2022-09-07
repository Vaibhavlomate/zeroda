package Popups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Moving_Contro_From_CHild_To_Main_Browser {
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
	//use arraylist to store all windows
	ArrayList<String> al=new ArrayList<String>(allws);
	String cw = al.get(1);
	System.out.println(cw);
	Thread.sleep(3000);
	//print session id of main browser now
	String mw = al.get(0);
	System.out.println(mw);
	//switch to main window
	driver.switchTo().window(al.get(0));
	//for conformation get title or get text karun bagh jar aal tar tuza control m.browser var aahe
	String title = driver.getTitle();
	System.out.println(title);
	String expT=("Mobiles- Buy Products Online at Best Price in India - All Categories | Flipkart.com");
	//if condition waprun bafg pass hotiy ka test case
	if(title.equals(expT)) {
		System.out.println("pass");
	}
	else {
		System.out.println("fail");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
