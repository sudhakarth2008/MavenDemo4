package sudha5;

import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

import org.apache.commons.io.FileUtils;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.ie.*;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 
import java.sql.Timestamp;

import org.openqa.selenium.*;
import org.openqa.selenium.remote.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import java.util.concurrent.TimeUnit;

import java.io.File;
import java.io.*;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

import java.net.*;

import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;
import java.net.MalformedURLException;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.util.*;

public class passengers {
	public static WebDriver driver ;
    @Test
  public static void allMethods()throws Exception
  {
    	mercury.openBrowser();
  	    mercury.signinpage();
  	  flightpage1.flightpageBrowser();
    	selectflight.flightpage();
  	   	 passengers.passengers();
    }
    
    public static void passengers()throws Exception
    {
    	
    	
    	driver=OR.driver ;
    	
    	 driver.findElement(By.xpath(OR.firstname_text)).sendKeys("sudhakar");
    	 driver.findElement(By.xpath(OR.lastname_text)).sendKeys("thatichettu");
    	 Select listbox =new Select(driver.findElement(By.xpath(OR.meal_click)));
    	 listbox.selectByVisibleText("Hindu");
    	 
    	 Select listbox5 =new Select(driver.findElement(By.xpath(OR.cardtype_text)));
    	 listbox5.selectByVisibleText("Visa");
    	 
    	// Select listbox6 =new Select(driver.findElement(By.xpath(OR.creditnumber_text)));
    	 //listbox6.selectByVisibleText("1234 5678 9123 4567");
    
    	 driver.findElement(By.xpath(OR.creditnumber_text)).sendKeys("1234 5678 1234 3456");

    	 

    	 
    	 Select listbox7 =new Select(driver.findElement(By.xpath(OR.creditcardmonth_text)));
    	 listbox7.selectByVisibleText("02");
    	 
    	 
    	 Select listbox8 =new Select(driver.findElement(By.xpath(OR.creditcardyear_text)));
    	 listbox8.selectByVisibleText("2010");
    	 
    	 driver.findElement(By.xpath(OR.creditcardfirstname_sendkeys)).sendKeys("sudhakar");

    	 driver.findElement(By.xpath(OR.creditcardmiddlename_sendkeys)).sendKeys("sudha");


    	 driver.findElement(By.xpath(OR.creditcardlastname_sendkeys)).sendKeys("thatichettu");
    	 
    	 
    	 
    	 driver.findElement(By.xpath(OR.billingaddress_sendkeys)).sendKeys("hyderabad");
    	 driver.findElement(By.xpath(OR.billingaddress2_sendkeys)).sendKeys("miyapur");
    	 driver.findElement(By.xpath(OR.city_sendkeys)).sendKeys("sanathnagar");
    	 driver.findElement(By.xpath(OR.state_sendkeys)).sendKeys("telangna");
    	 driver.findElement(By.xpath(OR.postalcode_sendkeys)).sendKeys("1232456");
    	
        	 
    	 Select listbox9=new Select(driver.findElement(By.xpath(OR.countryname_sendkeys)));
    	 listbox9.selectByVisibleText("TURKEY");
    	 
    	 
    	/* driver.findElement(By.xpath(OR.billingaddress_sendkeys)).sendKeys("eluru");
    	 driver.findElement(By.xpath(OR.city1_sendkeys)).sendKeys("amaravathi");
    	 driver.findElement(By.xpath(OR.state1_sendkeys)).sendKeys("ap");
    	 driver.findElement(By.xpath(OR.postalcode1_sendkeys)).sendKeys("500006");
    	 driver.findElement(By.xpath(OR.country_sendkeys)).sendKeys("UNITEDSTATES");*/
    	 driver.findElement(By.xpath(OR.securepurchage_click)).click();

    	 

    	 
    	 


    	 

    	 
    	 
    	 
    	 
    	

    	  	
    	 }
}