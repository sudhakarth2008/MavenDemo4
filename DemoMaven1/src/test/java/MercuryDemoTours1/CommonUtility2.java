package MercuryDemoTours1;

import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class CommonUtility2 {


 	
    public static String driverPath = "C:\\Users\\sudhakar\\Desktop\\seleni\\chromedriver_win32\\chromedriver.exe";
    public static String driverPath1 = "C:\\Users\\sudhakar\\Desktop\\seleni\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe";
    public static String baseUrl = "http://www.newtours.demoaut.com/";
    public static WebDriver driver ; 
   // public static WebDriver driver1 ;
    
    @Test
    public static void executSessionOne() throws Exception
    
    {
    	
    	CommonUtility2.OpenBlankChromeBrowser();
    	CommonUtility2.OpenMercuryDemoToursURL();
    	//CommonUtility2.CloseBrowser();
       	System.out.println("Session 1   Broswser Closed");
    	
    }
    
    @Test
    public static void executSessionTwo() throws Exception
    
    {
    	
      	CommonUtility2.OpenBlankChromeBrowser1();
      	//driver=OR.driver;
      	CommonUtility2.OpenMercuryDemoToursURL1();
     	//driver=OR.driver;
      //	CommonUtility2.CloseBrowser1();
      	System.out.println("Session 2   Broswser Closed");
    	
    	
    }
    
    
    public static void OpenBlankChromeBrowser() 
	 {
		
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("--disable-notifications");
	 	 System.setProperty("webdriver.chrome.driver",driverPath);
	 	 driver = new ChromeDriver(options); 
	 	// OR.driver=driver;
	 	 driver.manage().window().maximize() ;	
	 }
    public static void OpenBlankChromeBrowser1() 
	 {
		
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("--disable-notifications");
	 	 System.setProperty("webdriver.chrome.driver",driverPath);
	 	 driver = new ChromeDriver(options); 
	 	// OR.driver=driver;
	 	 driver.manage().window().maximize() ;	
	 }
   
   
    
    
    
  
    public static void OpenBlankIEBrowser(){
      
	System.setProperty("webdriver.ie.driver",driverPath1);
	   driver = new InternetExplorerDriver();
	   //OR.driver=driver;
	 	driver.manage().window().maximize() ;
    }
    
    
    
    public static void   CloseBrowser() throws Exception
    {
    	//driver=OR.driver;
    	//CommonUtility.waitFor6Seconds();
    	//Folders123.takeSnapShot(OR.driver,OR.sTargetTestCaseExcelPath,OR.sTestCaseName,3,6,OR.sTargetFolderPath);
    	driver.quit();
    	//System.out.println("CommonUtility Close Broswser called");
    }
    
   
    
    public static void OpenMercuryDemoToursURL() throws Exception
	 {
    	 //driver=OR.driver;
		 driver.get(baseUrl);
		// CommonUtility2.waitFor6Seconds();
		// Folders123.takeSnapShot(OR.sTargetTestCaseExcelPath,OR.sTestCaseName,1,6,OR.sTargetFolderPath);
	 }
    
    public static void OpenMercuryDemoToursURL1() throws Exception
	 {
   	 //driver=OR.driver;
		 driver.get(baseUrl);
		// CommonUtility2.waitFor6Seconds();
		// Folders123.takeSnapShot(OR.sTargetTestCaseExcelPath,OR.sTestCaseName,1,6,OR.sTargetFolderPath);
	 }
    
 
    
    
    public static void waitFor6Seconds() throws Exception
	{
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
					e.printStackTrace();
		}
	}
    
    

    

}
