package testCases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_101_AccountLogin extends BaseClass{
	
	LoginPage lp;
	
	@Test(priority = 1)
	void accountLogin() throws InterruptedException {
		lp = new LoginPage(driver);
		lp.setUserName("Admin");
		lp.setPassword("admin123");
		lp.clickLogin();
		String ActualUrl = driver.getCurrentUrl();
		String ExpectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		Assert.assertEquals(ActualUrl,ExpectedUrl);
	}
}
