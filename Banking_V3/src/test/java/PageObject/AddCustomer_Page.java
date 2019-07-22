package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AddCustomer_Page {
	WebDriver Idriver;
	public AddCustomer_Page(WebDriver rdriver){
		Idriver = rdriver;
	}
	By lnkCustomers_menu = By.xpath("//a[@href='#']//span[contains(text(),'customers')]");
	By lnkCustomers_menuitem = By.xpath("//span[@class='menu-item-title'][contains(text(),'Customers')]");
	By btnAddnew=By.xpath("//a[@class='btn bg-blue']");
	By txtEmail=By.xpath("//input[@id='Email']");
	By txtPassword = By.xpath("//input[@id='Password']");
	By txtcustomerRoles =By.xpath("//input[@id='Email']");
	By lstitemAdminstrators=By.xpath("li[contains(text(),'Adminstrators')]");;
	By lstitemRegistered=By.xpath("li[contains(text(),'Registered')]");;
	By lstitemGuests=By.xpath("li[contains(text(),'Gusest')]");
	By lstItemVendor=By.xpath("li[contains(text(),'Vendors')]");
	By drpmgrOfVendor = By.xpath("//*[@id='VendorId']");
	By rdMaleGender =By.id("Gender_Male");
	By rdFeMaleGender =By.id("Gender_Female");
	By txtFirstName=By.xpath("//input[@id='FirstName']");
	By txtLastName=By.xpath("//input[@id='LastName']");
	By txtDob=By.xpath("//input[@id='DateOfBirth']");
	By txtCompanyName=By.xpath("//input[@id='Company']");
	By txtAdminContent=By.xpath("//input[@id='AdminComment']");
	By btnSave = By.xpath("//button[@name='save']");
	//Action method
	public String getPageTitle()
	{
		return Idriver.getTitle();
	}
	public void clickOnCustomerMenu() {
		Idriver.findElement(lnkCustomers_menu).click();
	}
	public void clickOnCustomerMenuItem() {
		Idriver.findElement(lnkCustomers_menuitem).click();
	}
	public void clickOnAddnew() {
		Idriver.findElement(btnAddnew).click();
	}
	public void setEmail(String email) {
		Idriver.findElement(txtEmail).sendKeys(email);
	}
	public void setPassword(String password) {
		Idriver.findElement(txtPassword).sendKeys(password);
	}	
	public void setCustomerRoles(String role) throws InterruptedException
	{
		if(!role.equals("Vendors"))
		{
			Idriver.findElement(By.xpath("[@id=]"));
		}
	Idriver.findElement(txtcustomerRoles).click();
	WebElement listitem = null;
	Thread.sleep(3000);
	if(role.equals("Admistrators"))
	{
		listitem = Idriver.findElement(lstitemAdminstrators);
	}
	else if(role.equals("Guests"))
	{
		listitem = Idriver.findElement(lstitemGuests);
	}
	else if(role.equals("Registered"))
	{
		listitem = Idriver.findElement(lstitemRegistered);
	}
	else if(role.equals("Vendors"))
	{
		listitem = Idriver.findElement(lstItemVendor);
	}
	listitem.click();
	JavascriptExecutor js = (JavascriptExecutor)Idriver;
	js.executeScript("arguments[0].click()",listitem);
	}
	
	public void setManagerOfVendor(String value)
	{
		Select drp=new Select(Idriver.findElement(drpmgrOfVendor));
	}
	public void setGender(String gender) {
		if(gender.equals("Male"))
		{
			Idriver.findElement(rdMaleGender).click();
		}
		else if(gender.equals("Female"))
		{
			Idriver.findElement(rdFeMaleGender).click();
		}
		else
		{
			Idriver.findElement(rdMaleGender).click();
		}
	}
	public void setFirstName(String fname) {
		Idriver.findElement(txtFirstName).sendKeys(fname);
	}
	public void setLastName(String lname) {
		Idriver.findElement(txtLastName).sendKeys(lname);
	}
	public void setDob(String dob) {
		Idriver.findElement(txtDob).sendKeys(dob);
	}
	public void setCompanyName(String comname) {
		Idriver.findElement(txtCompanyName).sendKeys(comname);
	}
	public void setAdminContent(String content) {
		Idriver.findElement(txtAdminContent).sendKeys(content);
	}
	public void clickOnSave() {
		Idriver.findElement(btnSave).click();
	}
	
	
}
