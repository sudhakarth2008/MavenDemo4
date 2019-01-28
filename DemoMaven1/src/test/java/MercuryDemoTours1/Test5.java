//import MercuryDemoTours;

package  MercuryDemoTours1;
import org.testng.annotations.Test;
import DataProviderTest.ExcelApiTest3;

import subha.Facebook2;

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
 
public class Test5
{

	public static WebDriver driver ; 
	public static String driverPath = "C:\\Users\\sudhakar\\Desktop\\seleni\\chromedriver_win32\\chromedriver.exe";
	public static String baseUrl = "http://www.newtours.demoaut.com/";
	
	public static String UserName,Password;
	
	 
	 @Test
	 public static void DatadrivenTest()throws Exception
	 {
		 Folders123.FolderCreation("TC04_Mercury");
		 
		 ExcelApiTest3 eat = new ExcelApiTest3();
		 int numberowsInputdata=eat.getRowCount("E://TC16.xls","Sheet1");
		 
		 for(int i=1;i<numberowsInputdata;i++)
		 {	 
			  
			   Test5.UserName=eat.getCellData("E://TC16.xls","Sheet1",i,0);
			   Test5.Password=eat.getCellData("E://TC16.xls","Sheet1",i,1);
			 
			 	System.out.println("test Iteration count"+i);
			 	
			 	Test5.allmethods();
				 System.out.println("test Iteration count"+i +"**************completed successfull******y");
		 }
		 
		 		 
	 }
	 
	 
	 
	 
	 
	 public static void allmethods()throws Exception
	 {
		 Test5.openBrowser();
		 Test5.mercurylogin(Test5.UserName,Test5.Password);
		 Test5.CloseBrowser();
		 
	 }
	
		 //driver.quit();
		 public static void openBrowser()throws Exception
		 {
			 ChromeOptions options = new ChromeOptions();
			 options.addArguments("--disable-notifications");
			 System.setProperty("webdriver.chrome.driver",driverPath);
			 driver = new ChromeDriver(options); 
			 
			//OR3.driver=driver;
			 OR.driver=driver;
			 //driver=OR3.driver;
			 Test5.driver.manage().window().maximize() ;	
			 Test5.driver.get(baseUrl);
			 Folders123.takeSnapShot(OR.sTargetTestCaseExcelPath,OR.sTestCaseName,1,6,OR.sTargetFolderPath);
		 }
		 
		 public static void mercurylogin(String Username,String Password)throws Exception
		 {
			 
			 Test5.UserName=Username;
			 Test5.Password=Password;
			 
			 //Test5.GetInputData();
			 Test5.driver.findElement(By.xpath(OR.MLPage_UserNameTextbox)).sendKeys(Test5.UserName);
			 Test5.driver.findElement(By.xpath(OR.MLPage_PasswordTextbox)).sendKeys(Test5.Password);
			 Folders123.takeSnapShot(OR.sTargetTestCaseExcelPath,OR.sTestCaseName,2,6,OR.sTargetFolderPath);
			 Test5.driver.findElement(By.xpath(OR.MLPage_SignInButton)).click();
			 Test5.wait5seconds();
		 }
		
		 public static void wait5seconds() throws Exception
		 {
			 try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
							e.printStackTrace();
				}
		 }
		 
	
	
		 
		 public static void CloseBrowser() throws Exception
		 {
			 Test5.wait5seconds();
			 driver.quit();
		 }
		 
			
			 
			 
}

			 
			 
			
					 

				 
