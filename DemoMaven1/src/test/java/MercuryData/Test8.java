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
 
public class Test8
{
	
	public static String FirstName,lastName,meal1,CardName,CardNumber,expirymonth,expiryyear;	
	
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
			   
			   Test6.SericeClass=eat.getCellData("E://TC21.xls","Sheet1",i,10);	
			   
			   
			   Test8.FirstName=eat.getCellData("E://TC21.xls","Sheet1",i,11);
			   Test8.lastName=eat.getCellData("E://TC21.xls","Sheet1",i,12);
			   Test8.CardName=eat.getCellData("E://TC21.xls","Sheet1",i,13);
			   Test8.CardNumber=eat.getCellData("E://TC21.xls","Sheet1",i,14);
			   Test8.meal1=eat.getCellData("E://TC21.xls","Sheet1",i,15);
			   Test8.expirymonth=eat.getCellData("E://TC21.xls","Sheet1",i,16);
			   Test8.expiryyear=eat.getCellData("E://TC21.xls","Sheet1",i,17);
			   
			   Test8.allmethods();	
		 }
	 		 
	 }
	 
	
	 
public static void allmethods()throws Exception
{
		 Test5.openBrowser();
		 Test5.mercurylogin(Test5.UserName,Test5.Password);
				 
		 Test6.MerucryFlightFinderBusiness(Test6.PassengersCount,Test6.DepartingFrom,
				 Test6.DepartingStartMonth,Test6.DepartingStartDate,Test6.ArrivingIn,
				 Test6.ReturningEndMonth,Test6.ReturningEndDate,Test6.Airline,Test6.SericeClass);
		
		 Test7.Page7();
		 Test8.Page8(Test8.FirstName,Test8.lastName,Test8.meal1,Test8.CardName,Test8.CardNumber,Test8.expirymonth,Test8.expiryyear);
		 
		 Test5.CloseBrowser(); 
}	 
	 
	 

public static void Page8(String FirstName,String lastName,String meal1,String CardName,String CardNumber,String expirymonth,String expiryyear)throws Exception
{
	
	
	Test5.driver.findElement(By.xpath(OR.BookFlightPage_FirstName)).sendKeys(FirstName);
	
	Test5.driver.findElement(By.xpath(OR.BookFlightPage_lastName)).sendKeys(lastName);
	Select listbox9 =new Select(Test5.driver.
	findElement(By.xpath(OR.BookFlightPage_meal1)));
	
	listbox9.selectByVisibleText(meal1);
			
	Select listbox8 =new Select(Test5.driver.
	findElement(By.xpath(OR.BookFlightPage_CardName)));
	
	listbox8.selectByVisibleText(CardName);
			
	Test5.driver.findElement(By.xpath(OR.BookFlightPage_CardNumber)).sendKeys(CardNumber);
	
	Select listbox10 =new Select(Test5.driver.
	findElement(By.xpath(OR.BookFlightPage_expirymonth)));
	
	listbox10.selectByVisibleText(expirymonth);
			
	Select listbox11 =new Select(Test5.driver.
	findElement(By.xpath(OR.BookFlightPage_expiryyear)));
			
	listbox11.selectByVisibleText(expiryyear);
	
	
}

					  
	
}
