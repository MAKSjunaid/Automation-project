package ActionsInSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeys {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver dri=new ChromeDriver();
		dri.manage().window().maximize();
		dri.get("https://google.com");
		dri.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		WebElement ele=dri.findElement(By.name("q"));
		
		Actions act=new Actions(dri);
		act.sendKeys(ele, "It works").build().perform();
		
	}

}
