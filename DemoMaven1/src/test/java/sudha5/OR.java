package sudha5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class OR {
	
public static WebDriver driver ; 


//public static String SIP_signin_click="//a[ @class='login']";

public static String username_text="//input[@name='userName']";

public static String password_text="//input[@name='password']"; 
		
public static String signin_click="//input[@ name='login']";
//flight page1

public static String oneway_click="//input[ @name='tripType' and @value='oneway']";
public static String passengers_click="//select[@name='passCount']";
public static String departure_click="//select[@name='fromPort']";
public static String month_click="//select [@name='fromMonth']";
public static String date_click="//select [@name='fromDay']";
public static String ariving_click="//select[@name='toPort']";
public static String service_click="//input [@name='servClass']";
public static String continue1_click="//input [@type='image' and @name='findFlights']";

//selectflightpage

public static String unifiedairlines_click="//input[ @name='outFlight' and @type='radio' and @value='Unified Airlines$363$281$11:24' ]";
public static String unifiedairlinesreturn_click="//input[@value='Unified Airlines$633$303$18:44'  ]";
public static String continue2_click="//input[ @src='/images/forms/continue.gif']";



//passenger
public static String firstname_text="//input[@name='passFirst0']";
public static String lastname_text="//input[@name='passLast0']";
public static String meal_click="//select[@name='pass.0.meal']";
public static String cardtype_text="//select[@ name='creditCard']";
public static String creditnumber_text="//input [@type='text' and @name='creditnumber']";
public static String creditcardmonth_text="//select[@name='cc_exp_dt_mn']";
public static String creditcardyear_text="//select [@name='cc_exp_dt_yr']";

//creditcard details

public static String creditcardfirstname_sendkeys="//input[@name='cc_frst_name']";

public static String creditcardmiddlename_sendkeys="//input[@name='cc_mid_name']";

public static String creditcardlastname_sendkeys="//input[@name='cc_last_name']";

//billingaddress

public static String billingaddress_sendkeys="//input[@name='billAddress1']";

public static String billingaddress2_sendkeys="//input[@name='billAddress2']";

public static String city_sendkeys="//input[@ name='billCity']";

public static String state_sendkeys="//input[@name='billState']";

public static String postalcode_sendkeys="//input[@name='billZip']";

public static String countryname_sendkeys="//select[@name='billCountry']";




/*public static String deliveryaddress_sendkeys="//input[@name='delAddress1']";

public static String city1_sendkeys="//input[@name='delState']";

public static String state1_sendkeys="//input[@name='delState']";


public static String postalcode1_sendkeys="//input[@name='delZip']";


public static String country_sendkeys="//select[@name='delCountry']";*/


public static String securepurchage_click="//input[@name='buyFlights']";

public static String logout_click="//img[@src='/images/forms/Logout.gif']";

}