package Zeroda;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
public static void main(String[] args) throws Throwable {
	
	FileInputStream file=new FileInputStream("C:\\Users\\ABC\\Downloads\\may7.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("may7");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ABC\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://kite.zerodha.com/dashboard");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	//enter UN
	String UN = sh.getRow(0).getCell(0).getStringCellValue();
	driver.findElement(By.xpath("//input[@id='userid']")).sendKeys(UN);
	//enter PWD
	String PWD = sh.getRow(0).getCell(1).getStringCellValue();
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(PWD);
	//click on login button
	driver.findElement(By.xpath("//button[text()='Login ']")).click();
	//enter PIN
	 String PIN = sh.getRow(0).getCell(2).getStringCellValue();
	driver.findElement(By.xpath("//input[@id='pin']")).sendKeys(PIN);
	//click on continue button
	driver.findElement(By.xpath("//button[text()='Continue ']")).click();
	//verify test case
	String exp = sh.getRow(0).getCell(3).getStringCellValue();
	String act = driver.findElement(By.xpath("//span[@class='user-id']")).getText();
	if(exp.equals(act)) {
		System.out.println("pass");
	}
	else {
		System.out.println("fail");
	}
	
	
	
	
	
	
	
	
	
}
}
