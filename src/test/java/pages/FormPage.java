package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormPage {
	
	WebDriver driver;
	
	public FormPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By SubmitBtn = By.id("submit");
	
	public void clicSubmitBtn() {
		driver.findElement(SubmitBtn).click();
	}
	
	By firstName = By.id("firstName");
	By lastName = By.id("lastName");
	By email = By.id("userEmail");
	By age = By.id("age");
	By salary = By.id("salary");
	By department = By.id("department");
	
	public void addFirstName(String userName) {
		driver.findElement(firstName).sendKeys(userName);
	}
	public void addLastName(String userLastName) {
		driver.findElement(lastName).sendKeys(userLastName);
	}
	public void addEmail(String uEmail) {
		driver.findElement(email).sendKeys(uEmail);
	}
	public void addAge(String uAge) {
		driver.findElement(age).sendKeys(uAge);
	}
	public void addSalary(String uSalary) {
		driver.findElement(salary).sendKeys(uSalary);
	}
	public void addDepartment(String uDepartment) {
		driver.findElement(department).sendKeys(uDepartment);
	}
	
	public void cleanAge() {
		driver.findElement(age).clear();
	}
	public void cleanSalary() {
		driver.findElement(salary).clear();
	}
	
}
