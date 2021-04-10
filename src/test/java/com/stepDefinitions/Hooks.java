package com.stepDefinitions;

import org.openqa.selenium.chrome.ChromeDriver;
import com.constants.HomePageConstants;
import com.runner.BaseClass;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass {

	@Before
	public void initializedriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sheri\\eclipse-workspace\\PlanitAutoTest\\src\\test\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(HomePageConstants.baseURL);
		driver.manage().window().maximize();
	}

	@After
	public void destroy() {
		driver.close();
	}

}
