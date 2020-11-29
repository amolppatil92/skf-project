package com.skf.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.skf.base.Page;
import com.skf.pages.EventWorkAndOrderPage;
import com.skf.pages.LoginPage;
import com.skf.pages.TurbinePage;
import com.skf.utilities.CommonUtilities;

public class EventWorkAndOrder extends Page {
	String path = System.getProperty("user.dir");
	public static Properties config = new Properties();
	public static FileInputStream fisco;
	
	@Test (enabled = false)
	public void eventWorkOrderpageTittle() throws IOException, InterruptedException {

		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		loginPage.loginApp(config.getProperty("validUsername"), config.getProperty("validPassword"));
		EventWorkAndOrderPage eventWorkAndOrderPage = new EventWorkAndOrderPage();
		TurbinePage turbinePage = new TurbinePage();
		assertTrue(turbinePage.filterLabel().isDisplayed());
		eventWorkAndOrderPage.eventAndWorkOrdersTabx().click();
		assertTrue(eventWorkAndOrderPage.powerBIReport().isDisplayed());
		assertTrue(eventWorkAndOrderPage.pageTittle().isDisplayed());
		eventWorkAndOrderPage.pageTittle().click();
		assertEquals(eventWorkAndOrderPage.pageTittleText(),config.getProperty("eventAndWordOrderPageTittle"));
	}
	
	@Test 
	public void statusFilters() throws IOException, InterruptedException {

		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		loginPage.loginApp(config.getProperty("validUsername"), config.getProperty("validPassword"));
		EventWorkAndOrderPage eventWorkAndOrderPage = new EventWorkAndOrderPage();
		TurbinePage turbinePage = new TurbinePage();
		assertTrue(turbinePage.filterLabel().isDisplayed());
		eventWorkAndOrderPage.eventAndWorkOrdersTabx().click();
		Thread.sleep(45000);
		//driver.switchTo().frame(eventWorkAndOrderPage.iFrame());
		assertTrue(eventWorkAndOrderPage.powerBIReport().isDisplayed());
		assertTrue(eventWorkAndOrderPage.pageTittle().isDisplayed());
		
		assertTrue(eventWorkAndOrderPage.powerBIReport().isDisplayed());
		assertTrue(eventWorkAndOrderPage.closedStatus().isDisplayed());
		assertTrue(eventWorkAndOrderPage.openStatus().isDisplayed());
		assertTrue(eventWorkAndOrderPage.pendingStatus().isDisplayed());
		assertTrue(eventWorkAndOrderPage.blankStatus().isDisplayed());
		eventWorkAndOrderPage.closedStatus().click();
	}


	@AfterMethod
	public void tearDown() {
		Page.driver.close();
		driver = null;
		log.debug("Browser closed");
	}
}