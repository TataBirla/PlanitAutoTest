package com.pages;

import org.openqa.selenium.By;
import com.constants.ShopPageConstants;
import com.runner.BaseClass;
import org.junit.Assert;

public class ShopPage extends BaseClass {

	public void clickOnBuyButton(String item) {
		String addProductElement = "//*[@class='products ng-scope']//h4[contains(text(), '" + item
				+ "')]//following-sibling::p//a";
		wait.presenceOfElementLocated(By.xpath(addProductElement), 50);
		if (item.equalsIgnoreCase("Funny Cow")) {
			driver.findElement(By.xpath(addProductElement)).click();
			driver.findElement(By.xpath(addProductElement)).click();
		} else {
			driver.findElement(By.xpath(addProductElement)).click();
		}
	}

	public void clickOnCart() {
		actions.clickOnElement(ShopPageConstants.cartLink);
		Assert.assertEquals(ShopPageConstants.verifyCartPage, get.getCurrentURL());
	}

	public void verifyItemsInCart(String items) {
		String cartItemsXPath = "//td[normalize-space()='" + items + "']//following-sibling::td[2]";
		wait.elementToBeVisible(By.xpath(cartItemsXPath), 30);

	}

}
