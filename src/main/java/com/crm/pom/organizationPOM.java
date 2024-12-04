package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class organizationPOM {

	public organizationPOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[text()='Organizations']")
	private WebElement organization;
	
	
	@FindBy(xpath = "//img[@alt='Create Organization...']")
	private WebElement createorg;
	
	@FindBy(xpath = "//input[@name='accountname']")
	private WebElement accName;
	
	@FindBy(xpath = "//input[@value='  Save  ']")
	private WebElement save;
	
	public void organization() {
		
		organization.click();
	}
	public void createOrg() {
		createorg.click();
	}
	public void accountName() {
		accName.sendKeys("uttapa");
	}
	public void save() {
		save.click();
	}
}
