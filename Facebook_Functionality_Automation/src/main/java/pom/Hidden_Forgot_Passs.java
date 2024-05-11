package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hidden_Forgot_Passs {

	@FindBy(xpath = ("(//table//tr//td)[2]"))
	private WebElement Text;
	
	@FindBy(xpath =("(//input[@name='email'])[2]"))
	private WebElement emailOrMono;
	
	@FindBy(xpath =("//a[text()='Cancel']"))
	private WebElement cacelButton;
	
	@FindBy(xpath =("//button[text()='Search']"))
	private WebElement searchButton ;
	
	public Hidden_Forgot_Passs(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
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
