package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Class {
public static void main(String[] args) throws Throwable {
	

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ABC\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	WebElement gamil = driver.findElement(By.xpath("//a[text()='Gmail']"));
	Actions act=new Actions(driver);
	Thread.sleep(3000);
	//move control on particular element
	act.moveToElement(gamil).perform();
	//right click
	//act.moveToElement(gamil).contextClick().perform();
	//left click
	act.moveToElement(gamil).click().perform();
	//double click
	act.moveToElement(gamil).doubleClick().perform();
}
}
