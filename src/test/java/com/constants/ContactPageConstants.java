package com.constants;

import org.openqa.selenium.By;

public interface ContactPageConstants {
	
	String verifyContactPage = "https://jupiter.cloud.planittesting.com/#/contact";
	By submitButton = By.xpath("//a[normalize-space()='Submit']");
	By foreNameTextBox = By.xpath("//*[@id='forename']");
	By emailTextBox = By.cssSelector("#email");
	By messageTextBox = By.cssSelector("#message");

}
