package XserpLogin;

//import static org.junit.Assert.*;

//import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) {
		
		/*
		 * String Pro = System.getProperty("user.dir"); System.out.println("Pro: "+Pro);
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:/ERP/TestAutomationScripts/Maven_demo/Drivers/ChromeDriver/chromedriver.exe"
		 * ); WebDriver driver = new ChromeDriver();
		 */
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://qa.xserp.in/erp");
		driver.close();
		
	}
	

}
