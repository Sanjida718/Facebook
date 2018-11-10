package tests;

import org.testng.annotations.Test;

import base.Config;
import locators.DropDownLoc;
import values.DropDownVal;

public class DropDownTest extends Config {
	DropDownLoc loc=new DropDownLoc();
	DropDownVal value=new DropDownVal();
	@Test
    public void test2(){
		dropdownusingValue(loc.monthloc,value.monthval);
		dropdownusingValue(loc.dayloc,value.dayval);
		dropdownusingValue(loc.yearloc,value.yearval); 

	}

}


