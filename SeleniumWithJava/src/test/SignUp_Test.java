package test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.SignUp_Elements;

public class SignUp_Test {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		Thread.sleep(1000);
		SignUp_Elements ele=new SignUp_Elements(driver);
		ele.USER_SIGNUP("Mohd", "Junaid","9052864329","ThisIsPassword",5,3,1997,"Male");
		
		File FILE=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(FILE, new File("C:\\Users\\Junaid\\Desktop\\sss\\jj.png"));
	}
}