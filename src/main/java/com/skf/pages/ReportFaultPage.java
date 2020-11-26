package com.skf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.skf.base.Page;

public class ReportFaultPage extends Page{
	
	public WebElement turbineDropdown() {
		return driver.findElement(
				By.cssSelector(".Filter-module_filterSelectors__23t1h div:nth-of-type(5) [class='css-19bqh2r']"));
	}
	
	public WebElement firstValueOfTurbineDropDown15355() {
		return driver.findElement(By.cssSelector("#react-select-7-option-1"));

	}
	
	public WebElement mapTurbine15355() {
		return driver.findElement(
				By.cssSelector("#Map-module_map__utoEh > div > div > div:nth-child(1) > div:nth-child(3) > div > div:nth-child(3) > div:nth-child(2) > div > div.FarmChild-module_circle__2jw-1.FarmChild-module_ok__1UzTU"));
	}
	
	public WebElement mapTurbinePopUp() {
		return driver.findElement(
				By.cssSelector("#root > div:nth-child(2) > main > div > div.Modal-module_modal__3brV3.TubineDetailsModal_modal__1sjCE > div.Modal-module_container__2FmLD"));
	}
	
	public WebElement reportFaultPopUpButton() {
		return driver.findElement(
				By.cssSelector("#root > div:nth-child(2) > main > div > div.Modal-module_modal__3brV3.TubineDetailsModal_modal__1sjCE > div.Modal-module_container__2FmLD > div.Modal-module_row__2MZeo.Modal-module_footer__2k3HZ > div > div:nth-child(1) > button"));
	}
	
	public WebElement reportFaultPopUp() {
		return driver.findElement(
				By.cssSelector("#root > div:nth-child(2) > main > div > div.Modal-module_background__oWywV > div > div > div"));
	}

	public WebElement assetsFilterDropdown() {
		return driver.findElement(
				By.cssSelector("#root > div:nth-child(2) > main > div > div.Modal-module_background__oWywV > div > div > div > div.ReportCommonModal_wrapper__1V_kj > div.Modal-module_row__2MZeo.ReportCommonModal_content__3Xq6j > section.ReportCommonModal_side__3XyYr.ReportCommonModal_leftSide__1L6tk > div.ReportCommonModal_contentSection__2vkAq > div > div > div.Filter-module_filterSelectors__23t1h > div:nth-child(6) > div"));
	}
	
	public WebElement assetsFilterDropdownMenuList() {
		return driver.findElement(
				By.cssSelector("#root > div:nth-child(2) > main > div > div.Modal-module_background__oWywV > div > div > div > div.ReportCommonModal_wrapper__1V_kj > div.Modal-module_row__2MZeo.ReportCommonModal_content__3Xq6j > section.ReportCommonModal_side__3XyYr.ReportCommonModal_leftSide__1L6tk > div.ReportCommonModal_contentSection__2vkAq > div > div > div.Filter-module_filterSelectors__23t1h > div:nth-child(6) > div > div.react-select__menu.css-26l3qy-menu > div"));
	}
	
	public WebElement firstValueOfassetsFilterDropDown() {
		return driver.findElement(By.cssSelector("#react-select-31-option-1"));

	}
	
	public WebElement assetsTickMark() {
		return driver.findElement(By.cssSelector(
				"#root > div:nth-child(2) > main > div > div.Modal-module_background__oWywV > div > div > div > div.ReportCommonModal_wrapper__1V_kj > div.Modal-module_row__2MZeo.ReportCommonModal_content__3Xq6j > section.ReportCommonModal_side__3XyYr.ReportCommonModal_leftSide__1L6tk > div.ReportCommonModal_contentSection__2vkAq > div > div > div.Filter-module_filterSelectors__23t1h > div:nth-child(6) > div.IconCheck-module_iconCheck__39ORN.IconCheck-module_iconCheck--circled__1_WLU.SelectInput-module_iconSelected__25vOu > div"));
	}
	
	public WebElement assetsTable() {
		return driver.findElement(
				By.cssSelector("#root > div:nth-child(2) > main > div > div.Modal-module_background__oWywV > div > div > div > div.ReportCommonModal_wrapper__1V_kj > div.Modal-module_row__2MZeo.ReportCommonModal_content__3Xq6j > section.ReportCommonModal_main__Bn39o > div.ReportCommonModal_interventionHistory__3a_dU > div > table"));
	}
	
	public WebElement selectEventSearchDropdown() {
		return driver.findElement(
				By.cssSelector("#root > div:nth-child(2) > main > div > div.Modal-module_background__oWywV > div > div > div > div.ReportCommonModal_wrapper__1V_kj > div.Modal-module_row__2MZeo.ReportCommonModal_content__3Xq6j > section.ReportCommonModal_side__3XyYr.ReportCommonModal_rightSide__11K4N > div.ReportCommonModal_contentSection__2vkAq > div > div > div > div > div.react-select__value-container.css-1hwfws3"));
	}
	
	
}
