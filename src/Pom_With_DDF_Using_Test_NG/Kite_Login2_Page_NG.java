package Pom_With_DDF_Using_Test_NG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Login2_Page_NG {

	//declaration
		@FindBy(xpath="//input[@id='pin']")private WebElement PIN;
		@FindBy(xpath="//button[@class='button-orange wide']")private WebElement CNTBTN;
		//initialization
		public Kite_Login2_Page_NG(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
		//implementation
		public void PIN(String pin) {
			PIN.sendKeys(pin);
		}
		public void CNTBTN() {
			CNTBTN.click();
		}
}
