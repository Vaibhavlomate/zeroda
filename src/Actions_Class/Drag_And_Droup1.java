package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_Droup1 {
public static void main(String[] args) throws Throwable {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ABC\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
	WebElement element1 = driver.findElement(By.xpath("//div[@id='draggable']"));
	WebElement element2 = driver.findElement(By.xpath("//div[@id='droppable']"));
	Thread.sleep(3000);
	Actions act=new Actions(driver);
	act.dragAndDrop(element1, element2).perform();
	
}
}
