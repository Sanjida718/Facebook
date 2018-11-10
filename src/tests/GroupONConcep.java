package tests;

import org.testng.annotations.Test;

public class GroupONConcep {
	@Test(groups={"sanitySuite"})
	public void test1(){
		System.out.println("this test case belongs to sanity test");
		}
	@Test(groups={"sanitySuite","regressionSuite"})
	public void test2(){
		System.out.println("This test case belong to sanity suite and regression suite");
	}


}
