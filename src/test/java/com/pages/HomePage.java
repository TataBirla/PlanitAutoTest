package com.pages;

import com.constants.HomePageConstants;
import com.runner.BaseClass;
import org.junit.Assert;

public class HomePage extends BaseClass {

	public void verifyHomePage() {
		Assert.assertEquals(HomePageConstants.verifyHomePageUrl, get.getCurrentURL());
	}

	public void clickOnContact() {
		actions.clickOnElement(HomePageConstants.contactLink);
	}

	public void clickOnShopPage() {
		actions.clickOnElement(HomePageConstants.shopLink);
		Assert.assertEquals(HomePageConstants.verifyShopPage, get.getCurrentURL());
	}

}
