package Webtable_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dyanamic_Elements {
public static void main(String[] args) throws Throwable {
	

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ABC\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	//cancel button inspect
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	//search for mobiles
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobiles under 20000",Keys.ENTER);
	Thread.sleep(3000);
	String review = driver.findElement(By.xpath("(//div[@class='gUuXy-']//span)[6]")).getText();
	System.out.println(review);
	//using descendant
	String review1 = driver.findElement(By.xpath("//div[@class='col col-7-12']/descendant::span[6]")).getText();
	System.out.println(review1);
}
}
