package XserpLogin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import Xserp.LoginXserp;

public class LoginPage {
	@FindBy(id="id_user_email")
    public static WebElement userName;
	
	@FindBy(id="id_password")
	public static WebElement password;
	
	@FindBy(xpath="//a[text()='Login Again']")
	public static WebElement loginAgainBtn;
	
	@FindBy(id="sign_in_form")
	public static WebElement signIn;
	
	@FindBy(css="#whatNewModal > div > div > div.modal-header > button")
	public static WebElement whatsNew;
	
	public static void main(String[] args) {
		LoginXserp();
		userName.sendKeys("gayathri.p+15@schnellenergy.com");
		password.sendKeys("password");
		signIn.click();
	}

	private static void LoginXserp() {
		// TODO Auto-generated method stub
		
	}

}
