package SeleniumPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBar 
{
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in");
		
		JavascriptExecutor JAVA= (JavascriptExecutor) driver;  //TO SCROLL DOWN (HORIZONTAL)
		JAVA.executeScript("window.scrollBy(0,5000)", " ");  
		System.out.println("Scrolled down.");
		Thread.sleep(2000);
		
		JAVA.executeScript("window.scrollBy(0,-2000)", " ");   //TO SCROLL UP (HORIZONTAL)
		System.out.println("Scrolled up.");
		Thread.sleep(2000);
		
		JAVA.executeScript("window.scrollTo(2000,3000)", " ");  //TO SCROLL RIGHT (VERTICAL)
		System.out.println("Scrolled Right.");
		Thread.sleep(2000);
		
		JAVA.executeScript("window.scrollTo(-2000,3000)", " ");  //TO SCROLL LEFT (VERTICAL)
		System.out.println("Scrolled Right.");
		Thread.sleep(2000);
	}
}
