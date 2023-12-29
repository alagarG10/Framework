package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.base.BaseAdactin;

import utilities.ReadExcelData;

public class TC3_Select_Hotel_Page extends BaseAdactin {
	
	@Test(dataProviderClass=ReadExcelData.class,dataProvider="AdactinTestData")
	public void Verify_TC3_Select_Hotel(String username, String password) throws InterruptedException {
		
		// LoginPage
		driver.get("https://adactinhotelapp.com/index.php");
		Thread.sleep(3000);
		driver.findElement(By.id(loc.getProperty("Textbox_Username"))).sendKeys(username);
		driver.findElement(By.id(loc.getProperty("Textbox_Password"))).sendKeys(password);
		driver.findElement(By.id(loc.getProperty("Login_Button"))).click();

		// Search Hotel Page
		Thread.sleep(3000);
		WebElement locDropDown = driver.findElement(By.id(loc.getProperty("location_dropdown")));
		Select s1 = new Select(locDropDown);
		s1.selectByVisibleText("London");
		driver.findElement(By.id(loc.getProperty("search_btn"))).click();

		// Search Hotel
		Thread.sleep(3000);
		driver.findElement(By.id(loc.getProperty("hotel_btn_rdo"))).click();
		driver.findElement(By.id(loc.getProperty("cntue_btn"))).click();

	}

}
