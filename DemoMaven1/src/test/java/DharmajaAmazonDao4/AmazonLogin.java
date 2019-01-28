package DharmajaAmazonDao4;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonLogin {

	 WebDriver driver ; 
	 
	 public  AmazonLogin (WebDriver driver) throws IOException
	 {
		  this.driver=driver;
		  
	  }  
	
	
	
	public void AmazonLogin(String username,String password)
	{

	      Actions actions = new Actions(driver);
		  WebElement ele=driver.findElement(By.xpath("//*[text()='Hello. Sign in']"));
		  new WebDriverWait(driver, 990000000).until(ExpectedConditions.visibilityOf(ele));	 
		  actions.moveToElement(ele).click().build().perform();
	   	   
		   driver.findElement(By.xpath(" //input[@type='email' and @maxlength='128' and  @id='ap_email' and  @name='email']")).sendKeys("sudhakarth2008@gmail.com");
		   driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		   driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("babli1234");
		   driver.findElement(By.xpath("//*[@id='signInSubmit']")).click();
	   
	   }

}
