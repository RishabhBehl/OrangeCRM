package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AdminPage;
import pageObjects.LoginPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC_103_ValidAndInvalidAccountLogin extends BaseClass{
	
	
	@Test(dataProvider = "LoginData", dataProviderClass = DataProviders.class)
	public void verifyLogin(String username, String password, String res) {
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickLogin();
		
		AdminPage ap = new AdminPage(driver);
		boolean TargetPage = ap.targetPageContentExists();

		if(res.equalsIgnoreCase("valid")) {
			if(TargetPage==true) {
				ap.clickLogout();
				Assert.assertTrue(true);
			}
			else{
				Assert.assertTrue(false);
			}
			}
			if (res.equalsIgnoreCase("invalid")) {
				if(TargetPage==true) {
					ap.clickLogout();
					Assert.assertTrue(false);	
				}
				else {
					Assert.assertTrue(true);
				}
			}
		}
		
		
	}
