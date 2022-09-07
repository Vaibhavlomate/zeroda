package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Popup {
public static void main(String[] args) throws Throwable {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ABC\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://nxtgenaiacademy.com/alertandpopup/");
	driver.findElement(By.xpath("//button[@name='promptalertbox1234']")).click();
Alert alt = driver.switchTo().alert();
      alt.accept();
      Thread.sleep(3000);
      //2nd popup var click i.e/inspect it
      driver.findElement(By.xpath("//button[@name='confirmalertbox']")).click();
      //alt.accept();
      String text = alt.getText();
      System.out.println(text);
     
	
}
}
