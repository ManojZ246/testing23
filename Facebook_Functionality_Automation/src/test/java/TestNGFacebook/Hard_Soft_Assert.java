package TestNGFacebook;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Hard_Soft_Assert {
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class");
		
		}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method");
		
	}
	@Test
	public void test1()
	{
		System.out.println("Test 1");
		String actualURL= "https://www.facebook.com/";
		String expectedURL= "https://www.facebook.com/1";
		
		String actualTitle = "Facebook";
		String expectedTitle= "Facebook";
		Assert.assertEquals(actualURL,expectedURL);
		Assert.assertEquals(actualTitle,expectedTitle);
	}
	/*@Test
	public void test2()
	{
		System.out.println("Test 2");
		String actualTitle = "Facebook";
		String expectedTitle= "Facebook";
		Assert.assertEquals(actualTitle,expectedTitle);

	}*/
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method");
        
	}
	@AfterClass
	public void afterclass()
	{
		System.out.println("After Class");

	}
}
