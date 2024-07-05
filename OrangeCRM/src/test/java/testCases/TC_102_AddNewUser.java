package testCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AdminPage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_102_AddNewUser extends BaseClass{
	
	AdminPage ap;
	LoginPage lp;

	
	@Test(priority = 2)
	void addNewUser() throws InterruptedException {
		lp = new LoginPage(driver);
		lp.setUserName("Admin");
		lp.setPassword("admin123");
		lp.clickLogin();
		ap = new AdminPage(driver);
		ap.goToAdminPage();
		ap.selectUserRole();
		ap.selectemployeeName();
		ap.selectStatus();
		ap.setUserName(null);
		String Password = randomAlphaNumeric();
		ap.setPassword(Password);
		ap.setConfirmPassword(Password);
		ap.clickSave();
		String SuccessMessage = driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-text--toast-message oxd-toast-content-text']")).getText();
		Assert.assertEquals(SuccessMessage, "Successfully Saved");
		
	}

}
