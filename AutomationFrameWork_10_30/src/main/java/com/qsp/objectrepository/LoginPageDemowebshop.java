package com.qsp.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageDemowebshop {
	
	public LoginPageDemowebshop(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
		
		@FindBy(id="Email")
		private  WebElement emailTextField;
		
		@FindBy(id="Password")
		private WebElement passwordTextFeild;
		
		@FindBy(xpath = "/input[value='Log in']")
		private WebElement loginButton;

		public WebElement getEmailTextField() {
			return emailTextField;
		}

		public WebElement getPasswordTextFeild() {
			return passwordTextFeild;
		}

		public WebElement getLoginButton() {
			return loginButton;
		}
}
		
		
		

		
		
				
		
			
		

		
			
		
		
	
	


