package pom.module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage {

	@FindBy(xpath =("//a[text()='Create new account']"))
	private WebElement creatNewAccButton ;
	
	@FindBy(xpath =("//input[@name='firstname']"))
	private WebElement firstName;
	
	@FindBy(xpath =("//input[@name='lastname']"))
	private WebElement lastName;
	
	@FindBy(xpath=("(//input[@type='text'])[4]"))
	private WebElement moNoOrEmail;
	
	@FindBy(xpath=("(//input[@type='password'])[2]"))
	private WebElement newPassword;
	
	@FindBy(xpath= ("//select[@id='day']"))
	private WebElement day;
	
	@FindBy(xpath=("//select[@id='month']"))
	private WebElement month;
	
	@FindBy(xpath=("//select[@id='year']"))
	private WebElement year;
	
	@FindBy(xpath=("//label[text()='Male']"))
	private WebElement male;
	@FindBy(xpath=(""))
	private WebElement signUpButton;
	
	public SignUpPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickcreatNewAccButton()
	{
		creatNewAccButton.click();
	}
	public void sendfirstName(String FName)
	{
		firstName.sendKeys(FName);
	}
	public void sendlastName(String LName)
	{
		lastName.sendKeys(LName);
	}
	public void sendmoNoOrEmail(String MnOrEmail)
	{	
	moNoOrEmail.sendKeys(MnOrEmail);
	}	
	public void sendnewPassword(String pass)
	{
		newPassword.sendKeys(pass);
	}
	public void selectday( )	
	{
		Select s = new Select (day);
	    s.selectByVisibleText("24");
		
	}	
	public void selectday1( )	
	{
		Select s = new Select (day);
	    s.selectByVisibleText("4");
		
	}	
	public void selectmonth()	
	{
		Select s = new Select (month);
	    s.selectByVisibleText("Jun");
	}	
	public void selectmonth1()	
	{
		Select s = new Select (month);
	    s.selectByVisibleText("Jun");
	}	
	public void selectyear()	
	{
		Select s = new Select (year);
	    s.selectByVisibleText("2000");
	}		
	public void selectyear1()	
	{
		Select s = new Select (year);
	    s.selectByVisibleText("2001");
	}		
	public void selectgender()	
	{
		male.click();
	}	
	public void clicksignUpButton()
	{
		signUpButton.click();
	}
	
	
}
