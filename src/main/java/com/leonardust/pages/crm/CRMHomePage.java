package com.leonardust.pages.crm;

import org.openqa.selenium.By;

import com.leonardust.base.BasePage;

public class CRMHomePage extends BasePage{

	public String verifyWelcomeText()	{
		String element = driver.findElement(By.id("show-uName")).getText().trim();
		return element;
		
	}
}
