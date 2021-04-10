package com.runner;

import org.openqa.selenium.WebDriver;

import com.driver.Actions;
import com.driver.Get;
import com.driver.Wait;
import com.pages.ContactPage;
import com.pages.HomePage;
import com.pages.ShopPage;


public class BaseClass {

	public static WebDriver driver;
	public static HomePage homePage = new HomePage();
	public static ContactPage contactPage = new ContactPage();
	public static ShopPage shopPage = new ShopPage();
	public static Actions actions = new Actions();
	public static Wait wait = new Wait();
	public static Get get = new Get();
	
}
