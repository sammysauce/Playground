package co.uk.gotogate.flights;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pageObjects.Homepage_GoToGate;
import listeners.CustomListeners;


@Listeners (CustomListeners.class)
public class NewYorkTest {
	private WebDriver driver;
	private String baseUrl;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Samuel\\Documents\\Software Testing\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		
		baseUrl = "https://www.gotogate.co.uk/";
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void newYork () {
		Homepage_GoToGate homepageobj = new Homepage_GoToGate(driver);
		
		driver.get(baseUrl);
	
		homepageobj.cookiesnotif();
	
		
		String homepage = driver.getTitle();
		Assert.assertEquals(homepage, ("Book cheap travel deals to all over the world with Gotogate UK!"));
		driver.close();
	}
	
	@Test
	public void newYork2() {
		Homepage_GoToGate homepageobj = new Homepage_GoToGate(driver);
		
		driver.get(baseUrl);
	
		homepageobj.cookiesnotif();
	
		
		String homepage = driver.getTitle();
		System.out.println("this is the title : " + homepage);
		driver.close();
	}

	@AfterMethod
	public void teardown() {
		System.out.println("fin");
	}
}
