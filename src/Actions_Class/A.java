package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A {
public static void main(String[] args) throws Throwable {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ABC\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.facebook.com/");
	driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	Thread.sleep(3000);
	WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
	Actions act=new Actions(driver);
	Thread.sleep(3000);
	act.click(day).perform();
	act.sendKeys(Keys.ARROW_UP).perform();//
	act.sendKeys(Keys.ARROW_UP).perform();
	act.sendKeys(Keys.ARROW_UP).perform();
	Thread.sleep(3000);
	act.sendKeys(Keys.ARROW_UP).perform();
	act.sendKeys(Keys.ARROW_UP).perform();
}
}
