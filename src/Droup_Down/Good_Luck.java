package Droup_Down;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Good_Luck {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ABC\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
    driver.get("file:///C:/Users/ABC/Documents/Good%20Luck.HTML");
   WebElement droupDown = driver.findElement(By.xpath("//SELECT[@ID='Good Luck']"));
   Select s=new Select(droupDown);
 // s.selectByIndex(0);
 //s.selectByValue("b");
   s.selectByVisibleText("idly");
}
}
