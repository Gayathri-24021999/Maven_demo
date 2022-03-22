package XserpLogin;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InvoiceTemplatePage {
	private static WebDriver driver;

	//XserpLogin login = PageFactory.initElements(driver, XserpLogin.class);

	@FindBy(id="other-config")
	public static WebElement SettingIcon;

	@FindBy(id="li_print_template")
	public static WebElement PrintTemplate;

	@FindBy(id="a-invoice-template-menu")
	public static WebElement InvoiceTemplate;

	@FindBy(xpath="//*[@id=\'template_add\']/div[1]/div/div[2]/div[1]/ul/li[1]")
	public static WebElement GeneralTab;

	@FindBy(id="id_ith-scan_code_option_0")
	public static WebElement NoneScanCode;

	@FindBy(id="id_ith-scan_code_option_1")
	public static WebElement QrScanCode;

	@FindBy(id="id_ith-scan_code_option_2")
	public static WebElement BarScanCode;

	@FindBy(xpath="//*[@id=\'template_add\']/div[1]/div/div[2]/div[1]/ul/li[2]")
	public static WebElement HeaderTab;

	@FindBy(id="id_ith-include_logo")
	public static WebElement CompanyLogo;

	@FindBy(id="id_ith-include_name")
	public static WebElement CompanyName;

	@FindBy(id="id_ith-include_address")
	public static WebElement EnterpriseAddress;

	@FindBy(id="id_ith-include_phone_no")
	public static WebElement EnterprisePhoneNo;

	@FindBy(id="id_ith-include_email")
	public static WebElement EnterpriseEmail;

	@FindBy(id="id_ith-include_fax")
	public static WebElement EnterpriseFax;

	@FindBy(id="id_ith-include_billingaddress")
	public static WebElement PartyBillAddress;

	@FindBy(id="id_ith-include_partycode")
	public static WebElement PartyCode;

	@FindBy(id="id_ith-include_partyname")
	public static WebElement PartyName;

	@FindBy(id="id_ith-include_party_phoneno")
	public static WebElement PartyPhoneNo;

	@FindBy(id="id_ith-include_party_email")
	public static WebElement PartyEmail;

	@FindBy(id="id_ith-include_shippingaddress")
	public static WebElement PartyShippingAddress;

	@FindBy(id="id_ith-include_pono")
	public static WebElement PoNo;

	@FindBy(id="id_ith-include_podate")
	public static WebElement PoDate;

	@FindBy(id="id_ith-include_estimate_nodate")
	public static WebElement EstimateNoDate;

	@FindBy(id="id_ith-include_transportmode")
	public static WebElement TransportMode;

	@FindBy(id="id_ith-include_lrnodate")
	public static WebElement LrNoDate;

	@FindBy(id="id_ith-include_roadpermitno")
	public static WebElement RoadPermitNo;

	@FindBy(id="id_ith-include_packingslipno")
	public static WebElement PackingSlipNo;

	@FindBy(id="id_ith-include_packingdescription")
	public static WebElement PackingDesc;

	@FindBy(id="id_ith-include_paymentterms")
	public static WebElement PaymentTerms;

	@FindBy(id="id_ith-include_splinstructions")
	public static WebElement SplInstructions;

	@FindBy(id="id_ith-include_preparedsign")
	public static WebElement PreraredBy;

	@FindBy(id="id_ith-include_authorizedsign")
	public static WebElement AuthorisedSign;

	@FindBy(xpath="//*[@id=\'template_add\']/div[1]/div/div[2]/div[1]/ul/li[3]")
	public static WebElement ItemTable;

	@FindBy(id="id_iti-include_sno")
	public static WebElement ItemTableSno;

	@FindBy(id="id_iti-include_itemcode")
	public static WebElement ItemCode;

	@FindBy(id="id_iti-include_make")
	public static WebElement Make;

	@FindBy(id="id_iti-include_partno")
	public static WebElement PartNo;

	@FindBy(id="id_iti-include_oano")
	public static WebElement OaNo;

	@FindBy(id="id_iti-include_dc_no")
	public static WebElement DcNo;

	@FindBy(id="id_iti-include_dc_qty")
	public static WebElement DisableDcQty;

	@FindBy(id="id_iti-include_dc_date")
	public static WebElement DisableDcDate;

	@FindBy(id="id_iti-include_description")
	public static WebElement ItemDisc;

	@FindBy(id="id_iti-include_remarks")
	public static WebElement Remarks;

	@FindBy(id="id_iti-include_hsnsac")
	public static WebElement Hsn;

	@FindBy(id="id_iti-hsnsac_part_of_itemdetails")
	public static WebElement PartItemDetails;

	@FindBy(id="id_iti-include_quantity")
	public static WebElement ItemQty;

	@FindBy(id="id_iti-include_units")
	public static WebElement Units;

	@FindBy(id="id_iti-units_in_quantity_column")
	public static WebElement ItemQtyCol;

	@FindBy(id="id_iti-include_primary_qty")
	public static WebElement ItemPrimaryQty;

	@FindBy(id="id_iti-include_unit_price")
	public static WebElement UnitPrice;

	@FindBy(id="id_iti-include_discount")
	public static WebElement Discount;

	@FindBy(id="id_iti-include_taxable_amount")
	public static WebElement TaxableAmt;

	@FindBy(id="id_iti-include_tax")
	public static WebElement Tax;

	@FindBy(id="id_iti-tax_type_0")
	public static WebElement TaxCol;

	@FindBy(id="id_iti-tax_type_1")
	public static WebElement ConsolSum;

	@FindBy(id="id_iti-tax_type_2")
	public static WebElement PartOfItem;

	@FindBy(id="id_iti-tax_type_3")
	public static WebElement RateandAmt;

	@FindBy(id="id_iti-include_taxrate")
	public static WebElement TaxRate;

	@FindBy(id="id_iti-include_taxamount")
	public static WebElement TaxAmt;

	@FindBy(id="id_iti-show_tax_for_dc")
	public static WebElement TaxForDc;

	@FindBy(id="id_iti-tax_payable_on_reverse_charge_0")
	public static WebElement TaxPrintAlways;

	@FindBy(id="id_iti-tax_payable_on_reverse_charge_1")
	public static WebElement TaxPrintOnly;

	@FindBy(id="id_iti-item_sort_order_0")
	public static WebElement OrderOfEntry;

	@FindBy(id="id_iti-item_sort_order_1")
	public static WebElement ItemName;

	@FindBy(id="id_iti-item_sort_order_2")
	public static WebElement ItemCodeDrawingNo;

	@FindBy(id="id_iti-include_row_separator")
	public static WebElement RowSeparator;

	@FindBy(id="id_iti-include_column_separator")
	public static WebElement ColSeparator;

	@FindBy(id="id_iti-include_alternate_row_shading")
	public static WebElement AlternateRowShading;

	@FindBy(xpath="//*[@id=\'template_add\']/div[1]/div/div[2]/div[1]/ul/li[4]")
	public static WebElement Totals;

	@FindBy(id="id_its-include_total")
	public static WebElement ShowTotal;

	@FindBy(id="id_its-include_subtotal")
	public static WebElement SubTotal;

	@FindBy(id="id_its-include_qty_total")
	public static WebElement QtyTotal;

	@FindBy(id="id_its-include_total_in_words")
	public static WebElement TotalValueWords;

	@FindBy(id="id_its-include_hsn_summary")
	public static WebElement HsnSummary;

	@FindBy(xpath="//*[@id=\'template_add\']/div[1]/div/div[2]/div[1]/ul/li[5]")
	public static WebElement Misc;

	@FindBy(id="id_itm-include_page_no_in_footer")
	public static WebElement PageNumber;

	@FindBy(id="id_itm-include_first_page_summary")
	public static WebElement SummaryFirstPage;

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
	
	@FindBy(className = "active-settings-link")
	public static WebElement seticon;
	
	@FindBy(id="a-logout-menu")
	public static WebElement LogOut;

	@Test
	public void GeneralNoneScan() {
		SettingIcon.click(); 
		PrintTemplate.click();
		InvoiceTemplate.click(); 
		GeneralTab.click();
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Invoice Template";
		Assert.assertEquals(ExpectedTitle, ActualTitle);
		List <WebElement> AllCheckboxes =driver.findElements(By.xpath("//input[@type='checkbox']"));
		if(AllCheckboxes.size() != 0) 
		   {
			   
			   System.err.println(AllCheckboxes.size() + " checkbox is selected \n");
				
			   for(WebElement inputElement : AllCheckboxes) 
			   {
				   System.err.println(inputElement.getAttribute("name"));
			   }
		   }
		
			/*
			 * int checkedCount=0; int UncheckedCount=0; for(int
			 * i=0;i<AllCheckboxes.size();i++) { if(AllCheckboxes.get(i).isSelected()==true)
			 * checkedCount++; else UncheckedCount++; for (WebElement s : AllCheckboxes) {
			 * String strLinkText = s.getAttribute("checkboxfor");
			 * System.out.println(strLinkText);
			 * 
			 * } } System.out.println("Number of checked checkbox are " +checkedCount);
			 * System.out.println("Number of Unchecked checkbox are " +UncheckedCount);
			 */
		  driver.quit();
		 
		
		
			/*
			 * boolean NoneScan = NoneScanCode.isSelected(); try { if(NoneScan == true)
			 * System.err.println("GeneralNoneScan is Checked"); }catch(Exception e) {
			 * System.err.println("GeneralNoneScan is NotChecked" +e); }
			 */
		//InvoiceTemplatePage.LogOut();
		//InvoiceTemplatePage.browserclose();
		
	}
	
	
	 @Test 
	 public void GeneralQrScan() { 
		SettingIcon.click();
		PrintTemplate.click(); 
		InvoiceTemplate.click(); 
		GeneralTab.click(); 
		boolean QrScan = QrScanCode.isSelected(); 
		try {
			if(QrScan != true) 
				System.err.println("GeneralQrScan is NotChecked"); 
		}catch(Exception e) {
			System.err.println("GeneralQrScan is Checked" +e);
	       }
		//InvoiceTemplatePage.LogOut();
		InvoiceTemplatePage.browserclose();
		
	  }
	  
	 
	 @Test
     public void GeneralBarScan() { 
		 SettingIcon.click();
		 PrintTemplate.click(); 
		 InvoiceTemplate.click(); 
		 GeneralTab.click(); 
		 boolean BarScan = BarScanCode.isSelected(); 
		 try {
			 if(BarScan != true) 
				System.err.println("GeneralBarScan is NotChecked"); 
		 }catch(Exception e) {
			 System.err.println("GeneralBarScan is Checked" +e);
		  } 
		 //InvoiceTemplatePage.LogOut();
		 InvoiceTemplatePage.browserclose();
		
	  
	  }
	 

	 @Before
	 public void Xserp() {
		try{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://qa.xserp.in/erp");
			PageFactory.initElements(driver, InvoiceTemplatePage.class);
			WebDriverWait wait = new WebDriverWait(driver,30); 
			userName.sendKeys("gayathri.p+15@schnellenergy.com");
			password.sendKeys("password");
			signIn.click();
			if(whatsNew.isDisplayed()){
				whatsNew.click();
				System.err.println("******Successfully login******");

			}
		}catch(Exception e){
			System.err.println("Login failed "+e);

		}
		
	}
	
	/*
	 * @After public void After() throws Exception{ try{ seticon.click();
	 * InvoiceTemplatePage.LogOut(); }catch(Exception e){
	 * System.err.println("Logout unsuccessfull "+e); } }
	 * 
	 * 
	 * private static void LogOut() { // TODO Auto-generated method stub try{
	 * seticon.click(); InvoiceTemplatePage.LogOut(); }catch(Exception e){
	 * System.err.println("Logout unsuccessfull "+e); }
	 * 
	 * 
	 * }
	 */
	public static void browserclose() {
		try{
			Runtime.getRuntime().exec("taskkill /F /IM plugin-container.exe");
			Runtime.getRuntime().exec("taskkill /F /IM WerFault.exe");
	        driver.quit();
		}
        catch(Exception e){
        	System.err.println("browser close failed "+e);
        }
		
	}

    
	
	
}
