package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPassword {
   
	@FindBy(xpath =("//input[@id='email']"))
	private WebElement userName ;
	
	@FindBy(xpath = ("//input[@id='pass']"))
	private WebElement password ;
	
	@FindBy(xpath =("//a[text()='Forgotten password?']"))
	private WebElement forgotPassword;
	
	@FindBy(xpath =("(//input[@name='email'])[2]"))
	private WebElement emailOrMono;
	
	@FindBy(xpath =("//a[text()='Cancel']"))
	private WebElement cacelButton;
	
	@FindBy(xpath =("//button[text()='Search']"))
	private WebElement searchButton ;
	
	public ForgotPassword (WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void sendUserName(String UserId)
	{
		userName.sendKeys(UserId);
	}
	public void sendPassword (String pass)
	{
		password.sendKeys(pass);
	}
	
	public void clickForgotButton()
	{
		forgotPassword.click();
	}

	public void sendEmailOrPhone(String ID)
	{
		emailOrMono.sendKeys(ID);
	}
	
	public void clickcancelButton()
	{
		cacelButton.click();
	}
	public void clicksearchButton()
	{
		searchButton.click();
	}
	
}
