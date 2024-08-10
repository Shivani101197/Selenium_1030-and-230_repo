package com.qsp.genericutility;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WebDriverUtility {
	Actions act;
 public WebDriverUtility(WebDriver driver) {
	 act=new Actions(driver);
	
}
 
 public void doubleClick(WebElement element) {
	 act.doubleClick(element).perform();
 }
 
 public void clickAndHold(WebElement element) {
	 act.clickAndHold(element).perform();
	 
 }
 
 public void dragAndDrop(WebElement source, WebElement target) {
	 act.dragAndDrop(source, target).perform();
 }
 
 public void scrollToElement(WebElement element) {
	 act.scrollToElement(element).perform();
 }
 
 public void mouseHover(WebElement element) {
	 act.moveToElement(element).perform();
	 
 }
 public void switchTo(WebDriver driver,String expectedUrl) {
	 Set<String> allWindows = driver.getWindowHandles();
	 for(String id:allWindows) {
		 String actUrl=driver.switchTo().window(id).getCurrentUrl();
		 if(actUrl.contains(expectedUrl)) {
			 break;
		 }
	 }
	 
 }
}
