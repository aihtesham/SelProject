package realprojectEE.RealTimePrj;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Base {
	
	public WebDriver driver;
	
	public String Browsername;
	public String URL;
	
	Properties prop=new Properties();
	FileInputStream fis;
	
	
	public WebDriver initialize() throws IOException
	{
		
		fis=new FileInputStream("C:\\Selenuim Workspace\\RealTimePrj\\resourses\\setting.properties");
		prop.load(fis);
		Browsername=prop.getProperty("browser");
		URL=prop.getProperty("URL");
		fis.close();
				  
		
		
			if(Browsername.equals("chrome"))
			{
				ChromeOptions options = new ChromeOptions();
				options.addArguments("disable-infobars");
				options.setAcceptInsecureCerts(true);
				options.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.ACCEPT);
				options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
				
				System.setProperty("webdriver.chrome.driver","C:\\Selenium Work\\chromedriver.exe");
				
				this.driver=new ChromeDriver(options);
				System.out.println("Using Chrome");
				//return driver;
				
			}else if(Browsername.toString().equals("firefox"))
			{
				System.setProperty("webdriver.gecko.driver","C:\\Selenium Work\\geckodriver.exe");
				this.driver=new FirefoxDriver();
				
				
			}else if(Browsername.equals("IE"))
			{
				// for IE
				
			}

			return this.driver;
			
	}

}
