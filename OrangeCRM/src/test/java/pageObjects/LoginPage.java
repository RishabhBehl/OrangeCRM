package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(xpath="//input[@placeholder='Username']") WebElement txt_userName;
	@FindBy(xpath="//input[@placeholder='Password']") WebElement txt_password;
	@FindBy(xpath="//button[normalize-space()='Login']") WebElement btn_Login;
	
	
	public void setUserName(String username){
		txt_userName.sendKeys(username);
	}
	
	public void setPassword(String password){
		txt_password.sendKeys(password);
	}
	
	public void clickLogin(){
		btn_Login.click();
	}


}
