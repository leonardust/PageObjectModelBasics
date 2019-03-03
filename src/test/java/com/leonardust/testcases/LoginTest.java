package com.leonardust.testcases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import com.leonardust.pages.HomePage;
import com.leonardust.pages.LoginPage;
import com.leonardust.pages.ZohoAppPage;
import com.leonardust.utils.Utilities;

public class LoginTest extends BaseTest{

	@Test(dataProviderClass=Utilities.class, dataProvider="dp")
	public void loginTest(Hashtable<String,String> data)	{
		HomePage home = new HomePage();
		LoginPage login = home.goToLogin();
		ZohoAppPage zoho = login.doLogin(data.get("username"), data.get("password"));
		zoho.closeZiaSearch();
	}
}
