package DharmajaAmazonDao4;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonHomePage {
	
	 WebDriver driver ; 
	    
	    
	 public  AmazonHomePage(WebDriver driver) throws IOException
	 {
		  this.driver=driver;
		  
	 }	

public void AmazonHomePageLogout()

{
	
	Actions actions = new Actions(driver);
   WebElement ele1=driver.findElement(By.xpath("//*[@id='nav-link-yourAccount']/span[2]"));
	new WebDriverWait(driver, 990000000).until(ExpectedConditions.visibilityOf(ele1));	 
actions.moveToElement(ele1).perform();

WebElement ele2=driver.findElement(By.xpath("//*[text()='Sign Out']"));
	new WebDriverWait(driver, 1990000000).until(ExpectedConditions.visibilityOf(ele2));	 
	actions.moveToElement(ele2).click().build().perform();
 }

}
