package pages;
import seleniumbase.ProjectSpecificMethods;

public class acmeloginpage extends ProjectSpecificMethods{
	public acmeloginpage enterusername()
	{
		driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com");
		return this;	
	}
	public acmeloginpage enterpassword()
	{
		driver.findElementByName("password").sendKeys("leaf@12");
		return this;

	}
	public Dashboard clicklogin()
	{
		driver.findElementById("buttonLogin").click();
		return new Dashboard();
	}

}
