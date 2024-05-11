package Test_Facebook_Functionality;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.module.SignUpPage;

public class Test_Signup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

SignUpPage signUpPage = new SignUpPage(driver);
signUpPage.clickcreatNewAccButton();
signUpPage.sendfirstName("manoj");
signUpPage.sendlastName("zagekar");
signUpPage.sendmoNoOrEmail("58662");
signUpPage.sendnewPassword("manoj51561");
signUpPage.selectday();
signUpPage.selectmonth();
signUpPage.selectyear();
signUpPage.selectgender();

}
}