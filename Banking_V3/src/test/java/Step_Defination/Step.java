package Step_Defination;

import static org.junit.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PageObject.AddCustomer_Page;
import PageObject.Login_Page;
import PageObject.SearchCustomer_Page;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Step extends BaseClass {
	@Before
	public void setup() throws IOException
	{
		logger = Logger.getLogger("Bankink_V3");
		PropertyConfigurator.configure("Log4j.properties");
		
		configProp = new Properties();
		FileInputStream configPropfile = new FileInputStream("config.properties");
		configProp.load(configPropfile);
		
		//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		
		String br = configProp.getProperty("browser");
		
		if(br.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",configProp.getProperty("chromepath"));
			driver = new ChromeDriver();
		}
		else if(br.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",configProp.getProperty("firefoxpath"));
			driver = new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		logger.info("*************Launching Browser*************");
		
}
	
	@Given("^user launch Chrome browser$")
	public void user_launch_Chrome_browser() throws Throwable {

		lp = new Login_Page(driver);
	}

	@When("^User opens URL \"([^\"]*)\"$")
	public void user_opens_URL(String url) throws Throwable {
		
		driver.get(url);
		logger.info("*************Launching URL*************");
	

	}

	@When("^user enters email as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void user_enters_email_as_and_password_as(String email, String password) throws Throwable {
		lp.setUsername(email);
		lp.setPassword(password);
		logger.info("*************providing Login Detailsr*************");
		

	}

	@When("^Click on  login$")
	public void click_on_login() throws Throwable {
	 lp.clickLogin();
	 logger.info("*************Started Login*************");
	}

	@Then("^Page Title should be \"([^\"]*)\"$")
	public void page_Title_should_be(String title) throws Throwable {
		String titleget = driver.getTitle();
		if(titleget.equals(title))
		{
			Assert.assertTrue(true);
			logger.info("*************Login passed*************");
		}else
		{
			Assert.assertTrue(false);
			driver.close();
			logger.info("*************Login Failed*************");
		}	
	}

	@When("^User click on logout link$")
	public void user_click_on_logout_link() throws Throwable {
		Thread.sleep(5000);
		lp.clickLogout();

	}

	@Then("^Close browser$")
	public void close_browser() throws Throwable {
		driver.close();
		driver.quit();

	}
	
	//Add customer
	@Then("^User can view the dashboard$")
	public void user_can_view_the_dashboard() throws Throwable {
		addCust = new AddCustomer_Page(driver);
		Assert.assertEquals("Your store. Login",addCust.getPageTitle());
	}

	@When("^user click on customers menu$")
	public void user_click_on_customers_menu() throws Throwable {
		Thread.sleep(2000);
		addCust.clickOnCustomerMenu();
	}

	@When("^user click on customers menu item$")
	public void user_click_on_customers_menu_item() throws Throwable {
		Thread.sleep(2000);
		addCust.clickOnCustomerMenuItem();

	}

	@When("^click on add new customer page$")
	public void click_on_add_new_customer_page() throws Throwable {
		Assert.assertEquals("Add a new custoner page", addCust.getPageTitle());

	}

	@When("^user enter customer info$")
	public void user_enter_customer_info() throws Throwable {
		String email1 = randomestring()+"@gmail.com";
		addCust.setEmail(email1);
		addCust.setPassword("test123");
		addCust.setCustomerRoles("Guest");
		addCust.setManagerOfVendor("Vendor 2");
		addCust.setGender("Male");
		addCust.setFirstName("Pavan");
		addCust.setLastName("Kumar");
		addCust.setDob("07/07/2019");
		addCust.setCompanyName("busyQA");
		addCust.setAdminContent("this is for testing");
		
	}

	@When("^click on save button$")
	public void click_on_save_button() throws Throwable {
		addCust.clickOnSave();

	}

	@Then("^user can view confirmation message \"([^\"]*)\"$")
	public void user_can_view_confirmation_message(String arg1) throws Throwable {
		Assert.assertEquals(arg1,"this is a mesage" );
		
	}

	//search email
	@When("^Enter customer Email$")
	public void enter_customer_Email() throws Throwable {
		searchCust = new SearchCustomer_Page(driver);
		searchCust.setEmail("victorianop@Commerce.com");
	}

	@When("^click on search btton$")
	public void click_on_search_btton() throws Throwable {
		searchCust.clickSearch();
		Thread.sleep(3000);
	}

	@Then("^user should found email in the search table$")
	public void user_should_found_email_in_the_search_table() throws Throwable {
		boolean status = searchCust.searchCustomerByEmail("victorianop@Commerce.com");
		Assert.assertEquals(true, status);
		
	}
	}




