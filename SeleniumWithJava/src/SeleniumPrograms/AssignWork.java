package SeleniumPrograms;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignWork {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS); 
		WebElement inputdata= driver.findElement(By.name("q"));
		Thread.sleep(2000); //2 SECONDS AFTER OPENING THE LINK
		inputdata.sendKeys("selenium");
		
		//TAKING ALL THE SEARCH RESULT USING XPATH
		List <WebElement> lisst=driver.findElements(By.xpath("//ul[@role='listbox']/li/descendant::div[@class='eIPGRd']"));
		System.out.println(lisst.size()); //GOT NUMBER OF SEARCH RESULTS
		
		for(int i=0;i<lisst.size();i++) //INCREASING I VALUE ONE BY ONE
		{
			String Alliteams=lisst.get(i).getText(); //STORING ALL 10 SEARCH SEARCH RESULTS
			if(Alliteams.contains("selenium testing")) //COMPARING ONE BY ONE SEARCH RESULT WITH THIS WORD, IF MATCH THEN GO NEXT
			{
				Thread.sleep(2000); //TAKE 2 SECONDS
				lisst.get(i).click(); //CLICKED THAT RESULT
				System.out.println("Test case pass"); //PRINT IN CONSOLE
				break; //NO NEED TO CHECK AGAIN
			}
			else
			{
				System.out.println("No search result found");
//				break;
			}
		}
		Thread.sleep(3000); //WAIT FOR 3 SECONDS
		driver.quit(); //CLOSE THE BROWSER
	}
}
