package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.FormPage;
import pages.WebTablePage;

public class AddUser_TC1 {
	
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:/Users/Bayro/Drivers/chromedriver_win32/chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/webtables");
	
	WebTablePage webTable = new WebTablePage(driver);
	
	FormPage form = new FormPage(driver);
	
	webTable.clicAddBtn();
	
	form.addFirstName("Bayron");
	form.addLastName("Raggio");
	form.addEmail("bayronraggio@gmail.com");
	form.addAge("30");
	form.addSalary("15");
	form.addDepartment("QA");
	
	form.clicSubmitBtn();
	
	}





}
