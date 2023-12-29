package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.base.BaseAdactin;

import utilities.ReadExcelData;

public class AdactinHotel extends BaseAdactin{
	
	@Test(dataProviderClass=ReadExcelData.class,dataProvider="AdactinTestData")
	public static void LoginTest(String username, String password) 
	{
		//LoginPage
		driver.get("https://adactinhotelapp.com/index.php");
		driver.findElement(By.id(loc.getProperty("Textbox_Username"))).sendKeys(username);
		driver.findElement(By.id(loc.getProperty("Textbox_Password"))).sendKeys(password);
		driver.findElement(By.id(loc.getProperty("Login_Button"))).click();
		

	}
	
	
}
