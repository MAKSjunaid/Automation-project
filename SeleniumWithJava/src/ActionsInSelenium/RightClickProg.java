package ActionsInSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickProg {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver dri=new ChromeDriver();
		dri.manage().window().maximize();
		dri.get("https://google.com");
		dri.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		WebElement ele=dri.findElement(By.xpath("//*[@class='gb_3 gb_4 gb_3d gb_3c']"));
		
		Actions act=new Actions(dri);
//		act.contextClick(ele).build().perform();   //TO RIGHT CLICK ON PERTICULAR ELEMENT
//		act.doubleClick(ele).build().perform();    //TO DOUBLE CLICK ON PERTICULAR ELEMENT
		

	}

}
