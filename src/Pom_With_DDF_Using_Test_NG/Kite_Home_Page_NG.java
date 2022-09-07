package Pom_With_DDF_Using_Test_NG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Home_Page_NG {

	//declaration
	@FindBy(xpath="//span[@class='user-id']")private WebElement userId;
	//initialization
	public Kite_Home_Page_NG(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//implementation
	public String userId() {
		String actId = userId.getText();
		return actId;
		
	}
}
