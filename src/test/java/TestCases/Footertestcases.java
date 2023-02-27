package TestCases;

import java.time.Duration;

import org.testng.annotations.Test;

import PageObjectModel.FooterDashBoardObjects;
import PageObjectModel.HeaderDashboardObjects;
import Resources.BaseClass;
import Resources.constants;

@Test
public class Footertestcases extends BaseClass {

	public void footerobjects () {
		FooterDashBoardObjects FO=new FooterDashBoardObjects(driver);
		HeaderDashboardObjects HO=new HeaderDashboardObjects(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		//information
		FO.aboutusclick().click();
		FO.deliveryinfoclick().click();
		FO.privacypolicyclick().click();
		FO.termsandconditionclick().click();
		
		//customer service
		FO.contactusclick().click();
		HO.nameforcontactus().sendKeys(constants.nameforcontactus);
		HO.emailforcontactus().sendKeys(constants.emailforcontactus);
		HO.enquiryinfo().sendKeys(constants.enquiry);
		HO.submit().click();
		
		FO.returnsclick().click();
		FO.firstname().sendKeys(constants.firstname);
		FO.lastname().sendKeys(constants.lastname);
		FO.email().sendKeys(constants.email);
		FO.telephone().sendKeys(constants.telephone);
		FO.orderid().sendKeys(constants.orderid);
		FO.productname().sendKeys(constants.productname);
		FO.productcode().sendKeys(constants.productcode);
		FO.quantity().sendKeys(constants.quantity);
		FO.reasonforreturn().click();
		FO.productisopened().click();
		FO.submitclick().click();
		
		FO.sitemapclick().click();

		
		//EXTRAS
		FO.brandsclick().click();
		FO.appleclick().click();
		FO.giftcertificateclick().click();
		FO.affiliateclick().click();
		FO.specialofferclick().click();
		
		
		
		
		
	}
}
