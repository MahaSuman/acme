package testcases;

import org.testng.annotations.Test;

import pages.acmeloginpage;
import seleniumbase.ProjectSpecificMethods;

public class testcase extends ProjectSpecificMethods{

	@Test
	public void runlogin()
	{
		new acmeloginpage().enterusername().enterpassword().clicklogin();
	}

}
