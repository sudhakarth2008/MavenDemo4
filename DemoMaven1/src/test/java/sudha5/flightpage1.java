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

public class flightpage1 {
	public static WebDriver driver ;
    @Test
  public static void allMethods()throws Exception
  {
    	mercury.openBrowser();
  	    mercury.signinpage();
  	   flightpage1.flightpageBrowser();
    }
  public static void flightpageBrowser()throws Exception
  {
	  driver=OR.driver;
	driver.findElement(By.xpath(OR.oneway_click)).click();
	mercury.wait5seconds();
//	driver.findElement(By.xpath(OR.passengers_click)).click();
	Select listbox1 =new Select(driver.findElement(By.xpath(OR.passengers_click)));
	listbox1.selectByVisibleText("1");

	Select listbox2=new Select(driver.findElement(By.xpath(OR.departure_click)));
	listbox2.selectByVisibleText("London");
	
	Select listbox3=new Select(driver.findElement(By.xpath(OR.month_click)));
	listbox3.selectByVisibleText("March");
	
	
	Select listbox4=new Select(driver.findElement(By.xpath(OR.date_click)));
	listbox4.selectByVisibleText("20");
	
	Select listbox5=new Select(driver.findElement(By.xpath(OR.ariving_click)));
	listbox5.selectByVisibleText("Paris");
	
	driver.findElement(By.xpath(OR.service_click)).click();
	
	driver.findElement(By.xpath(OR.continue1_click)).click();
	
	
	
	

	
  	  
   }
  

  

}
