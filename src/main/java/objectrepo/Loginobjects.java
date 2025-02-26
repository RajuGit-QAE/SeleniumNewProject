package objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginobjects {
	WebDriver driver;
	public Loginobjects(WebDriver driver)
	
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "email")
	WebElement usernamefield;
	
	@FindBy(name = "password")
	WebElement passwordfield;
	
	
	//action methods
	public void launchurl(String url)
	{
		driver.get(url);
	}
	
	public void loginDetails(String username, String password)
	{
		usernamefield.sendKeys(username);
		passwordfield.sendKeys(password);
	}
	
	

}
