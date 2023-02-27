package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeaderDashboardObjects {

	public WebDriver driver;

	public HeaderDashboardObjects(WebDriver driver2) {
		this.driver = driver2;
	}
	// account login
	By myaccount = By.xpath("//span[@class='caret']");
	By acclogin = By.xpath("//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=account/login']");
	By username = By.xpath("//input[@id='input-email']");
	By password = By.xpath("//input[@id='input-password']");
	By login = By.xpath("//input[@value='Login']");
	By errormsg=By.xpath("//div[@class='alert alert-danger alert-dismissible']");

	public WebElement myaccountclick() {
		return driver.findElement(myaccount);
	}
	public WebElement accloginclick() {
		return driver.findElement(acclogin);
	}
	public WebElement Enterusername() {
		return driver.findElement(username);
	}
	public WebElement Enterpassword() {
		return driver.findElement(password);
	}
	public WebElement Clickonlogin() {
		return driver.findElement(login);
	}
	public WebElement errormsg() {
		return driver.findElement(errormsg);
	}
	
	//Register account
	By myaccount_ = By.xpath("//span[@class='caret']");
	By register= By.xpath("//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=account/register']");
	By Enterfirstname=By.xpath("//input[@id='input-firstname']");
	By Enterlastname= By.xpath("//input[@id='input-lastname']");
	By EnterEmail= By.xpath("//input[@id='input-email']");
	By Entertelephone= By.xpath("//input[@id='input-telephone']");
	By Enterpassword= By.xpath("//input[@id='input-password']");
	By Confirmpassword=By.xpath("//input[@id='input-confirm']");
	By checkboxclick=By.xpath("//input[@type='checkbox']");
	
	
	public WebElement myaccount_click() {
		return driver.findElement(myaccount_);
	}
	public WebElement clickonregister() {
		return driver.findElement(register);
	}
	public WebElement Enterfirstname() {
		return driver.findElement(Enterfirstname);
	}
	public WebElement Enterlastname() {
		return driver.findElement(Enterlastname);
	}
	public WebElement EnterEmail() {
		return driver.findElement(EnterEmail);
	}
	public WebElement Entertelephone() {
		return driver.findElement(Entertelephone);
	}
	public WebElement Enterpassword_R() {
		return driver.findElement(Enterpassword);
	}
	public WebElement Confirmpassword() {
		return driver.findElement(Confirmpassword);
	}
	public WebElement clickoncheckbox() {
		return driver.findElement(checkboxclick);
	}
	
	//currency
	
	By currency=By.xpath("//i[@class='fa fa-caret-down']");
	By currency_pound=By.xpath("//button[@name='GBP']");
	By currency_euro=By.xpath("//button[@name='EUR']");
	
	public WebElement currency() {
		return driver.findElement(currency);
	}
	public WebElement currency_pound() {
		return driver.findElement(currency_pound);
	}
	public WebElement currency_euro() {
		return driver.findElement(currency_euro);
	}
	
	
	//Contact us
	By contactusclick=By.xpath("//i[@class='fa fa-phone']");
	By nameforcontactus=By.xpath("//input[@id='input-name']");
	By emailforcontactus=By.xpath("//input[@id='input-email']");
	By enquiryinfo=By.xpath("//textarea[@id='input-enquiry']");
	By submit=By.xpath("//input[@value='Submit']");
	
	public WebElement contactusclick() {
		return driver.findElement(contactusclick);
	}
	public WebElement nameforcontactus () {
		return driver.findElement(nameforcontactus);
	}
	public WebElement emailforcontactus() {
		return driver.findElement(emailforcontactus);
	}
	public WebElement enquiryinfo() {
		return driver.findElement(enquiryinfo);
	}
	public WebElement submit() {
		return driver.findElement(submit);
	}

	//WISHLIST
	By wishlistclick=By.xpath("//i[@class='fa fa-heart']");
	public WebElement wishlistclick() {
		return driver.findElement(wishlistclick);
	}
	
	//SHOPPINGCART
	By shoppingcartclick=By.xpath("//i[@class='fa fa-shopping-cart'][1]");
	By continuetoshop=By.xpath("//a[@class='btn btn-primary']");
	
	public WebElement shoppingcartclick() {
		return driver.findElement(shoppingcartclick);
	}
	public WebElement continuetoshop() {
		return driver.findElement(continuetoshop);
	}
	
	//checkout
	By checkoutclick=By.xpath("//span[contains(text(),'Checkout')]");
	By guestcheckboxclick=By.xpath("//input[@value='guest']");
	By continueclick=By.xpath("//input[@id='button-account']");
	By firstname=By.xpath("//input[@placeholder='First Name']");
	By lastname=By.xpath("//input[@placeholder='Last Name']");
	By email=By.xpath("//input[@id='input-payment-email']");
	By telephoneno=By.xpath("//input[@id='input-payment-telephone']");
	By address=By.xpath("//input[@id='input-payment-address-1']");
	By cityname=By.xpath("//input[@id='input-payment-city']");
	By postalcode=By.xpath("//input[@id='input-payment-postcode']");
	By countryname=By.xpath("//select[@id='input-payment-country']");
	By statename=By.xpath("//select[@id='input-payment-zone']");
	By billdetailscontinueclick=By.xpath("//input[@id='button-guest']");
	By addcomment=By.xpath("//textarea[@name='comment']");
	By continuedeliverymethod=By.xpath("//input[@id='button-shipping-method']");
	By agreetnc=By.xpath("//input[@name='agree']");
	By continuepayment=By.xpath("//input[@id='button-payment-method']");
	
	public WebElement checkoutclick() {
		return driver.findElement(checkoutclick);
	}
	public WebElement guestcheckboxclick() {
		return driver.findElement(guestcheckboxclick);
	}
	public WebElement continueclick() {
		return driver.findElement(continueclick);
	}
	public WebElement firstname() {
		return driver.findElement(firstname);
	}
	public WebElement lastname() {
		return driver.findElement(lastname);
	}
	public WebElement email() {
		return driver.findElement(email);
	}
	public WebElement telephoneno() {
		return driver.findElement(telephoneno);
	}
	public WebElement address() {
		return driver.findElement(address);
	}
	public WebElement cityname() {
		return driver.findElement(cityname);
	}
	public WebElement postalcode() {
		return driver.findElement(postalcode);
	}
	public WebElement countryname() {
		return driver.findElement(countryname);
	}
	public WebElement statename() {
		return driver.findElement(statename);
	}
	public WebElement billdetailscontinueclick() {
		return driver.findElement(billdetailscontinueclick);
	}
	public WebElement addcomment() {
		return driver.findElement(addcomment);
	}
	public WebElement continuedeliverymethod() {
		return driver.findElement(continuedeliverymethod);
	}
	public WebElement agreetnc() {
		return driver.findElement(agreetnc);
	}
	public WebElement continuepayment() {
		return driver.findElement(continuepayment);
	}
	
	
	
	
	
}
