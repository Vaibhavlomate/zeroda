package Droup_Down;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselectable_Droup_Down {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ABC\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/ABC/Documents/Paradise.HTML");
	driver.manage().window().maximize();
	WebElement droupdown = driver.findElement(By.xpath("//select[@id='Paradise']"));
	Select s=new Select(droupdown);
	//s.selectByIndex(3);
	if(s.isMultiple()) {
		System.out.println("given droup down is multiple");
	}
	else {
		System.out.println("given droup down is not multiple");
	}
	
	List<WebElement> alloptions = s.getOptions();
	System.out.println(alloptions.size());
	
	for(WebElement oneoption:alloptions) {
		String text = oneoption.getText();
		System.out.println(text);
	}
	
	
}
}