package realprojectEE.RealTimePrj;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.netty.channel.MessageSizeEstimator.Handle;

public class MainPageTest extends Base {
	
	
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
		//driver.close();
		
	}
	
	@Test
	public void SwagLabs() throws Exception
	{
		
		sb=new SeleniumeasyBase(driver);
		driver.get(URL);
			
		sb.username().sendKeys("standard_user");
		sb.password().sendKeys("secret_sauce");
		sb.loginbtn().click();
		
		driver.findElement(By.xpath("//div[@class='bm-overlay']"));
		Assert.assertTrue(true);
				
	}
		
	
	

}
