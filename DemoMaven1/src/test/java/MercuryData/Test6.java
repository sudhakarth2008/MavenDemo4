//import MercuryDemoTours;

package  MercuryData;
import org.testng.annotations.Test;

import DataProviderTest.ExcelApiTest3;

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
 
public class Test6
{
	//public static WebDriver driver ; 
	
	public static String PassengersCount,DepartingFrom,DepartingStartMonth,
	DepartingStartDate,ArrivingIn,ReturningEndMonth,ReturningEndDate,Airline;

	
	 @Test
	 public static void DatadrivenTest()throws Exception
	 {
		 ExcelApiTest3 eat = new ExcelApiTest3();
		 int numberowsInputdata=eat.getRowCount("E://TC21.xls","Sheet1");

		 for(int i=1;i<numberowsInputdata;i++)
		 {	 
			   Test5.UserName=eat.getCellData("E://TC21.xls","Sheet1",i,0);
			   Test5.Password=eat.getCellData("E://TC21.xls","Sheet1",i,1);	 	
			   
			   Test6.PassengersCount=eat.getCellData("E://TC21.xls","Sheet1",i,2);	
			   Test6.DepartingFrom=eat.getCellData("E://TC21.xls","Sheet1",i,3);	
			   Test6.DepartingStartMonth=eat.getCellData("E://TC21.xls","Sheet1",i,4);	
			   Test6.DepartingStartDate=eat.getCellData("E://TC21.xls","Sheet1",i,5);	
			   Test6.ArrivingIn=eat.getCellData("E://TC21.xls","Sheet1",i,6);	
			   Test6.ReturningEndMonth=eat.getCellData("E://TC21.xls","Sheet1",i,7);	
			   Test6.ReturningEndDate=eat.getCellData("E://TC21.xls","Sheet1",i,8);	
			   Test6.Airline=eat.getCellData("E://TC21.xls","Sheet1",i,9);	

			   Test6.allmethods();	
		 }
	 		 
	 }
	 
	

	 
	 
public static void allmethods()throws Exception
{
		 Test5.openBrowser();
		 Test5.mercurylogin(Test5.UserName,Test5.Password);
		 Test6.MerucryFlightFinderBusiness();
		 Test5.CloseBrowser();
		 
}	 
	 
	 
	 
	 
public static void MerucryFlightFinderBusiness() throws Exception
{
	
	
	Test5.driver.findElement(By.xpath(OR.MFFPage_OneWayRadiobutton)).click();

	Select listbox =new Select(Test5.driver.
	findElement(By.xpath(OR.MFFPage_PassengersCountListbox)));
	//listbox.selectByVisibleText("2");
	listbox.selectByVisibleText(Test6.PassengersCount);
	
	
	Select listbox1 =new Select(Test5.driver.
	findElement(By.xpath(OR.MFFPage_DepartingFromListbox)));
    //listbox1.selectByVisibleText("London");
    listbox1.selectByVisibleText(Test6.DepartingFrom);
    
		
	Select listbox2 =new Select(Test5.driver.
	findElement(By.xpath(OR.MFFPage_DepartingStartMonthListbox)));
	//listbox2.selectByVisibleText("February");
	listbox2.selectByVisibleText(Test6.DepartingStartMonth);
		
	Select listbox3 =new Select(Test5.driver.
	findElement(By.xpath(OR.MFFPage_DepartingStartDateListbox)));
	listbox3.selectByVisibleText(Test6.DepartingStartDate);
				
	Select listbox4 =new Select(Test5.driver.
	findElement(By.xpath(OR.MFFPage_ArrivingIn)));
	listbox4.selectByVisibleText(Test6.ArrivingIn);	
	
	Select listbox5 =new Select(Test5.driver.
	findElement(By.xpath(OR.MFFPage_ReturningEndMonthListbox)));
	listbox5.selectByVisibleText( Test6.ReturningEndMonth);
				
	Select listbox6 =new Select(Test5.driver.
	findElement(By.xpath(OR.MFFPage_ReturningEndDateListbox)));
	listbox6.selectByVisibleText(Test6.ReturningEndDate);
	
	Test5.driver.findElement(By.xpath(OR.MFFPage_BusinessclassRadioButton)).click();
	
	Select listbox7 =new Select(Test5.driver.
	findElement(By.xpath(OR.MFFPage_AirLineListbox)));
	listbox7.selectByVisibleText(Test6.Airline);
	
	
	
	Test5.driver.findElement(By.xpath(OR.MFFPage_ContinueButton)).click();
	
}
			  	  



					  
	
}
