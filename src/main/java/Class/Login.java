package Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Basic.BasicHealthCare;

public class Login extends BasicHealthCare {

	@FindBy(id = "menu-toggle")
	WebElement HomeButton;
	@FindBy(linkText = "Login")
	WebElement LoginButton;
	@FindBy(id = "txt-username")
	WebElement UserName;
	@FindBy(id = "txt-password")
	WebElement PassWord;
	@FindBy(id = "btn-login")
	WebElement LoginClick;
	@FindBy(linkText = "Login failed! Please ensure the username and password are valid.")
	WebElement inValidLogin;

	public Login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	public void login(String username, String pass) throws InterruptedException {
		clickOn (HomeButton);
		clickOn(LoginButton);
		enter(UserName,username);
		enter(PassWord,pass);
		clickOn(LoginClick);
		Thread.sleep(2000);
		
		
		
	}
}
