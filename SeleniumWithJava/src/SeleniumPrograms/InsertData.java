package SeleniumPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InsertData {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(1,TimeUnit.MILLISECONDS);  //WHY IT IS CROPPING, GIVE EXAMPLE IF CONDITION FAILS.
		WebElement inputdata= driver.findElement(By.className("inputtext _55r1 _6luy"));   //WHY BY.CLASS IS NOT WORKING HERE.
		Thread.sleep(3000);
		inputdata.sendKeys("motu patlu"); //EXAMPLE PROG OF CHILD PARENT RELATIONSHIP WITH XPATH. HOW TO CONNECT LOCALHOST
		
	}

}
