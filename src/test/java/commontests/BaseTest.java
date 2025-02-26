package commontests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseTest {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void BeforeTest()
	{
		System.out.println("I am before Test");
	}

	public WebDriver startTest()
	{
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();

	return driver;
	}
	
	
	@AfterMethod
	public void closeTest()
	{
		System.out.println("I am closing the browser");
		driver.close();
	}
	
}
