package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminPage extends BasePage {

	public AdminPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
	WebElement txt_HomePage;
	@FindBy(className="oxd-userdropdown-icon")
	WebElement drpdown_Logout;
	@FindBy(xpath="//a[@href='/web/index.php/auth/logout']")
	WebElement btn_Logout;
	@FindBy(xpath="//span[normalize-space()='Admin']") 
	WebElement btn_Admin;
	@FindBy(xpath="//button[normalize-space()='Add']") 
	WebElement btn_Add;
	@FindBy(xpath="//div[@class='oxd-select-text oxd-select-text--active']") 
	WebElement drpdwn_UserRole;
	@FindBy(xpath="//span[contains(text(),'Admin')]") 
	WebElement drpvalue_Admin;
	@FindBy(xpath="//input[@placeholder='Type for hints...']") 
	WebElement dynmcdrpdwn_EmpName;
	@FindBy(xpath="//div[@role='listbox']//div[1]") 
	WebElement drpdwn_EmpName;
	@FindBy(xpath="//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-card-container']/form[@class='oxd-form']/div[@class='oxd-form-row']/div[@class='oxd-grid-2 orangehrm-full-width-grid']/div[3]/div[1]/div[2]/div[1]/div[1]") 
	WebElement drpdwn_Status;
	@FindBy(xpath="//span[normalize-space()='Enabled']") 
	WebElement dyndrpdwnvalue_Enabled;
	@FindBy(xpath="//div[@class='oxd-form-row']//div[@class='oxd-grid-2 orangehrm-full-width-grid']//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']") 
	WebElement txt_UserName;
	@FindBy(xpath="//div[@class='oxd-grid-item oxd-grid-item--gutters user-password-cell']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']") 
	WebElement txt_Password;
	@FindBy(xpath="//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']") 
	WebElement txt_ConfirmPassword;
	@FindBy(xpath="//button[normalize-space()='Save']")
	WebElement btn_Save;


	
	public void goToAdminPage() {
		btn_Admin.click();
		btn_Add.click();
	}
	
	public void selectUserRole() {
		drpdwn_UserRole.click();
		drpvalue_Admin.click();
	}
	
	public void selectemployeeName() throws InterruptedException {
		dynmcdrpdwn_EmpName.sendKeys("1");
		Thread.sleep(2000);
		drpdwn_EmpName.click();
	}
	
	public void selectStatus() {
		drpdwn_Status.click();
		dyndrpdwnvalue_Enabled.click();
	}
	
	public void setUserName(String uname) {
		txt_UserName.sendKeys("Rishabh");
	}
	
	public void setPassword(String pass) {
		txt_Password.sendKeys(pass);
	}
	
	public void setConfirmPassword(String confPass) {
		txt_ConfirmPassword.sendKeys(confPass);
	}
	
	public void clickSave() {
		btn_Save.click();
	}
	
	public void clickLogout() {
		drpdown_Logout.click();
		btn_Logout.click();
	}
	
	public boolean targetPageContentExists() {
		try {
		return  (txt_HomePage.isDisplayed());
		}
		catch(Exception e) {
			return false;
		}
	}
}
