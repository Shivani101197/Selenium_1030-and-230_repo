package com.qsp.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePageDemowebshop {
	//initialization
	public WelcomePageDemowebshop(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//declaration
	@FindBy(linkText = "Log in")
	private WebElement loginLink;
	
	@FindBy(linkText = "Register")
	private WebElement registerLink;
	
	@FindBy(xpath = "//span[text()=='Shoping cart']")
	private WebElement shoppingCartLink;
	
	@FindBy(partialLinkText = "Books")
	private WebElement booksLinks;      
	
	public WebElement getLoginLink() {
		return loginLink;
		
	}
	
	public WebElement getRegisterLink() {
		return registerLink;
		
	}
	
	public WebElement getShopingLink() {
		return shoppingCartLink;
	}
	
	public WebElement getBooksLink() {
		return booksLinks;
	}
}
