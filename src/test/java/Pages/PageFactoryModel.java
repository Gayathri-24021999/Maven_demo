package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PageFactoryModel {
	
	@FindBy(id="id_user_email")
	WebElement UserName;
	
	@FindBy(id="id_password")
	WebElement Password;
	
	@FindBy(id="sign_in_form")
	WebElement signIn;
	
	WebDriver driver;
	
	public PageFactoryModel(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, PageFactoryModel.class);
	}
	
	public void EnterUserName(String username) {
		UserName.sendKeys("gayathri.p+15@schnellenergy.com");
		
	}
	
	public void EnterPassword(String password) {
		Password.sendKeys("password");
		
	}
	public void clickonSignin() {
		signIn.click();
		
	}

}
