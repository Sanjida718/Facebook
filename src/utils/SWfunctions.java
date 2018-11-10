package utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SWfunctions {
	public WebDriver driver;
	public void typeByXpath (String locators, String values){
		driver.findElement(By.xpath(locators)).sendKeys(values);
		
	}
	public void typeByCss (String locators, String values){
		driver.findElement(By.xpath(locators)).sendKeys(values);
	}
	public void typeByid (String locator, String values){
      driver.findElement(By.xpath(locator)).sendKeys(values);
	}
	public void clickByXpath (String locators){
		driver.findElement(By.xpath(locators)).click();
	}
	//dropdown
	public void dropdownusingValue(String loc,String value){
		WebElement selectelements=driver.findElement(By.xpath(loc));
		Select dropdown=new Select (selectelements);
		dropdown.selectByVisibleText(value);
	}
	public void dropdownByIndex(String loc,int x){
		WebElement choseelement=driver.findElement(By.id(loc));
		Select dropdown=new Select(choseelement);
		dropdown.selectByIndex(x);
	}
	//public void Radiobutton(){
		//Iframe
	public void iframe(String loc){
		WebElement ab=driver.findElement(By.xpath(loc));
		List<WebElement> el= ab.findElements(By.tagName("a"));
		System.out.println(el.size());
		for(int k=0;k<el.size();k++)
		{
			System.out.println(el.get(k).getText());

		}}
}
	




	

		





