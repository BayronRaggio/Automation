package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebTablePage {
	
	WebDriver driver;
	
	public WebTablePage(WebDriver driver) {
		this.driver = driver;
	}
	
	By AddBtn = By.id("addNewRecordButton");
	
	public void clicAddBtn() {
		driver.findElement(AddBtn).click();
	}
	
	By EditBtn = By.id("edit-record-3");
	
	public void clicEditBtn() {
		driver.findElement(EditBtn).click();
	}
	
	By DeleteBtn = By.id("delete-record-3");
	
	public void clicDeleteBtn() {
		driver.findElement(DeleteBtn).click();
	}
	
	By searchBox = By.id("searchBox");
	
	public void clicSearchBox() {
		driver.findElement(searchBox).click();
	}
	
	public void sendData() {
		driver.findElement(searchBox).sendKeys("Alden");
	}
	
	
}
