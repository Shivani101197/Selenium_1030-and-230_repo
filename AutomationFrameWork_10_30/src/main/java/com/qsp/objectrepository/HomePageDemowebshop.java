package com.qsp.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageDemowebshop {
public HomePageDemowebshop(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
@FindBy(linkText="Log out")
private WebElement logoutLink;

public WebElement getLogoutLink() {
	return logoutLink;
}
 
}
