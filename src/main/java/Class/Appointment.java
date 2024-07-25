package Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Basic.BasicHealthCare;

public class Appointment  extends BasicHealthCare{
	@FindBy(id = "combo_facility")
	WebElement DropDoun;
	@FindBy(xpath ="//input[@id='chk_hospotal_readmission']")
	WebElement Clickbox;
	@FindBy(className =  "input-group-addon")
	WebElement Calander;
	@FindBy(xpath = "(//td[@class='day'][normalize-space()='10'])[1]")
	WebElement date;
	@FindBy(id = "txt_comment")
	WebElement Commentbox;
	@FindBy(id = "btn-book-appointment")
	WebElement Book;
	@FindBy(linkText = "Appointment Confirmation")
	WebElement ver;
	@FindBy(linkText  = "Go to Homepage")
	WebElement gotohome;
	@FindBy(id  = "menu-toggle")
	WebElement menu;
	@FindBy(linkText  = "Logout")
	WebElement logout;
	
	
	
	public Appointment(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void Bookap() throws InterruptedException {
		Thread.sleep(2000);
		clickOn(Clickbox);
		clickOn(Calander);
		clickOn(date);
		enter(Commentbox, "I NEED APPOINTMENT");
		clickOn(Book);
		Thread.sleep(10000);
		
	}
	public void goback() {
		clickOn(gotohome);
		
	}
	public void logt() {
		clickOn(menu);
		clickOn(logout);
	}

}
