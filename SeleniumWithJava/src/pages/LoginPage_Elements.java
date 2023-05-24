package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage_Elements 
{
	WebDriver driver=null;
	public LoginPage_Elements(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	//DECLARING WEB ELEMENTS FROM FACEBOOK WEBSITE
	By USERNAME=By.name("email");
	By PASSWORD=By.id("pass");
	By SUBMIT_BTN=By.name("login");
	
	//WROTE ONE TEST CASE AS USER_LOGIN
	public void USER_LOGIN(String id,String pass)
	{
		driver.findElement(USERNAME).sendKeys(id);
		driver.findElement(PASSWORD).sendKeys(pass);
		driver.findElement(SUBMIT_BTN).click();
	}
}
