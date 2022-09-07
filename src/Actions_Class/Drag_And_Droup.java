package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_Droup {
public static void main(String[] args) throws Throwable {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ABC\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	WebElement element1 = driver.findElement(By.xpath("//div[@id='box1']"));
	WebElement element2 = driver.findElement(By.xpath("//div[@id='countries']"));
	Thread.sleep(3000);
	Actions act=new Actions(driver);
	act.dragAndDrop(element1, element2).perform();
	
}
}
