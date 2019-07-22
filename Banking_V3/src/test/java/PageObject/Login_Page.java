
package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
public WebDriver Idriver;
	
	public Login_Page(WebDriver rdriver)
	{
		Idriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(name = "Email")
	@CacheLookup
	WebElement txtEmail;
	
	@FindBy(name = "Password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(xpath = "//*[@value='Log in']")
	@CacheLookup
	WebElement btnLogin;
	
	@FindBy(linkText = "Logout")
	@CacheLookup
	WebElement btnLogout;
	
	public void setPassword(String pwd) {
		txtPassword.clear();
		txtPassword.sendKeys(pwd);
	}
	public void setUsername(String uname) {
		txtEmail.clear();
		txtEmail.sendKeys(uname);
	}
	public void clickLogin() {
		btnLogin.click();
	}
	public void clickLogout() {
		btnLogout.click();
	}
}

