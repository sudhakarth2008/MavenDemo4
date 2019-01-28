//import MercuryDemoTours;

package  DataProviderTest;
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
 
public class MercuryFlightFinderPage
{
	public static WebDriver driver ; 
	
	public static String Reservation;
	
		 
		 @Test
		 public static void callallmethods()throws Exception
		 {
			 
			 ExcelApiTest3 eat = new ExcelApiTest3();
			 int numberowsInputdata=eat.getRowCount("E://TC16.xls","Sheet1");
			 
			 for(int i=1;i<numberowsInputdata;i++)
			 {	 
				 	System.out.println("test Iteration count"+i);
				 	 
				 //	 Test5.GetInputData(i);
					 Test5.openBrowser();
					// Test5.mercurylogin();
					 
					 MercuryFlightFinderPage.GetInputData(i);
					 MercuryFlightFinderPage.MerucryFlightFinderBusinessEconomyFirst();
					 
					 Test5.CloseBrowser();
					 System.out.println("test Iteration count"+i +"**************completed successfull******y");
			 }
			 
			 
		 }
		 
		 public static void GetInputData(int i) throws Exception
			{
					  ExcelApiTest3 eat = new ExcelApiTest3();
					   Test5.UserName=eat.getCellData("E://TC16.xls","Sheet1",i,0);
					   Test5.Password=eat.getCellData("E://TC16.xls","Sheet1",i,1);
					   MercuryFlightFinderPage.Reservation=eat.getCellData("E://TC16.xls","Sheet1",i,2);
					   
					   System.out.println("MercuryFlightFinderPage.Reservation:"+MercuryFlightFinderPage.Reservation);
 
			}
			
		 
	
	
	 
public static void MerucryFlightFinderBusinessEconomyFirst() throws Exception
{
	driver=OR.driver;
	
	driver.findElement(By.xpath(OR.MFFPage_OneWayRadiobutton)).click();

	Select listbox =new Select(driver.
	findElement(By.xpath(OR.MFFPage_PassengersCountListbox)));
	listbox.selectByVisibleText("2");
	
	Select listbox1 =new Select(driver.
	findElement(By.xpath(OR.MFFPage_DepartingFromListbox)));
    listbox1.selectByVisibleText("London");
		
	Select listbox2 =new Select(driver.
	findElement(By.xpath(OR.MFFPage_DepartingStartMonthListbox)));
	listbox2.selectByVisibleText("February");
		
	Select listbox3 =new Select(driver.
	findElement(By.xpath(OR.MFFPage_DepartingStartDateListbox)));
	listbox3.selectByVisibleText("10");
				
	Select listbox4 =new Select(driver.
	findElement(By.xpath(OR.MFFPage_ArrivingIn)));
	listbox4.selectByVisibleText("Paris");	
	
	Select listbox5 =new Select(driver.
	findElement(By.xpath(OR.MFFPage_ReturningEndMonthListbox)));
	listbox5.selectByVisibleText("March");
				
	Select listbox6 =new Select(driver.
	findElement(By.xpath(OR.MFFPage_ReturningEndDateListbox)));
	listbox6.selectByVisibleText("14");
	
	
	if ( MercuryFlightFinderPage.Reservation.equals("Economy"))
	{
		driver.findElement(By.xpath(OR.MFFPage_EconomyclassRadioButton)).click();
	}
	else if ( MercuryFlightFinderPage.Reservation.equals("Business "))
	{
		driver.findElement(By.xpath(OR.MFFPage_BusinessclassRadioButton)).click();
	}
	else
	{
		driver.findElement(By.xpath(OR.MFFPage_FirstClassRadioButton)).click();
		//otherwise first class
	}
	
	

	
	Select listbox7 =new Select(driver.
	findElement(By.xpath(OR.MFFPage_AirLineListbox)));
	listbox7.selectByVisibleText("Unified Airlines");
	
	
	driver.findElement(By.xpath(OR.MFFPage_ContinueButton)).click();
	

}
			  	  

}
