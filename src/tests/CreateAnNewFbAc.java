package tests;

import org.testng.annotations.Test;

import base.Config;
import locators.CreateAnAccount;
import locators.DropDownLoc;
import locators.RadioButtonLoc;
import values.CreateNewAcVal;
import values.DropDownVal;

public class CreateAnNewFbAc extends Config {
	 DropDownLoc loc1=new DropDownLoc();
	  DropDownVal val2=new DropDownVal();
	  CreateAnAccount loc=new CreateAnAccount();
	  	CreateNewAcVal val=new CreateNewAcVal();
	  	RadioButtonLoc loc2=new RadioButtonLoc();
	  	
	
      @Test(priority=1)
      public void createfbac2(){
    	  
    	  dropdownusingValue(loc1.monthloc,val2.monthval);
    	  dropdownusingValue(loc1.dayloc,val2.dayval);
    	  dropdownusingValue(loc1.yearloc,val2.yearval);
      }
      
      @	Test(priority=2)
      public void createfbac3(){
    	  radiobutton(loc2.radiob2);
      }
    	  


		@Test(priority=0)
	public void createfbac(){
		typeByXpath (loc.firstname,val.firstname);
		typeByXpath (loc.lastname,val.lastname);
		typeByXpath (loc.emailorphone,val.emailorphone);
		typeByXpath(loc.emailagain,val.emailagain);
		typeByXpath (loc.password,val.password);
		
	}
		@Test
		public void sighup(){
			clickByXpath(loc.sighup);
		}
	

		}
