package com.leonardust.pages;

import org.openqa.selenium.By;
import com.leonardust.base.BasePage;

public class HomePage extends BasePage{

	public void goToSignUp() {
		driver.findElement(By.cssSelector(".zh-signup")).click();
	}

	public LoginPage goToLogin() {
		click("loginlink_CSS");
		return new LoginPage();
	}

	public void goToSupport() {
		driver.findElement(By.cssSelector(".zh-support")).click();
	}
	
	public void goToLearnMore()	{
		
	}
	
	public void validateFooterLinks() {
		
	}
}
