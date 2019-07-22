package PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Utilities.WaitHelper;

public class SearchCustomer_Page {
	public WebDriver Idriver;
	WaitHelper waithelper;
	
	public SearchCustomer_Page(WebDriver rdriver)
	{
		Idriver = rdriver;
		PageFactory.initElements(rdriver, this);
		waithelper = new WaitHelper(Idriver);
	}
	@FindBy(how = How.ID, using = "SearchEmail")
	@CacheLookup
	WebElement txtEmail;
	
	@FindBy(how = How.ID, using = "SearchFirstName")
	@CacheLookup
	WebElement txtFirstName;

	@FindBy(how = How.ID, using = "SearchLastName")
	@CacheLookup
	WebElement txtLastName;

	@FindBy(how = How.ID, using = "SearchMonthOfBirth")
	@CacheLookup
	WebElement drpdobMonth;
	
	@FindBy(how = How.ID, using = "SearchDayOfBirth")
	@CacheLookup
	WebElement drpdobDay;
	
	@FindBy(how = How.ID, using = "SearchCompany")
	@CacheLookup
	WebElement txtCompany;

	@FindBy(how = How.XPATH, using = "")
	@CacheLookup
	WebElement txtCustomeroles;
	
	@FindBy(how = How.XPATH, using = "")
	@CacheLookup
	WebElement lstitemAdministrators;
	
	@FindBy(how = How.XPATH, using = "")
	@CacheLookup
	WebElement lstitemRegistered;
	
	@FindBy(how = How.XPATH, using = "")
	@CacheLookup
	WebElement lstitemGuests;
	
	@FindBy(how = How.XPATH, using = "")
	@CacheLookup
	WebElement lstitemVendors;
	
	@FindBy(how = How.ID, using = "search-customers")
	@CacheLookup
	WebElement btnSearch;
	
	@FindBy(how = How.XPATH, using = "")
	@CacheLookup
	WebElement tblSearchResults;
	
	@FindBy(how = How.XPATH, using = "")
	@CacheLookup
	WebElement table;
	
	@FindBy(how = How.XPATH, using = "")
	@CacheLookup
	List<WebElement> tableRows;
	
	@FindBy(how = How.XPATH, using = "")
	@CacheLookup
	List<WebElement> tableColumns;
	
public void setEmail(String email)
{
	waithelper.WaitForElement(txtEmail, 10);
	txtEmail.clear();
	txtEmail.sendKeys(email);
	}
public void setFirstName(String FirstName)
{
	waithelper.WaitForElement(txtFirstName, 10);
	txtFirstName.clear();
	txtFirstName.sendKeys(FirstName);
	}

public void setLastName(String LastName)
{
	waithelper.WaitForElement(txtLastName, 10);
	txtLastName.clear();
	txtLastName.sendKeys(LastName);
}
public void clickSearch()
{
	waithelper.WaitForElement(btnSearch, 10);
	btnSearch.click();
}

public int getNoOfRows()
{
	return(tableRows.size());
}

public int getNoOfColumns()
{
	return(tableColumns.size());
}

public boolean searchCustomerByEmail(String email) {
	boolean flag = false;
	for(int i=1;i<=getNoOfRows();i++)
	{
		String emailid= table.findElement(By.xpath("''table[@id='customar-grid']/tbody/tr["+i+"]/td[2]")).getText();
		if (emailid.equals(email))
		{
			flag = true;
		}
	}
	return flag;
}

public boolean searchCustomerByName(String Name) {
	boolean flag = false;
	String Names[] = Name.split(" ");
	for(int i=1;i<=getNoOfRows();i++)
	{
		String name= table.findElement(By.xpath("''table[@id='customar-grid']/tbody/tr["+i+"]/td[2]")).getText();
		String names[] = name.split(" ");
		if (names[0].equals(Names[0]) && names[1].equals(Names[1]))  
		{
			flag = true;
		}
	}
	return flag;
}

}
