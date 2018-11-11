package tests;

import org.testng.annotations.Test;

import base.Config;
import locators.RadioButtonLoc;

public class ChoseRadioButton extends Config {
	RadioButtonLoc locator=new RadioButtonLoc();
	@Test
	public void radiobutton(){
		radiobutton(locator.radiob2);
	}
}
