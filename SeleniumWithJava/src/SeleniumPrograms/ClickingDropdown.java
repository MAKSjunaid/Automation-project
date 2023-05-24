package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickingDropdown {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\\\Selenium\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.actitime.com");
		
		String str=driver.findElement(By.xpath("//ul[@class='header__menu']/child::li/span[text()='Features']")).getText();
		System.out.println(str+" is clicked");
		
		WebElement btn=driver.findElement(By.xpath("//ul[@class='header__menu']/child::li/span[text()='Clients']"));
		btn.click();

	}

}
