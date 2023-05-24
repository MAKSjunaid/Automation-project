package SeleniumPrograms;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownProg 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver dri=new ChromeDriver();
		dri.manage().window().maximize();
		dri.get("https://demoqa.com/select-menu");
		dri.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
//		WebElement ele=dri.findElement(By.id("oldSelectMenu"));
//		ele.click();
//		Thread.sleep(4000);
		Select sel=new Select(dri.findElement(By.id("oldSelectMenu")));
		sel.selectByIndex(4);                  //SELECT BY INDEX
//		sel.selectByValue("10");               //SELECT BY VALUE
		
		List <WebElement> liiist=sel.getOptions();
		System.out.println(liiist.size());
		for (WebElement temp : liiist) {
			System.out.println(temp.getText());
		}
		
		Thread.sleep(4000);
		dri.close();
	}

}
