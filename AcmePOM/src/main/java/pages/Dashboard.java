package pages;

import seleniumbase.ProjectSpecificMethods;

public class Dashboard extends ProjectSpecificMethods {
	
	public void getpagetitle()
	{
		String title=driver.getTitle();
		System.out.println(title);
	}

}
