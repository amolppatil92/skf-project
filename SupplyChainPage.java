package com.skf.pages;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import au.com.bytecode.opencsv.CSVWriter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.skf.base.Page;

public class SupplyChainPage extends Page {

	public void javaScriptCLick(WebElement clickableElement) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click()", clickableElement);

	}

	public WebElement turbineDropdown() {
		return driver.findElement(
				By.cssSelector(".Filter-module_filterSelectors__23t1h div:nth-of-type(5) [class='css-19bqh2r']"));
	}



	public WebElement supplyChainLink() {
		return driver.findElement(By.linkText("Supply Chain"));

	}

	public void clickSupplyChainLink() {
		javaScriptCLick(this.supplyChainLink());

	}

	public void getDropDownValues() {
		List<WebElement> listofDropDown = driver.findElements(By.xpath("//div[@class=\"slicer-dropdown-menu\"]"));

		for (WebElement webElement : listofDropDown) {
			System.out.println("Clicked ELement"+webElement);
			webElement.click();
			List<WebElement> drpValues = driver.findElements(By.xpath("//div[@class=\"slicerCheckbox\"]"));
			for (WebElement webElement2 : drpValues) {
				String value = webElement2.getText();
				System.out.println("Clicked ELement"+value);	
			}
		}
	}

}
