package Pom_From_Exel_Sheet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Home_Page {


	//declaration
	@FindBy(xpath="//span[@class='user-id']")private WebElement userId;
	//initialization
	public Kite_Home_Page (WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//implementation
	public void userId(String expId) {
		String actId = userId.getText();
		if(expId.equals(actId)) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
	}
}
