package com.qsp.genericutility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.qsp.objectrepository.HomePageDemowebshop;
import com.qsp.objectrepository.LoginPageDemowebshop;
import com.qsp.objectrepository.WelcomePageDemowebshop;

public class BaseClass {
	public static WebDriver driver;

	public FileUtility fileLib;

	public WelcomePageDemowebshop wp;
	public LoginPageDemowebshop lp;
	public HomePageDemowebshop hp;
	public ExcelUtility excelLib;
	

	@BeforeClass
	public void launchBrowser() throws IOException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		fileLib = new FileUtility();
		String url = fileLib.getDataFromProperty("url");
		driver.get(url);

	}
	@BeforeMethod
	public void login() throws IOException {
	
		wp=new WelcomePageDemowebshop(driver);
		wp.getLoginLink().click();
		lp=new LoginPageDemowebshop(driver);
		String email = fileLib.getDataFromProperty("email");
		String password = fileLib.getDataFromProperty("password");
		lp.getEmailTextField().sendKeys(email);
		lp.getPasswordTextFeild().sendKeys(password);
		lp.getLoginButton();
		
	}
	
@AfterMethod
public void logout1() {
	hp=new HomePageDemowebshop(driver);
	hp.getLogoutLink().click();
}
@AfterClass
public void closeBrowser() {
	driver.quit();

}
}

