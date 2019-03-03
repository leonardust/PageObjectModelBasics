package com.leonardust.pages;

import com.leonardust.base.BasePage;

public class LoginPage extends BasePage{


	public ZohoAppPage doLogin(String username, String password)	{
		type("username_ID", username);
		type("password_ID", password);
		click("submitBtn_ID");
		return new ZohoAppPage();
		
	}
	
	

}
