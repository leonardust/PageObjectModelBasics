package com.leonardust.testcases;

import org.testng.annotations.AfterSuite;

import com.leonardust.base.BasePage;

public class BaseTest {

	@AfterSuite
	public void tearDown()	{
		BasePage.quit();
	}
}
