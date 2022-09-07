package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Login2_Page {

	//declaration
	@FindBy(xpath="//input[@id='pin']")private WebElement PIN;
	@FindBy(xpath="//button[@class='button-orange wide']")private WebElement CNTBTN;
	//initialization
	public Kite_Login2_Page(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//implementation
	public void PIN() {
		PIN.sendKeys("171992");
	}
	public void CNTBTN() {
		CNTBTN.click();
	}
}
