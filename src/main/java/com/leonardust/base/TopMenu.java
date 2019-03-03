package com.leonardust.base;

import org.openqa.selenium.WebDriver;

import com.leonardust.crm.accounts.AccountsPage;

public class TopMenu {

	/**
	 * HomePage and other pages has a TopMenu
	 */
	
	WebDriver driver;
	
	public TopMenu(WebDriver driver)	{
		this.driver = driver;
	}
	
	public void goToHome() {

	}

	public void goToLeads() {

	}

	public AccountsPage goToAccounts() {
		BasePage.click("accountsTab_CSS");
		return new AccountsPage();
	}

	public void goToDeals() {

	}

	public void goToActivities() {

	}

	public void goToReports() {

	}

	public void goToAnalytics() {

	}

	public void goToProducts() {

	}

	public void goToQuotes() {

	}

	public void goToSalesOrders() {

	}

	public void goToPurchaseOrders() {

	}

	public void goToInvoices() {

	}
	
	public void signOut() {
		
	}
}
