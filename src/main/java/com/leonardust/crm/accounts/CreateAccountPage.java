package com.leonardust.crm.accounts;

import org.openqa.selenium.By;

import com.leonardust.base.BasePage;

public class CreateAccountPage extends BasePage{

	
	public void createAccount(String accountName)	{
		driver.findElement(By.id("Crm_Accounts_ACCOUNTNAME")).sendKeys(accountName);
		type("accountName_ID", accountName);
	}
}
