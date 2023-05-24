package SeleniumPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContainsMethod 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//*[contains(text(),'Business')]")).click();  //CONTAINS METHOD
//		driver.findElement(By.xpath("//*[starts-with(text(),'Busi')]")).click();   // "STARTS WITH" METHOD
		
		//ISENABLLED,ISCONTAINS,ISDISPLAYED
		
		Thread.sleep(3000);
		driver.close();
	}
}
