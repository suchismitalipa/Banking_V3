package Step_Defination;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import PageObject.AddCustomer_Page;
import PageObject.Login_Page;
import PageObject.SearchCustomer_Page;

public class BaseClass {
	public WebDriver driver;
	public Login_Page lp;
	public AddCustomer_Page addCust;
	public SearchCustomer_Page searchCust;
	public static Logger logger;
	public Properties configProp;
	public static String randomestring() {
		String generateString1 = RandomStringUtils.randomAlphabetic(5);
		return (generateString1);
		}
	
}
