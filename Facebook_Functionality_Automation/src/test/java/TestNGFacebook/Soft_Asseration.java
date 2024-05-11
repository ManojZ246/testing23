package TestNGFacebook;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Asseration {
	private SoftAssert soft;       // this is declare globally noNeed  create softAssert  class
	                               //  object in all test method 
 @BeforeClass
 public void beforeClass()
 {
		System.out.println("Before Class");
 
 }
 @BeforeMethod
 public void beforeMethod()
 {
		System.out.println("Before Method");
        soft = new SoftAssert();
 }
 @Test
 public void test1()
 {
		System.out.println("Test 1");
		String actualUrl = "https://www.facebook.com/";
        String acceptedURL = "https://www.facebook.com/1";  // different actual and accepted 
                                                            //result thats why result is failed
        
      
        soft.assertEquals(actualUrl ,acceptedURL);
       soft.assertAll();
 }@Test
 public void test2()
 {
		System.out.println("Test 2");
		 String actualTitle = "Facebook";
	        String acceptedTitle = "Facebook";
	        soft.assertEquals(actualTitle ,acceptedTitle);
	        soft.assertAll();
 }
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
