package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;



import Basic.BasicHealthCare;
import Class.Login;

public class TC_01_Login extends BasicHealthCare{
	@Test(dataProvider ="getFromExcel" , priority = 1)
	public void TC_01_Login(String username,String pass) throws InterruptedException {
		Login l=new Login(driver);
		l.login(username, pass);
		Assert.assertTrue(driver.getCurrentUrl().contains("#appointment"));
		
	}

}
