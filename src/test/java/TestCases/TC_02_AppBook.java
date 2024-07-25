package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Basic.BasicHealthCare;
import Class.Appointment;
import Class.Login;

public class TC_02_AppBook extends BasicHealthCare{
	@Test()
	public void TC_02_AppBook() throws InterruptedException {
		Login l=new Login(driver);
		l.login("John Doe", "ThisIsNotAPassword");
		Appointment ap =new Appointment(driver);
		ap.Bookap();
		Assert.assertTrue(driver.getCurrentUrl().contains("https://katalon-demo-cura.herokuapp.com/appointment.php#summary"));
		ap.goback();
		ap.logt();
		Assert.assertTrue(driver.getCurrentUrl().contains("katalon-demo"));
		
	}
}
