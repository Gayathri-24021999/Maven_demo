package Xserp;

//import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.XserpPage;
import io.github.bonigarcia.wdm.WebDriverManager;


public class LoginXserp {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		XserpUser();
		
	}
	
	
	public static void XserpUser() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://qa.xserp.in/erp");
		
		XserpPage.UserName(driver).sendKeys("gayathri.p+15@schnellenergy.com");
		XserpPage.Password(driver).sendKeys("password");
		XserpPage.signIn(driver).click();
		

		
	}

}
