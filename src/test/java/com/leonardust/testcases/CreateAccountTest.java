package com.leonardust.testcases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import com.leonardust.base.BasePage;
import com.leonardust.crm.accounts.AccountsPage;
import com.leonardust.crm.accounts.CreateAccountPage;
import com.leonardust.pages.ZohoAppPage;
import com.leonardust.utils.Utilities;

public class CreateAccountTest {

	@Test(dataProviderClass=Utilities.class, dataProvider="dp")
	public void createAccountTest(Hashtable<String,String> data)	{	
		ZohoAppPage zoho = new ZohoAppPage();
		zoho.goToCRM();
		AccountsPage accountsPage = BasePage.menu.goToAccounts();
		CreateAccountPage cap = accountsPage.goToCreateAccounts();
		cap.createAccount(data.get("accountname"));
	}
}
