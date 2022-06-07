package com.crm.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClickOnLeadsAddIcon {
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement clickonAddIcon;
	
	public ClickOnLeadsAddIcon(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getclickonAddIcon() {
		return clickonAddIcon;
	}
	public void clickonAddIconImage() {
		clickonAddIcon.click();
	}

}
