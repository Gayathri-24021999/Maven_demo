package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XserpPage {
	private static WebElement User = null;
	
	public static WebElement UserName(WebDriver driver) {
	    User = driver.findElement(By.id("id_user_email"));
		return User;
		
	}
	
	public static WebElement Password(WebDriver driver) {
		User = driver.findElement(By.id("id_password"));
		return User;
	}
	
	public static WebElement signIn(WebDriver driver) {
		User = driver.findElement(By.id("sign_in_form"));
		return User;
	}

}
