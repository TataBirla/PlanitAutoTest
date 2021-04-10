package com.driver;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import com.runner.BaseClass;

public class Actions extends BaseClass {
	
	public void clickOnElement(By elementName) {
		driver.findElement(elementName).click();
	}

	public void theFieldHasValidation(String id) {
		driver.findElement(By.xpath(getValidationXpath(id)));
		wait.presenceOfElementLocated(By.xpath(getValidationXpath(id)), 30);
	}

	public static String getValidationXpath(String id) {
		String s1 = "//*[@id='" + id + "']//following-sibling::span";
		String s2 = "//*[@id='" + id + "']//following-sibling::span[1]";
		return s1 + "|" + s2;
	}

	public void updateElement(By elementName, String keyword) {
		driver.findElement(elementName).clear();
		driver.findElement(elementName).sendKeys(keyword);
	}

	protected void elementIsNotPresent(String xpath) {
		// set the time out to 0, so we don't wait for it to appear in the DOM
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.MILLISECONDS);

		By by = By.xpath(xpath);
		// find all matches in the DOM (should be 0)
		driver.findElements(by);
	}

	public void theFieldHasNoValidation(String id) {
		elementIsNotPresent(getValidationXpath(id));
	}
	
	

}
