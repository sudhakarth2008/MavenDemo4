package Sudha2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class OR {
	
public static WebDriver driver ; 

public static String SIP_signin_click="//a[ @class='login']";

public static String ACP_email_textbox="//input[@id='email_create']";
public static String ACP_AC_click="//button[ @id='SubmitCreate']";








public static String ACP_MR_button="//input[ @id='id_gender1'  ]";
public static String ACP_firstname_text="//input[@id='customer_firstname']";  
public static String  ACP_lastname_text="//input[ @id='customer_lastname' ]";

public static String  ACP_email_text="//input[ @id='email']";

public static String  ACP_password_text="//input[ @id='passwd']";
public static String  ACP_DOB_DD_Listbox="//select[ @id='days']";
public static String  ACP_DOB_MMM_Listbox="//select[@id='months']";
public static String  ACP_DOB_year_Listbox="//select[@id='years']";




public static String signup_click="//input[  @id='newsletter' ]";
public static String receivesspecial="//input[  @id='newsletter' ]";
public static String firstName_text="//input[ @id='firstname'   ]";
public static String lastName_text="//input[ @id='lastname'   ]";
public static String company_text="//input[   @id='company' ]";
public static String address_text="//input[ @id='address1'   ]";
public static String adress2_text="//input[  @id='address2' ]";
public static String state_textadress2_text="//select[@id='id_state']";

public static String city_text="//input[  @id='city'  ]";
//Select listbox3 =new Select(driver.findElement(By.xpath(OR.state_textadress2_text)));
public static String postcode="//input[@id='postcode']";

//Select listbox4 =new Select(driver.findElement(By.xpath(OR.)));
public static String unitedstate="//select[@id='id_country']";

public static String additionalinformation="//textarea[@ id='other']";

public static String home_phone_text="//input[@id='phone']";

public static String mobilephone_text="//input[@id='phone_mobile']";

public static String homeaddress_text="//input[@id='alias']";
public static String register_click="//input[  @id='newsletter' ]";
//button[@id='submitAccount']
}