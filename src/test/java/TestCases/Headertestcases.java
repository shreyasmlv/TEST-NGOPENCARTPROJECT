package TestCases;

import java.time.Duration;

import org.testng.annotations.Test;

import PageObjectModel.AddToCartobjects;
import PageObjectModel.HeaderDashboardObjects;
import Resources.BaseClass;
import Resources.commonmethods;
import Resources.constants;


@Test
public class Headertestcases extends BaseClass {
	
	public void headerobjects() throws InterruptedException {
		HeaderDashboardObjects HO=new HeaderDashboardObjects(driver);
		AddToCartobjects ATCO=new AddToCartobjects(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
	//Login
	HO.myaccountclick().click();
	HO.accloginclick().click();
	HO.Enterusername().sendKeys(constants.username);
	HO.Enterpassword().sendKeys(constants.password);
	HO.Clickonlogin().click();
	commonmethods.handleassertion(HO.errormsg().getText(), constants.errormsg);  
	
	//Register
	HO.myaccount_click().click();
	HO.clickonregister().click();
	HO.Enterfirstname().sendKeys(constants.firstname);
	HO.Enterlastname().sendKeys(constants.lastname);
	HO.EnterEmail().sendKeys(constants.email);
	HO.Entertelephone().sendKeys(constants.telephone);
	HO.Enterpassword_R().sendKeys(constants.password_R);
	HO.Confirmpassword().sendKeys(constants.confirmpassword);
	HO.clickoncheckbox().click();
	
	//Currency
	HO.currency().click();
	HO.currency_pound().click();
	HO.currency().click();
	HO.currency_euro().click();
	
	//contact us
	HO.contactusclick().click();
	HO.nameforcontactus().sendKeys(constants.nameforcontactus);
	HO.emailforcontactus().sendKeys(constants.emailforcontactus);
	HO.enquiryinfo().sendKeys(constants.enquiry);
	HO.submit().click();
	
	//WISHLIST
	ATCO.search().click();
	ATCO.search().sendKeys(constants.search);
	ATCO.searchbtnclick().click();
	ATCO.addtowishlist().click();
	HO.wishlistclick().click();
	
	//SHOPPINGCART
    HO.shoppingcartclick().click();
    HO.continuetoshop().click();
    
    //checkout
    ATCO.search().click();
	ATCO.search().sendKeys(constants.search1);
	ATCO.searchbtnclick().click();
	ATCO.openproduct().click();
	ATCO.addtocart().click();
	HO.checkoutclick().click();
	HO.guestcheckboxclick().click();
	HO.continueclick().click();
	HO.firstname().sendKeys(constants.firstnamecheckout);
	HO.lastname().sendKeys(constants.lastnamecheckout);
	HO.email().sendKeys(constants.emailcheckout);
	HO.telephoneno().sendKeys(constants.telephonenocheckout);
	HO.address().sendKeys(constants.addresscheckout);
	HO.cityname().sendKeys(constants.citycheckout);
	HO.postalcode().sendKeys(constants.postalcodecheckout);
	commonmethods.selectdropdown(HO.countryname(),"India");
	
	commonmethods.selectdropdown(HO.statename(),"Maharashtra");
	HO.billdetailscontinueclick().click();
	HO.addcomment().sendKeys(constants.addcomment);
	HO.continuedeliverymethod().click();
	HO.agreetnc().click();
	HO.continuepayment().click();
	
	
	
	
	
	
	}
	
	
	}
