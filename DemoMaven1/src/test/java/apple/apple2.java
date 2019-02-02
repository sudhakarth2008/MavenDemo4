//import MercuryDemoTours;

package  apple;
import org.testng.annotations.Test;

import DataProviderTest.ExcelApiTest3;
import MercuryData.OR;
import MercuryData.Test5;
import MercuryData.Test6;

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
 
public class apple2
{
	
	
	public static String PassengersCount,DepartingFrom,DepartingStartMonth,
	DepartingStartDate,ArrivingIn,ReturningEndMonth,ReturningEndDate,Airline,ServiceClass,Radiobutton;

	
	 @Test
	 public static void DatadrivenTest()throws Exception
	 {
		 ExcelApiTest3 eat = new ExcelApiTest3();
		 int numberowsInputdata=eat.getRowCount("E://TC25.xls","Sheet1");
		 
		

		 for(int i=1;i<numberowsInputdata;i++)
		 {	 
			 apple1.UserName=eat.getCellData("E://TC25.xls","Sheet1",i,0);
			 apple1.Password=eat.getCellData("E://TC25.xls","Sheet1",i,1);	 	
			 apple2.Radiobutton=eat.getCellData("E://TC25.xls","Sheet1",i,11); 
			 apple2.PassengersCount=eat.getCellData("E://TC25.xls","Sheet1",i,2);	
			 apple2.DepartingFrom=eat.getCellData("E://TC25.xls","Sheet1",i,3);	
			 apple2.DepartingStartMonth=eat.getCellData("E://TC25.xls","Sheet1",i,4);	
			 apple2.DepartingStartDate=eat.getCellData("E://TC25.xls","Sheet1",i,5);	
			 apple2.ArrivingIn=eat.getCellData("E://TC25.xls","Sheet1",i,6);	
			 apple2.ReturningEndMonth=eat.getCellData("E://TC25.xls","Sheet1",i,7);	
			 apple2.ReturningEndDate=eat.getCellData("E://TC25.xls","Sheet1",i,8);	
			 apple2.Airline=eat.getCellData("E://TC25.xls","Sheet1",i,9);	
			 apple2.ServiceClass=eat.getCellData("E://TC25.xls","Sheet1",i,10);	

			 apple2.allmethods();	
		 }
	 		 
	 }
	 
	 public static void allmethods()throws Exception
	 {
		 apple1.openBrowser();
	 		 
		 apple1.mercurylogin(apple1.UserName,apple1.Password);
	 		 
		 apple2.MerucryFlightFinderBusiness(apple2.PassengersCount,apple2.DepartingFrom,
				 apple2.DepartingStartMonth,apple2.DepartingStartDate,apple2.ArrivingIn,
	 				apple2.ReturningEndMonth,apple2.ReturningEndDate,apple2.Airline,apple2.Radiobutton,apple2.ServiceClass);
	 		 
		 apple1.CloseBrowser();
	 		 
	 }	 
	 	 
	 	 
	 	 
	 	 
	 public static void MerucryFlightFinderBusiness(String PassengersCount,String DepartingFrom,
	 		String DepartingStartMonth,String DepartingStartDate,String ArrivingIn,
	 		String ReturningEndMonth,String ReturningEndDate,String Airline,String Radiobutton1,String ServiceClass ) throws Exception
	 {
		 

		 if(Radiobutton1.equals("OneWay"))
		 {	 
		   
		 //  apple1.driver.findElement(By.xpath(OR.MFFPage_RoundTripRadiobutton)).click();
		   apple1.driver.findElement(By.xpath(OR.MFFPage_OneWayRadiobutton)).click();
		   
		 }
		 
		 if(Radiobutton1.equals("RoundTrip"))
		    	
		    {
		 
	    // apple1.driver.findElement(By.xpath(OR.MFFPage_OneWayRadiobutton)).click();
		 apple1.driver.findElement(By.xpath(OR.MFFPage_RoundTripRadiobutton)).click();
		 }
		 
		 

	 	Select listbox =new Select(apple1.driver.
	 	findElement(By.xpath(OR.MFFPage_PassengersCountListbox)));
	 	
	 	listbox.selectByVisibleText(PassengersCount);
	 	
	 	
	 	Select listbox1 =new Select(apple1.driver.
	 	findElement(By.xpath(OR.MFFPage_DepartingFromListbox)));
	    
	     listbox1.selectByVisibleText(DepartingFrom);
	     
	 		
	 	Select listbox2 =new Select(apple1.driver.
	 	findElement(By.xpath(OR.MFFPage_DepartingStartMonthListbox)));
	 	
	 	listbox2.selectByVisibleText(DepartingStartMonth);
	 		
	 	Select listbox3 =new Select(apple1.driver.
	 	findElement(By.xpath(OR.MFFPage_DepartingStartDateListbox)));
	 	listbox3.selectByVisibleText(DepartingStartDate);
	 				
	 	Select listbox4 =new Select(apple1.driver.
	 	findElement(By.xpath(OR.MFFPage_ArrivingIn)));
	 	listbox4.selectByVisibleText(ArrivingIn);	
	 	
	 	Select listbox5 =new Select(apple1.driver.
	 	findElement(By.xpath(OR.MFFPage_ReturningEndMonthListbox)));
	 	listbox5.selectByVisibleText( ReturningEndMonth);
	 				
	 	Select listbox6 =new Select(apple1.driver.
	 	findElement(By.xpath(OR.MFFPage_ReturningEndDateListbox)));
	 	listbox6.selectByVisibleText(ReturningEndDate);
	 	
	 	apple1.driver.findElement(By.xpath(OR.MFFPage_BusinessclassRadioButton)).click();
	 	
	 	Select listbox7 =new Select(apple1.driver.
	 	findElement(By.xpath(OR.MFFPage_AirLineListbox)));
	 	listbox7.selectByVisibleText(Airline);
	 	
	 	if(ServiceClass.equals("Firstclass"))
	 	{
	 		apple1.driver.findElement(By.xpath(OR.MFFPage_FirstClassRadioButton)).click();

	 	}
	 	if(ServiceClass.equals("Economyclass"))
	 	{
	 		apple1.driver.findElement(By.xpath(OR.MFFPage_EconomyclassRadioButton)).click();

	 	}
	 	if(ServiceClass.equals("Businessclass"))
	 	{
	 		apple1.driver.findElement(By.xpath(OR.MFFPage_BusinessclassRadioButton)).click();

	 	}
	 	
	 	
	 	
	 	
	 	apple1.driver.findElement(By.xpath(OR.MFFPage_ContinueButton)).click();
	 	
	 }


	 

}
