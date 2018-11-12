package test_readWriteFromExcelFile;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.Config;
import locators.CreateAnAccount;
import locators.CreateNewAccount;
import locators.FB_login_loc1;
import utils.Xls_Reader;

public class ReadWriteExcel extends Config {
	//String excelPath = "C:\Users\talentTEK\Documents\GitHub\SeleniumFramework\tc.xlsx";
		String excelPath = System.getProperty("user.dir")+ "//tc.xlsx";
		
		Xls_Reader xl = new Xls_Reader(excelPath);
		FB_login_loc1 logIn = new FB_login_loc1();
		CreateAnAccount su=new CreateAnAccount();
		CreateNewAccount can=new CreateNewAccount();

		@Test
		public void readFromExcel(){
			
			typeByXpath (logIn.emailorphone, xl.getCellData("fb", "TestData", 4));
		}
		@Test
		public void readfromexcel2(){
		typeByXpath(logIn.password,xl.getCellData("fb", "TestData", 6));


		}

		@Test
		public void writeFromExcel3(){
			// xl file location 
			// which row and col
			//typeByXpath(can.CreatNAC,xl.getCellData("fb", "Testata", 5));
			
			String RK = driver.findElement(By.cssSelector(su.signup1)).getText();
			System.out.println (RK); //Sign Up
			

		}

		}

	


