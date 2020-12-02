package com.skf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.skf.base.Page;

public class SupplyChainPage extends Page {

	public WebElement supplyChainLabel() {
		return driver.findElement(By.cssSelector(".Breadcrumb-module_breadcrumb__2Mkgj a"));
	}

	public WebElement turbineModelLabel() {
		return driver.findElement(By.cssSelector("h2[title='Turbine Model']"));
	}

	public WebElement assetLabel() {
		return driver.findElement(By.cssSelector("h2[title='Asset']"));
	}

	public WebElement positionLabel() {
		return driver.findElement(By.cssSelector("h2[title='Position']"));
	}

	public WebElement eventIDLabel() {
		return driver.findElement(By.cssSelector("h2[title='Event ID']"));
	}

	public WebElement availabilityStatusLabel() {
		return driver.findElement(By.cssSelector("div[title='Availability Status']  .preTextWithEllipsis"));
	}

	public WebElement nodeAvailabilityLabel() {
		return driver.findElement(By.cssSelector("div[title='Node Availability']  .preTextWithEllipsis"));
	}

	public WebElement productAvailabilityByEventLabel() {
		return driver.findElement(By.cssSelector("div[title='Product availability by event']  .preTextWithEllipsis"));
	}

	public WebElement bearingToBeReplacedAvailabilityLabel() {
		return driver
				.findElement(By.cssSelector("div[title='Bearings to be replaced availability']  .preTextWithEllipsis"));
	}

	public WebElement availabilityByWarehouseLabel() {
		return driver.findElement(By.cssSelector("div[title='Availability by Warehouse']  .preTextWithEllipsis"));
	}

	public WebElement turbineModelDropdown() {
		return driver.findElement(By.cssSelector(
				".droppableElement.hideBorder.noVisualTitle.readMode.ui-droppable.unselectable.visualContainer.visualHeaderBelow visual-modern div[role='button'] > .chevron-down.dropdown-chevron.powervisuals-glyph"));
	}

	public WebElement turbineModelDropdownValueG87() {
		return driver.findElement(By.cssSelector("div[role='option'] > span[title='G87']"));
	}

	public WebElement turbineModelDropdownValueG87CheckBox() {
		return driver.findElement(By.cssSelector("div:nth-of-type(2) > div[role='option']  .checkbox.glyphicon"));
	}

	public WebElement turbineIdDropdown() {
		return driver.findElement(By.cssSelector(
				"visual-container-repeat .visual-container-component:nth-of-type(15) .powervisuals-glyph"));
	}

	public WebElement turbineIdDropdownValueBOU_U001() {
		return driver.findElement(By.cssSelector("div[role='option'] > span[title='BOU_U001']"));
	}

	public WebElement turbineIdDropdownValueBOU_U001CheckBox() {
		return driver.findElement(By.cssSelector("[height='90'] .row:nth-of-type(1) .glyphicon"));
	}

	public WebElement assetDropdown() {
		return driver.findElement(By.cssSelector(
				"visual-container-repeat .visual-container-component:nth-of-type(11) .powervisuals-glyph"));
	}

	public WebElement assetDropdownValueGearbox() {
		return driver.findElement(By.cssSelector("[title='Gearbox']"));
	}

	public WebElement assetDropdownValueGearboxCheckBox() {
		return driver.findElement(By.cssSelector(
				"div:nth-of-type(7) div[role='listbox'] > .scroll-wrapper.scrollbar-inner  .scrollRegion > div > div:nth-of-type(1) > div[role='option']  .checkbox.glyphicon"));
	}
	
	public WebElement positionDropdown() {
		return driver.findElement(By.cssSelector(
				"visual-container-repeat .visual-container-component:nth-of-type(13) .powervisuals-glyph"));
	}
	
	public WebElement positionDropdownValueHIS_S_GS() {
		return driver.findElement(By.cssSelector(
				"div[role='option'] > span[title='HIS-S-GS']"));
	}
	
	public WebElement positionDropdownValueCheckboxHIS_S_GS() {
		return driver.findElement(By.cssSelector(
				"[height='216'] .row:nth-of-type(1) .glyphicon"));
	}
	
	public WebElement eventIdDropdown() {
		return driver.findElement(By.cssSelector(
				"visual-container-repeat .visual-container-component:nth-of-type(14) .powervisuals-glyph"));
	}

}
