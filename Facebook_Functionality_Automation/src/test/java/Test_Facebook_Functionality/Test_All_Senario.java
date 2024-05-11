package Test_Facebook_Functionality;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.ForgotPassword;

public class Test_All_Senario {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 WebDriver driver = new ChromeDriver();
 driver.manage().window().maximize();
 driver.get("https://www.facebook.com/");
 Thread.sleep(2000);
 
 ForgotPassword  forgotPassword = new ForgotPassword(driver);
 
 forgotPassword.sendUserName("manoj");
 forgotPassword.sendPassword("manoj24620");
 forgotPassword.clickForgotButton();
	}

}
