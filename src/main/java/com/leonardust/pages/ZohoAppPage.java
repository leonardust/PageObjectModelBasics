package com.leonardust.pages;

import org.openqa.selenium.By;
import com.leonardust.base.BasePage;
import com.leonardust.pages.crm.CRMHomePage;

public class ZohoAppPage extends BasePage{

	public void closeZiaSearch()	{
		driver.findElement(By.cssSelector(".close-btn")).click();
	}
	
	public CRMHomePage goToCRM() {
		driver.findElement(By.cssSelector(".zicon-apps-crm")).click();
		return new CRMHomePage();
	}
	
	public void goToSalesIQ() {
		driver.findElement(By.cssSelector(".zicon-apps-salesiq")).click();
	}
	
	
}
