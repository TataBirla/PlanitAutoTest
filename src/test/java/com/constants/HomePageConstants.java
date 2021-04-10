package com.constants;

import org.openqa.selenium.By;

public interface HomePageConstants {

	String baseURL = "http://jupiter.cloud.planittesting.com";
	String verifyHomePageUrl = "https://jupiter.cloud.planittesting.com/#/";
	By contactLink = By.xpath("//a[normalize-space()='Contact']");
	By shopLink = By.xpath("//*[@id='nav-shop']/a");
	String verifyShopPage = "https://jupiter.cloud.planittesting.com/#/shop";

}
