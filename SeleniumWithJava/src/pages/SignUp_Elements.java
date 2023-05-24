package pages;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUp_Elements 
{
	WebDriver driver=null;
	public SignUp_Elements(WebDriver driver)
	{
		this.driver=driver;
	}
	//DECLARING SIGNUP PAGE WEB ELEMENTS FROM FACEBOOK WEBSITE
//	By CREATE_ACCOUNT_BTN=By.id("u_0_2_Ah");
	By FIRST_NAME=By.name("firstname");
	By SURNAME=By.name("lastname");
	By MOBILE_NO=By.name("reg_email__");
	By PASSWORD=By.name("reg_passwd__");
	By DATE=By.id("day");
	By MONTH=By.id("month");
	By YEAR=By.id("year");
	By GENDER=By.xpath("//span[@data-type='radio']/span/label");
	By SIGNUP_BTN=By.name("websubmit");
	
	//WRITING ONE TEST CASE AS USER_SIGNUP
	public void USER_SIGNUP (String firstname,String surname,String phnnum,String password,int date,Object month,long year,String gender)
	{
		driver.findElement(By.xpath("//*[text()='Create New Account']")).click();
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.presenceOfElementLocated(FIRST_NAME));
		
		driver.findElement(FIRST_NAME).sendKeys(firstname);
		driver.findElement(SURNAME).sendKeys(surname);
		driver.findElement(MOBILE_NO).sendKeys(phnnum);
		driver.findElement(PASSWORD).sendKeys(password);
		Select dd=new Select(driver.findElement(DATE));
		dd.selectByValue("5");
		Select mm=new Select(driver.findElement(MONTH));
		mm.selectByValue("3");
		Select yy=new Select(driver.findElement(YEAR));
		yy.selectByValue("1997");
		
	    List<WebElement> geender=driver.findElements(GENDER);
	    for(WebElement ele:geender)
	    {
	    	if (ele.getText().equals(gender))
	    	{
	    		ele.click();
	    	}
	    }
		driver.findElement(SIGNUP_BTN).click();
	}
}
