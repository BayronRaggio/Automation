package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.FormPage;
import pages.WebTablePage;

public class EditUser_TC2 {
	
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:/Users/Bayro/Drivers/chromedriver_win32/chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://demoqa.com/webtables");
	
	WebTablePage webTable = new WebTablePage(driver);
	
	FormPage form = new FormPage(driver);
	
	webTable.clicEditBtn();
	
	form.cleanAge();
	form.addAge("25");
	
	form.cleanSalary();
	form.addSalary("1700");
	
	form.clicSubmitBtn();
	
	}


}
