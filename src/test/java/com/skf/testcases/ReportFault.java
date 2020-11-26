package com.skf.testcases;

import static org.testng.Assert.assertTrue;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.skf.base.Page;
import com.skf.pages.LoginPage;
import com.skf.pages.ReportFaultPage;
import com.skf.pages.TurbinePage;

public class ReportFault extends Page {
	String path = System.getProperty("user.dir");
	public static Properties config = new Properties();
	public static FileInputStream fisco;

	@Test (enabled = false)
	public void f() {
	}

	@Test
	public void exitEventverification1() {

		LoginPage loginPage = new LoginPage();
		loginPage.loginApp("test_Wind_1", "2D.tu68D2");
		ReportFaultPage reportFaultPage = new ReportFaultPage();
		TurbinePage turbinePage = new TurbinePage();
		reportFaultPage.turbineDropdown().click();
		reportFaultPage.firstValueOfTurbineDropDown15355().click(); 
		reportFaultPage.mapTurbine15355().click();
		assertTrue(turbinePage.turbineNameOnHeaderPopUp().isDisplayed());
		assertTrue(turbinePage.currentStatusOnHeaderPopUp().isDisplayed());
		assertTrue(turbinePage.nextPlannedActionOnHeaderPopUp().isDisplayed());
		assertTrue(turbinePage.indicatedFaultOnHeaderPopUp().isDisplayed());
		assertTrue(turbinePage.previousActionTakenOnHeaderPopUp().isDisplayed());
		turbinePage.reportFaultButtonOnHeaderPopUp().isDisplayed();
		turbinePage.reportFeedbackButtonOnHeaderPop().isDisplayed();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click()", reportFaultPage.reportFaultPopUpButton());
		assertTrue(reportFaultPage.reportFaultPopUp().isDisplayed());
		assertTrue(reportFaultPage.assetsFilterDropdown().isDisplayed());
		reportFaultPage.assetsFilterDropdown().click();
		assertTrue(reportFaultPage.assetsFilterDropdownMenuList().isDisplayed());
		reportFaultPage.firstValueOfassetsFilterDropDown().click();
		assertTrue(reportFaultPage.assetsTickMark().isDisplayed());
		assertTrue(reportFaultPage.assetsTable().isDisplayed());
		assertTrue(reportFaultPage.selectEventSearchDropdown().isDisplayed());
	}
	

	@AfterMethod
	public void tearDown() {
		Page.driver.close();
		driver=null;
		log.debug("Browser closed");
	}
}
