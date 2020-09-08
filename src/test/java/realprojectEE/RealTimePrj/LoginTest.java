package realprojectEE.RealTimePrj;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.netty.channel.MessageSizeEstimator.Handle;

public class LoginTest extends Base {
	
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
	
	@Test(dataProvider= "getData")
	public void doLogin(String username,String  pass) throws Exception
	{
		
		sb=new SeleniumeasyBase(driver);
		System.out.println("I am in HomePage");
		driver.get(URL);
		sb.username().sendKeys(username);
		sb.password().sendKeys(pass);
		sb.loginbtn().click();
		
	
				
	}
	
	@DataProvider		
	public Object[][] getData()
	{
		Object[][] obj=new Object[3][2];

		obj[0][0]="standard_user";
		obj[0][1]="secret_sauce1";
		obj[1][0]="locked_out_user";
		obj[1][1]="secret_sauce1";
		obj[2][0]="problem_user";
		obj[2][1]="secret_sauce1";
		
		
		return obj;
	}
	
	
	public boolean runScript(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        return  (Boolean) js.executeScript("return jQuery.active==0;");
        }


    public void FocusOnWindow() throws Exception{
        int i=0;
        do {
            if(!runScript()){
                System.out.println("Popup exists");
                i++;
            }else{
                i=5000;
                System.out.println("Popup does not exists");
            }
        }while(i<5000);
    }
	
	

}
