package SeleniumPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledProg {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver drv=new ChromeDriver();
		drv.manage().window().maximize();
		drv.get("https://demoqa.com/radio-button");
		drv.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		WebElement nri=drv.findElement(By.id("yesRadio"));
        System.out.println(nri.isSelected());
		
		
//		WebElement ele=drv.findElement(By.id("noRadio"));
//        System.out.println(ele.isEnabled());
	}
}
