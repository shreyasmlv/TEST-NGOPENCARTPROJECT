package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObjects {
 
	public WebDriver driver;

	public HomePageObjects(WebDriver driver2) {
		this.driver=driver2;
	}
	
	//DESKTOP
	By desktop=By.xpath("(//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=20'])[1]");
	By showalldesktop=By.xpath("//a[contains(text(),'Show All Desktops')]");
	By listview=By.xpath("//i[@class='fa fa-th-list']");
	
	public WebElement desktop() {
		return driver.findElement(desktop);
	}
	public WebElement showalldesktop() {
		return driver.findElement(showalldesktop);
	}
	public WebElement listviewdesktop() {
		return driver.findElement(listview);
	}
	
	//LAPTOP&NOTEBOOKS
	By laptop=By.xpath("(//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=18'])[1]");
	By showalllaptop=By.xpath("//a[contains(text(),'Show All Laptops & Notebooks')]");
	By gridview=By.xpath("//i[@class='fa fa-th']");
	By sort=By.xpath("//select[@id='input-sort']");
	By product1compare=By.xpath("(//i[@class='fa fa-exchange'])[1]");
	By product2compare=By.xpath("(//i[@class='fa fa-exchange'])[5]");
	By productscompare=By.xpath("//a[@id='compare-total']");
	
	public WebElement laptop() {
		return driver.findElement(laptop);
	}
	public WebElement showalllaptop() {
		return driver.findElement(showalllaptop);
	}
	public WebElement gridviewlaptop() {
		return driver.findElement(gridview);
	}
	public WebElement sortlaptop() {
		return driver.findElement(sort);
	}
	public WebElement product1compare() {
		return driver.findElement(product1compare);
	}
	public WebElement product2compare() {
		return driver.findElement(product2compare);
	}
	public WebElement productscompare() {
		return driver.findElement(productscompare);
	}
	//COMPONENTS
	By components=By.xpath("(//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=25'])[1]");
	By showallcomponents=By.xpath("//a[contains(text(),'Show All Components')]");
	
	public WebElement components() {
		return driver.findElement(components);
	}
	public WebElement showallcomponents() {
		return driver.findElement(showallcomponents);
	}
	
	//TABLETS
	By tablets=By.xpath("(//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=57'])[1]");
	By sort_1=By.xpath("//select[@id='input-sort']");
	
	public WebElement tablets() {
		return driver.findElement(tablets);
	}
	public WebElement tabletsort() {
		return driver.findElement(sort_1);
	}
	
	//SOFTWARE
	By software=By.xpath("(//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=17'])[1]");
	
	public WebElement software() {
		return driver.findElement(software);
	}
	
	//PHONES&PDA
	By phones=By.xpath("(//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=24'])[1]");
	By listview_1=By.xpath("//button[@id='list-view']");
	By addtowishlist=By.xpath("(//button[@data-original-title='Add to Wish List'])[1]");
	
	public WebElement phones() {
		return driver.findElement(phones);
	}
	public WebElement listviewphones() {
		return driver.findElement(listview_1);
	}
	public WebElement addtowishlistphones() {
		return driver.findElement(addtowishlist);
	}
	
	//CAMERA
	By camera=By.xpath("(//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=33'])[1]");
	By listview_2=By.xpath("//i[@class='fa fa-th-list']");
	By sort_2=By.xpath("//select[@id='input-sort']");
	
	public WebElement camera() {
		return driver.findElement(camera);
	}
	public WebElement cameralistview() {
		return driver.findElement(listview_2);
	}
	public WebElement camerasort() {
		return driver.findElement(sort_2);
	}
	
	//MP3PLAYER
	By mp3player=By.xpath("(//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=34'])[1]");
	By showallmp3=By.xpath("//a[contains(text(),'Show All MP3 Players')]");
	By gridview_1=By.xpath("//button[@id='grid-view']");
	
	public WebElement mp3player() {
		return driver.findElement(mp3player);
	}
	public WebElement showallmp3() {
		return driver.findElement(showallmp3);
	}
	public WebElement mp3gridview() {
		return driver.findElement(gridview_1);
	}
	
	
	
	
}
