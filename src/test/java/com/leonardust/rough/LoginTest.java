package com.leonardust.rough;

import org.testng.Assert;

import com.leonardust.base.BasePage;
import com.leonardust.crm.accounts.AccountsPage;
import com.leonardust.crm.accounts.CreateAccountPage;
import com.leonardust.pages.HomePage;
import com.leonardust.pages.LoginPage;
import com.leonardust.pages.ZohoAppPage;
import com.leonardust.pages.crm.CRMHomePage;

public class LoginTest {

	public static void main(String[] args) {
		
		//This is a rough test
		HomePage home = new HomePage();
		LoginPage login = home.goToLogin();
		ZohoAppPage zoho = login.doLogin("leotesterbox@gmail.com", "Selenium@123");
		zoho.closeZiaSearch();
		CRMHomePage crmHomePage = zoho.goToCRM();
		Assert.assertEquals(crmHomePage.verifyWelcomeText(), "Welcome leotesterbox leotesterbox");
		AccountsPage accountsPage = BasePage.menu.goToAccounts();
		CreateAccountPage cap = accountsPage.goToCreateAccounts();
		cap.createAccount("Leonardust");
		
	}

}
