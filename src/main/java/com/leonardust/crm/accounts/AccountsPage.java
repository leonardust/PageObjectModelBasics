package com.leonardust.crm.accounts;

import com.leonardust.base.BasePage;

public class AccountsPage extends BasePage{
	
	public CreateAccountPage goToCreateAccounts() {
		click("createAccountBtn_CSS");
		return new CreateAccountPage();
	}
	
	public void goToImportAccounts()	{
		click("importAccountBtn_CSS");

	}
}
