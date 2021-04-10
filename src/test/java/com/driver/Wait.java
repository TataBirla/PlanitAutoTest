package com.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.runner.BaseClass;

public class Wait extends BaseClass {

	public void presenceOfElementLocated(By elementName, int time) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.presenceOfElementLocated(elementName));
	}

	public void elementToBeClickable(By elementName, int time) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.elementToBeClickable(elementName));
	}

	public void elementToBeVisible(By elementName, int time) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(elementName));
	}

}
