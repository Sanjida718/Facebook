package tests;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SoftAssert  {
	@Test
	public void softassert(){
	SoftAssert softAssertion=new SoftAssert ();
	System.out.println("soft assert gonna run");
	assertTrue(true);
	System.out.println("going to execute");
	
	}


	@Test
	public void tryCatchTesting(){
		String expValue = "a";
		String actValue = "b";
	try {
			Assert.assertEquals(actValue, expValue);
			
		} catch (Throwable v){
			
			System.out.println("Act vs Exp not  matching" +v);
			System.out.println("does it going to run?");
		}
	}
			@Test ()
			public void assertRightThere(){
				String expValue = "a";
				String actValue = "b";
				try{
				Assert.assertEquals(actValue, expValue);
				}catch (Throwable d){
					System.out.println("not same"+ d);
				}
              //  softassert();
		
			}
			@Test 
			public void tosee(){
				String expValue = "name";
				String actValue = "sanjida";
				try {
				Assert.assertEquals(actValue, expValue);
			}catch (Throwable c){
				System.out.println("not same" +c);
			}
				
			}
			
			{
}
{
}
{
}}



