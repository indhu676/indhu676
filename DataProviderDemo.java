package practicepragram;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
  @Test(dataProvider="loginData")
  public void testLogin(String username, String password) {
	  System.out.println("username:" +username+ "password: "+password);
  }
  @DataProvider
  public Object[][] loginData(){
	  Object[][] data= {
			  {"indhu","indhu"},
			  {"sriram","sriram"},
			  {"indusri","indusri"}
	  };
	 
	  
	  return data;
  }
  }
  
	  
	
  
  
  
  

