package com.leonardust.utils;

import java.io.File;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager {

	private static ExtentReports extent;
	
	public static ExtentReports getInstatnce() {
		if(extent == null) {
			extent = new ExtentReports(System.getProperty("user.dir") + "\\target\\surefire-reports\\html\\extent.html",true, DisplayOrder.OLDEST_FIRST);
			extent.loadConfig(new File(System.getProperty("user.dir") + "\\src\\test\\resources\\com\\leonardust\\extentconfig\\ReportsConfig.xml"));
		}
		return extent;
	}
}
