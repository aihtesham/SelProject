package realprojectEE.RealTimePrj;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.netty.channel.MessageSizeEstimator.Handle;

public class ErroMessageTest extends Base {
	
	SeleniumeasyBase sb;
	
	@BeforeTest
	public void init() throws IOException
	{
	    
		driver=initialize();
		
	}
	
	@AfterTest
	public void close()
	{
		//driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		driver.close();
		
	}
	
	@Test
	public void ErroMsg() throws Exception
	{
		
		sb=new SeleniumeasyBase(driver);
		System.out.println("I am in HomePage");
		driver.get(URL);
		
			
		sb.username().sendKeys("abc");
		sb.password().sendKeys("abc");
		sb.loginbtn().click();
		
		WebElement err=driver.findElement(By.cssSelector("button[class='error-button']"));
		System.out.println("error message"+err.getText()+" "+err.isDisplayed());
		

	
				
	}
		
	
	

}
