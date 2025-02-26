package alltests;

import org.testng.annotations.Test;
import commontests.BaseTest;
import objectrepo.Loginobjects;


public class EndtoEndTest extends BaseTest{
	


	@Test
	public void loginTest() throws InterruptedException
	{

		Loginobjects login = new Loginobjects(startTest());
		login.launchurl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		login.loginDetails("leoganapathy5691@gmail.com", "9629850709");
		Thread.sleep(5000);

	}
	
	@Test
	public void secondTest() throws InterruptedException
	{
	

		Loginobjects login = new Loginobjects(startTest());
		login.launchurl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		login.loginDetails("pranjali@123.com", "123456789");
		Thread.sleep(5000);

	}
	@Test
	public void thirdTest() throws InterruptedException
	{
	

		Loginobjects login = new Loginobjects(startTest());
		login.launchurl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		login.loginDetails("mounika@123.com", "0000000000");
		Thread.sleep(5000);

	}
	
	
	
	
}
