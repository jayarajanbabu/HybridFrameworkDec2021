package com.qa.opencartapp.tests;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

import com.qa.opencartapp.factory.DriverFactory;
import com.qa.opencartapp.pages.AccountsPage;
import com.qa.opencartapp.pages.LoginPage;
import com.qa.opencartapp.pages.ProductInfoPage;
import com.qa.opencartapp.pages.RegistrationPage;
import com.qa.opencartapp.pages.SearchResultsPage;

public class BaseTest {
	
	DriverFactory df;
	Properties prop;
	WebDriver driver;
	LoginPage loginPage;
	RegistrationPage regPage;
	AccountsPage accountsPage;
	SearchResultsPage searchResultsPage;
	ProductInfoPage productInfoPage;
	SoftAssert softAssert;
	
	@BeforeTest
	public void setUp() {
		df = new DriverFactory();
		prop = df.init_prop();
		driver = df.init_driver(prop);
		loginPage= new LoginPage(driver);
		softAssert = new SoftAssert();
		}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
