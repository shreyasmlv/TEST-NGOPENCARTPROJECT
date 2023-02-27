package TestCases;

import java.time.Duration;

import org.testng.annotations.Test;

import PageObjectModel.HomePageObjects;
import Resources.BaseClass;
import Resources.commonmethods;

@Test
public class Homepagetestcases extends BaseClass {

	public void homepageobjects() throws InterruptedException  {
		
		HomePageObjects HPO=new HomePageObjects(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//desktop
		commonmethods.mouseoverhandle(HPO.desktop(), driver);
		HPO.showalldesktop().click();
		HPO.listviewdesktop().click();
		
		//laptop
		commonmethods.mouseoverhandle(HPO.laptop(), driver);
		HPO.showalllaptop().click();
		HPO.gridviewlaptop().click();
		commonmethods.selectdropdown(HPO.sortlaptop(), "Name (A - Z)");
		HPO.product1compare().click();
		HPO.product2compare().click();
		HPO.productscompare().click();
		
		//components
		commonmethods.mouseoverhandle(HPO.components(), driver);
		HPO.showallcomponents().click();
		
		//tablets
		HPO.tablets().click();
		commonmethods.selectdropdown(HPO.tabletsort(), "Name (A - Z)");
		
		//software
		HPO.software().click();
		
		//phones&pda
		HPO.phones().click();
		HPO.listviewphones().click();
		HPO.addtowishlistphones().click();
		
		//camera
		HPO.camera().click();
		HPO.cameralistview().click();
		commonmethods.selectdropdown(HPO.camerasort(), "Name (A - Z)");
		
		//mp3players
		commonmethods.mouseoverhandle(HPO.mp3player(), driver);
		HPO.showallmp3().click();
		HPO.mp3gridview().click();
		
		
		
	}
	
	
}
