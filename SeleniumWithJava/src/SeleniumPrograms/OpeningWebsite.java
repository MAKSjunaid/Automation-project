package SeleniumPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpeningWebsite 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe"); //SELECT BROWSER
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com"); //PROVIDED THE WEBSITE TO OPEN
		driver.manage().window().maximize(); //TO VIEW BROWSER IN FULL SCREEN	
	}
}
