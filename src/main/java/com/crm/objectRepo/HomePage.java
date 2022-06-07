package com.crm.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(linkText="Leads")
	private WebElement leadsLink;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getleadsLink() {
		return leadsLink;
	}
	
	public void clickOnLeads() {
		leadsLink.click();
	}

}
