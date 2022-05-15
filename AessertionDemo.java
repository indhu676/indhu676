package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AessertionDemo {
  @Test
  public void testMethod1() {
	  Assert.assertTrue(20>18);
}
  @Test
  public void testMethod2() {
	  Assert.assertTrue("Hello".equals("Hi"));
  }
    @Test
	  public void testMethod3() {
		  Assert.assertFalse(20>18);
	}
	  @Test
	  public void testMethod4() {
		  Assert.assertFalse("Hello".equals("Hi"));
	  }
	  @Test
	  public void testMethod5() {
		  int actual = 20;
		  int expected = 20;
		  Assert.assertEquals(actual, expected);
	}
	  @Test
	  public void testMethod6() {
		  String actual = "Hello";
		  String expected = "hello";
		  Assert.assertEquals(actual, expected);
	  }
	  @Test
	  public void testMethod7() {
		  Object obj1 = null;
		  Assert.assertNull(obj1);
	  }
	  @Test
	  public void testMethode8() {
	  Object obj2 = new Object();
	  Assert.assertNull(obj2);
}

	  
	@Test
	
	public void testMethode9() {
		System.out.println("This is for Hard Assertion: SoftAssert");
		System.out.println("This is for Hard Assertion: This will not skip the rest of the code if the first assert failes if we have multiple assertion statment");
		Assert.assertFalse(20>18);
		
		
		System.out.println("This statement will  be skip and will  run during execution");
		
		 String actual = "Hello";
		  String expected = "Hi";
		  Assert.assertEquals(actual, expected);
	  
		
	}
	@Test
	public void testMethod10() {
		System.out.println("This is for Soft Assertion: Assert");
		System.out.println("This is for Soft Assertion: This will not skip the rest of the code if the first assert failes if we have multiple assertion statment");
		SoftAssert sa = new SoftAssert();
		sa.assertFalse(20>18);
		
		System.out.println("This statement will not be skip and will  run during execution since we have implement the soft assert object");
		
		 String actual = "Hello";
		  String expected = "Hi";
		  Assert.assertEquals(actual, expected);
		  sa.assertAll();
	  
		
		
		
	}
}	  
	  
	  