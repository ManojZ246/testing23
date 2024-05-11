package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginOrSignUpPage {
  
	@FindBy(xpath = ("//input[@id='email']"))
	private WebElement userName ;
	
	@FindBy(xpath = ("//input[@id='pass']"))
	private WebElement password ;
	
	@FindBy(xpath = ("//button[text()='Log in']"))
	private WebElement loginButton ;
	
	@FindBy(xpath = ("//a[text()='Create new account']"))
	private WebElement creatNewAccButton ;
	
	public LoginOrSignUpPage (WebDriver  driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void senduserName (String userId)
	{
		userName.sendKeys(userId);
	}
	public void sendPassword (String pass)
	{
		password.sendKeys( pass);
	}
	public void clickLoginButton()
	{
		loginButton.click();
	}
	public void clickCreatNewAccButton()
	{
		creatNewAccButton.click();
	}
	
	
	
}
