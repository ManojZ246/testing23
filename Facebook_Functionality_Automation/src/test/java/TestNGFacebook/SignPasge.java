package TestNGFacebook;

import java.time.Duration;

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

public class SignPasge extends Base{
 WebDriver driver;
 private ForgotPassword forgotPassword;
 private SignUpPage signUpPage;
 @Parameters("browser")
 @BeforeTest
 public void launchBrowser(String browserName)
 {
	 System.out.println("Before Test");
 	if(browserName.equals("chrome"))
 	{
 		driver = openChromeBrowser() ; 
 	}
 	if(browserName.equals("firefox"))
 	{
 		driver =openFirefoxBrowser();
 	}
 	if(browserName.equals("edge"))
 	{
 		driver =openEdgeBrowser();
 	}
 	driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
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
	 signUpPage.clickcreatNewAccButton();
 }
 @Test
 public void verifythatEntervalidCreditional()
 {
	 System.out.println("Test 1");
	 signUpPage.sendfirstName("manoj");
	 signUpPage.sendlastName("zagekar");
	 signUpPage.sendmoNoOrEmail("manoj2000@gmail.com");
	 signUpPage.sendnewPassword("monu2565");
	 signUpPage.selectday();
	 signUpPage.selectmonth();
	 signUpPage.selectyear();
	 signUpPage.selectgender();
	 signUpPage.clicksignUpButton();
	 
 }
 @Test (priority=-1)
 public void verifythatEnterInvalidCreditional()
 {
	 System.out.println("Test 2");
	 signUpPage.sendfirstName("mayur");
	 signUpPage.sendlastName("katre");
	 signUpPage.sendmoNoOrEmail("manoj@gmail.com");
	 signUpPage.sendnewPassword("monu2564555");
	 signUpPage.selectday();
	 signUpPage.selectmonth();
	 signUpPage.selectyear();
	 signUpPage.selectgender();
	 signUpPage.clicksignUpButton();
 }
 @AfterMethod
 public void afterMethod()
 {
	 System.out.println("After Method");
	 
 }
 @AfterClass
 public void afterClass()
 {
	 System.out.println("After class");
	 signUpPage=null;
	 forgotPassword= null;
 }
 @AfterTest
 public void closeBrowser()
 {
	 System.out.println("Close Browser");

	 driver.close();
	 driver=null;
 }
}
