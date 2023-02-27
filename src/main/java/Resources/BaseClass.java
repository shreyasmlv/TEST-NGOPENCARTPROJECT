package Resources;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	public WebDriver driver;

	public void BrowserInitialization() throws IOException {
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties");

		Properties prop = new Properties();
		prop.load(fis);
		String Browsername = prop.getProperty("browser");
		if (Browsername.equalsIgnoreCase("chrome")) {

			driver = new ChromeDriver();
			driver.manage().window().maximize();
        } 
		
		else {
			System.out.println("enter valid browser name");
		}
	}

	@BeforeMethod
	public void launch() throws IOException {

		BrowserInitialization();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=common/home");
	}
}
