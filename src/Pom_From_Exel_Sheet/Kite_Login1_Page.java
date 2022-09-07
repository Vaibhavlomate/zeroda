package Pom_From_Exel_Sheet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Login1_Page {

	//declaratoin
		@FindBy(xpath="//input[@id='userid']")private WebElement UN;
		@FindBy(xpath="//input[@id='password']")private WebElement PWD;
		@FindBy(xpath="//button[@class='button-orange wide']")private WebElement LOGINBTN;
		//initialization
		public Kite_Login1_Page (WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
		//implementation or utilization
		public void UN(String username) {
			UN.sendKeys(username);
		}
		public void PWD(String password) {
			PWD.sendKeys(password);
		}
		public void LOGINBTN() {
			LOGINBTN.click();
		}
	}

