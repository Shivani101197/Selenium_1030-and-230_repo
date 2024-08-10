package books;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.qsp.genericutility.BaseClass;
import com.qsp.genericutility.ExcelUtility;
import com.qsp.objectrepository.WelcomePageDemowebshop;


public class TC_DWS_005_Test extends BaseClass {
	@Test
	public void clickonBooks() throws EncryptedDocumentException, IOException 
	{
		wp=new WelcomePageDemowebshop(driver);
		wp.getBooksLink().click();
		excelLib=new ExcelUtility();
		String actualTtitle = driver.getTitle();
		String ExpectedTitle = excelLib.getStringDataFromExcel("Books", 1, 0);
		Assert.assertEquals(actualTtitle,ExpectedTitle,"Books page is not displayed");
		Reporter.log("Books page is displayed",true);
		
	}
}
