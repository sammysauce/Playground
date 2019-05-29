package co.uk.gotogate.flights;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pageObjects.Homepage_GoToGate;
import listeners.CustomListeners;


@Listeners (CustomListeners.class)
public class ChicagoTest {
	private WebDriver driver;
	private String baseUrl;


	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Samuel\\Documents\\Software Testing\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		
		baseUrl = "https://www.gotogate.co.uk/";
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void Chicago () {
		Homepage_GoToGate homepageobj = new Homepage_GoToGate(driver);
		
		driver.get(baseUrl);
	
		homepageobj.cookiesnotif();
	
		
		String homepage = driver.getTitle();
		Assert.assertEquals(homepage, ("Book cheap travel deals to all over the world with Gotogate UK!"));
		homepageobj.fromTxtBox("London");
		homepageobj.toTxtBox("Chicago");
		
		homepageobj.submit();
		

		//WebElement error = driver.findElement(By.className("searchFormError"));
		//Assert.assertEquals(error, "You have not selected return date");
		
		//homepageobj.fromdate();
		//homepageobj.todate();
		
		
	}
	
	@Test
	public void Chicago2() {
		Homepage_GoToGate homepageobj = new Homepage_GoToGate(driver);
		
		driver.get(baseUrl);
		homepageobj.cookiesnotif();
		//homepageobj.clickonOnwayRadio();
		homepageobj.fromTxtBox("London");
		homepageobj.toTxtBox("Chicago");
		//homepageobj.fromdate();
		//homepageobj.todate();
		homepageobj.submit();
	
		

	//	String homepage = driver.getTitle();
		//Assert.assertEquals(homepage, ("Book cheap travel deals to all over the world with Gotogate UK!"));
		
		//WebElement error = driver.findElement(By.className("searchFormError"));
		//Assert.assertEquals(error, "You have not selected return date");
	
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
		System.out.println("ran succesfully!");
	}
}
