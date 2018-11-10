package tests;

import org.testng.annotations.Test;

import base.Config;
import locators.FB_login_loc1;
import values.FB_login_val1;

public class Fb_Login_test1 extends Config {
	FB_login_loc1 loc =new FB_login_loc1();
	FB_login_val1 val =new FB_login_val1();
	@Test
	public void fblogintest(){
		typeByXpath (loc.emailorphone, val.emailorphoneval);
		typeByXpath (loc.password, val.emailorphoneval);
		clickByXpath (loc.LoginButton);
		
	}

}
