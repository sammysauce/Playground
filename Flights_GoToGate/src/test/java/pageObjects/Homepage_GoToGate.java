package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage_GoToGate {
	
	WebDriver driver = null;
	
	By returnRadio = By.id("tripTypeRadioButton_TRIP_TYPE_RETURN");
	By oneWayRadtio = By.id("tripTypeRadioButton_TRIP_TYPE_ONEWAY");
	By fromCity = By.xpath("//div[@id='react-select-2--value']//input");
	By toCity = By.xpath("//div[@id='react-select-3--value']//input");
	By submitBtn = By.id("airSubmitButtonId");
	By cookies = By.xpath("//button[@class='etiButton css-1w5zm52']");
	By fromdate = By.xpath("//div[@class='DayPicker-Day DayPicker-Day--selected DayPicker-Day--masked']");
	By todate = By.xpath("//div[@class='DayPicker-Day DayPicker-Day--masked'][contains(text(),'9')]");
	
	public Homepage_GoToGate (WebDriver driver) 
	{
		this.driver = driver;
	}

	public void clickonReturnRadio(){
		driver.findElement(returnRadio).click();
	
	}
	
	public void clickonOnwayRadio() {
		driver.findElement(oneWayRadtio).click();
	}
	
	public void fromTxtBox(String text) {
		driver.findElement(fromCity).sendKeys(text);
	}
	
	public void toTxtBox(String text) {
		driver.findElement(toCity).sendKeys(text);
	}
	
	public void submit() {
		driver.findElement(submitBtn).click();
		
	}
	public void cookiesnotif() {
		driver.findElement(cookies).click();
	}
	
	public void fromdate() {
		driver.findElement(fromdate).click();
	}
	
	public void todate() {
		driver.findElement(todate).click();
		
	}
}
	
