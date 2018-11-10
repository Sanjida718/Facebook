package tests;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.Config;
import locators.Iframe;

public class IframeTesting extends Config {
	Iframe loc=new Iframe();
	//Iframeval val=new Iframeval();
	@Test
	public void  iframes(){
		iframe(loc.Iframeloc1);
	}
	@Test(priority=0)
	public void iframe1(){
		iframe(loc.Iframeloc);
 // System.out.println((loc.Iframeloc));
		//WebElement ab=driver.findElement(By.xpath(loc.Iframeloc));
		//List<WebElement> el= ab.findElements(By.tagName("a"));
//		System.out.println(el.size());
//		for(int k=0;k<el.size();k++)
//		{
//			System.out.println(el.get(k).getText());
		}
		
		
		
		
		
		

	}

