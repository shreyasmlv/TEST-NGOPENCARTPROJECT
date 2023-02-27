package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FooterDashBoardObjects {
	
	public WebDriver driver;

	
	public FooterDashBoardObjects(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver = driver2;
	}

	//Information
	By aboutusclick=By.xpath("//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=information/information&information_id=4']");
	By deliveryinfoclick=By.xpath("//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=information/information&information_id=6']");
	By privacypolicyclick=By.xpath("//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=information/information&information_id=3']");
	By tncclick=By.xpath("//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=information/information&information_id=5']");
	
	public WebElement aboutusclick() {
		return driver.findElement(aboutusclick);
	}
	public WebElement deliveryinfoclick() {
		return driver.findElement(deliveryinfoclick);
	}
	public WebElement privacypolicyclick() {
		return driver.findElement(privacypolicyclick);
	}
	public WebElement termsandconditionclick() {
		return driver.findElement(tncclick);
	}
	
	//Customer Service
	By contactusclick=By.xpath("(//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=information/contact'])[2]");
	By returnsclick=By.xpath("//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=account/return/add']");
	
	//returns details
	By firstname=By.xpath("//input[@id='input-firstname']");
	By lastname=By.xpath("//input[@id='input-lastname']");
	By email=By.xpath("//input[@id='input-email']");
	By telephone=By.xpath("//input[@id='input-telephone']");
	By orderid=By.xpath("//input[@id='input-order-id']");
	By productname=By.xpath("//input[@id='input-order-id']");
	By productcode=By.xpath("//input[@id='input-model']");
	By quantity=By.xpath("//input[@id='input-quantity']");
	By reasonforreturn=By.xpath("(//input[@name='return_reason_id'])[1]");
	By productisopened=By.xpath("(//label[@class='radio-inline'])[1]");
	By submitclick=By.xpath("//input[@value='Submit']");
	By sitemapclick=By.xpath("//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=information/sitemap']");
	
	public WebElement contactusclick() {
		return driver.findElement(contactusclick);
	}
	public WebElement returnsclick() {
		return driver.findElement(returnsclick);
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
	public WebElement telephone() {
		return driver.findElement(telephone);
	}
	public WebElement orderid() {
		return driver.findElement(orderid);
	}
	public WebElement productname() {
		return driver.findElement(productname);
	}
	public WebElement productcode() {
		return driver.findElement(productcode);
	}
	public WebElement quantity() {
		return driver.findElement(quantity);
	}
	public WebElement reasonforreturn() {
		return driver.findElement(reasonforreturn);
	}
	public WebElement productisopened() {
		return driver.findElement(productisopened);
	}
	public WebElement submitclick() {
		return driver.findElement(submitclick);
	}
	public WebElement sitemapclick() {
		return driver.findElement(sitemapclick);
	}
	
	
	//EXTRAS
	By brandsclick=By.xpath("//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=product/manufacturer']");
	By appleclick=By.xpath("//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=product/manufacturer/info&manufacturer_id=8']");
	By giftcertificateclick=By.xpath("//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=account/voucher']");
	By affiliateclick=By.xpath("//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=affiliate/login']");
	By specialofferclick=By.xpath("//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=product/special']");
	
	public WebElement brandsclick() {
		return driver.findElement(brandsclick);
	}
	public WebElement appleclick() {
		return driver.findElement(appleclick);
	}
	public WebElement giftcertificateclick() {
		return driver.findElement(giftcertificateclick);
	}
	public WebElement affiliateclick() {
		return driver.findElement(affiliateclick);
	}
	public WebElement specialofferclick() {
		return driver.findElement(specialofferclick);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
