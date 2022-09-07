package Zeroda;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class With_DDF {
public static void main(String[] args) throws Throwable {
	
   FileInputStream file=new FileInputStream("\"C:\\Users\\ABC\\Downloads\\may7.xlsx\"");
   Sheet sh = WorkbookFactory.create(file).getSheet("may7");
	}
}
