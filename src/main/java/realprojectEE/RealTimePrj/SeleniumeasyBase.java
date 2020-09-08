package realprojectEE.RealTimePrj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumeasyBase {
	
	WebDriver driver;
// URL https://www.saucedemo.com/	
// centerlize elements	
	
	String userid="user-name";
	String password="password";
	String loginbtn="login-button";
	
	/*
	@FindBy(name="uname")
	WebElement username;
	
	@FindBy(name="pass")
	WebElement password;
	
	@FindBy(className=("dropdown-toggle"))
	WebElement  dropdownclk;  */
	
	
	public SeleniumeasyBase(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	public WebElement username()
	{
		         return driver.findElement(By.id(userid));
	}
	
	
	public WebElement password()
	{
			return driver.findElement(By.id(password));
	}
	
	public WebElement loginbtn()
	{
			return driver.findElement(By.id(loginbtn));
	}
		

}
