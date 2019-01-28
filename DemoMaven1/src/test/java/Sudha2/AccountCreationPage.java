package Sudha2;
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

public class AccountCreationPage {
	
    public static WebDriver driver ; 
    
    @Test
    public static void allmethods()throws Exception
    {
    	
    	Signinpage.openBrowser();
    	Signinpage.helosignin();
    	AccountPage.AccountCretaionnavigation();
        AccountCreationPage.EnterAcountDetails();
    	
    }
    
    public static void EnterAcountDetails()throws Exception
    {
    	driver=OR.driver;
    	Signinpage.wait5seconds();
    	driver.findElement(By.xpath(OR.ACP_MR_button)).click();
    	Signinpage.wait5seconds();
    	driver.findElement(By.xpath(OR.ACP_firstname_text)).sendKeys("thatichettu");
    	
    	driver.findElement(By.xpath(OR.ACP_lastname_text)).sendKeys("sudhakar");

    	//driver.findElement(By.xpath(OR.ACP_email_textbox)).sendKeys("sudhakarth2008@gmail.com");
    	Signinpage.wait5seconds();
    	driver.findElement(By.xpath(OR.ACP_password_text)).sendKeys("babli1234");
    	Signinpage.wait5seconds();
    	Signinpage.wait5seconds();
    	Select listbox =new Select(driver.findElement(By.xpath(OR.ACP_DOB_DD_Listbox)));
    	//listbox.selectByVisibleText("15");
    	listbox.selectByValue("15");
    	
    	
    	Signinpage.wait5seconds();
    	Select listbox1 =new Select(driver.findElement(By.xpath(OR.ACP_DOB_MMM_Listbox)));
    	//listbox1.selectByVisibleText("June");
    	listbox1.selectByValue("6");

    	Select listbox2 =new Select(driver.findElement(By.xpath(OR.ACP_DOB_year_Listbox)));
    	//listbox2.selectByVisibleText("1981");
    	listbox2.selectByValue("1981");
    	
    	
    	driver.findElement(By.xpath(OR.signup_click)).click();
    	Signinpage.wait5seconds();
       	driver.findElement(By.xpath(OR.receivesspecial)).click();
       	Signinpage.wait5seconds();
       	driver.findElement(By.xpath(OR.firstName_text)).sendKeys("sudhakar");
       	driver.findElement(By.xpath(OR.lastName_text)).sendKeys("thatichettu");
       	
     	driver.findElement(By.xpath(OR.company_text)).sendKeys("tata");   
     	driver.findElement(By.xpath(OR.address_text)).sendKeys("miyapur");
     	driver.findElement(By.xpath(OR.adress2_text)).sendKeys("jntu");
     	driver.findElement(By.xpath(OR.city_text)).sendKeys("hyd");
     	Signinpage.wait5seconds();
    // driver.findElement(By.xpath(OR.state_textadress2_text)).sendKeys("5");
     	
    	Select listbox3 =new Select(driver.findElement(By.xpath(OR.state_textadress2_text)));
    	//listbox.selectByVisibleText("15");
    	listbox3.selectByValue("5");
    	driver.findElement(By.xpath(OR.postcode)).sendKeys("123");
    	
    	Select listbox4 =new Select(driver.findElement(By.xpath(OR.unitedstate)));
    	//listbox.selectByVisibleText("15");
    	listbox4.selectByValue("21");
    	driver.findElement(By.xpath(OR.additionalinformation)).sendKeys("subha");
    	
    	driver.findElement(By.xpath(OR.home_phone_text)).sendKeys("23456");
    	driver.findElement(By.xpath(OR.mobilephone_text)).sendKeys("9441127463");
    	driver.findElement(By.xpath(OR.homeaddress_text)).sendKeys("narasaraopet");
    	
    	driver.findElement(By.xpath(OR.register_click)).click();
    	
    	driver.quit();
    	
    	
    	
    	
    	
    	
    	
    	
    	

    	

    	

    	
    	
    
     	
     	  }
}