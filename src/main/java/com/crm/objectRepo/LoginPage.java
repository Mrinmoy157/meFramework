package com.crm.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(name="user_name")
	private WebElement usernameTextBox;
	@FindBy(name="user_password")
	private WebElement passwordTextBox;
	@FindBy(id="submitButton")
	private WebElement loginBtn;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getusernameTextBox() {
		return usernameTextBox;
	}
	public WebElement getPasswordTextBox() {
		return passwordTextBox;
	}
	
	
	public void login() {
		usernameTextBox.sendKeys("admin");
		passwordTextBox.sendKeys("root");
		loginBtn.click();
	}

}
