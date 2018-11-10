package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.Config;
import locators.CreateNewAccount;
import values.CreatenAcVal;

public class AssertionTest extends Config {
	CreateNewAccount loc=new CreateNewAccount();
	CreatenAcVal val=new CreatenAcVal();
@Test
  public void CreateNewAC(){
	WebElement convertIntoText=driver.findElement(By.xpath(loc.CreatNAC));
	String actText=convertIntoText.getText();
	System.out.println("Actual is : " +actText);
	Assert.assertEquals(actText, val.createnacval);
}
}


