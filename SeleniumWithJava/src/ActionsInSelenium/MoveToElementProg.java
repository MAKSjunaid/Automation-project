package ActionsInSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementProg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver dri=new ChromeDriver();
		dri.manage().window().maximize();
		dri.get("https://lambdatest.com");
		dri.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		WebElement ele=dri.findElement(By.xpath("//*[@id='header']/nav/div/div/div[2]/div/div/button"));
		
		Actions act=new Actions(dri);
		act.moveToElement(ele).build().perform();
		Thread.sleep(2000);
		dri.findElement(By.xpath("//*[text()='Case Studies']")).click();
	}

}
