package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.WebTablePage;

public class DeleteUser_TC5 {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:/Users/Bayro/Drivers/chromedriver_win32/chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://demoqa.com/webtables");
	
	WebTablePage webTable = new WebTablePage(driver);
	
	webTable.clicDeleteBtn();
	
	
	}
}
