															package Pom;

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
	public Kite_Login1_Page(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//implementation or utilization
	public void UN() {
		UN.sendKeys("DPG458");
	}
	public void PWD() {
		PWD.sendKeys("Amol@1234");
	}
	public void LOGINBTN() {
		LOGINBTN.click();
	}
	public void UN(String username) {
		// TODO Auto-generated method stub
		
	}
	public void PWD(String password) {
		// TODO Auto-generated method stub
		
	}
}
