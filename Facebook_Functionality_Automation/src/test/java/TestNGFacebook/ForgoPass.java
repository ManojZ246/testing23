package TestNGFacebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Base.Base;
import pom.ForgotPassword;
import pom.module.SignUpPage;

public class ForgoPass extends Base  {
	private WebDriver driver;
	private ForgotPassword forgotPassword ;
	private SignUpPage signUpPage;

	   @Parameters("browser")
	    @BeforeTest
	    public void launchtheBrowser(String browserName)
	    {
	    	System.out.println("Before Test");
	    	if(browserName.equals("chrome"))
	    	{
	    		driver =openChromeBrowser() ; 
	    	}
	    	if(browserName.equals("firefox"))
	    	{
	    		driver = openFirefoxBrowser();
	    	}
	    	if(browserName.equals("edge"))
	    	{
	    		driver = Base.openEdgeBrowser();
	    	}
	    }
		@BeforeClass
		public void beforeClass()
		{
			System.out.println("Before Class");
			signUpPage = new SignUpPage (driver);
			forgotPassword = new ForgotPassword(driver);

		}
		@BeforeMethod
		public void beforeMethod()
		{
			System.out.println("Before Method");
			driver.get("https://www.facebook.com/");		
			forgotPassword.sendUserName("manoj");
			forgotPassword.sendPassword("1234");
			forgotPassword.clickForgotButton();
			}
		@Test
		public void verifyIDwithvalidemail()
		{
			System.out.println("Test1");
			forgotPassword.sendEmailOrPhone("manojzagekar@200gmail.com");
			forgotPassword.clicksearchButton();
		}
		@Test
		public void verifyIDwithinvalidemail()
		{
			System.out.println("Test2");
			forgotPassword.sendEmailOrPhone("ghfvj");
			forgotPassword.clicksearchButton();
		}
		@AfterMethod
		public void afterMethod()
		{
			System.out.println("After Method");

		}
		@AfterClass
		public void afterClass()
		{
			System.out.println("After Class");
			signUpPage = null;
			forgotPassword = null;
		}
		@AfterTest
		public void closeBriowser()
		{
			System.out.println("close");
			driver.close();
			driver= null;
			System.gc();
		}
		
			
		
		
	}


