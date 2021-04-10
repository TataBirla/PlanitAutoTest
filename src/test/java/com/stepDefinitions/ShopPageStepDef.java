package com.stepDefinitions;

import java.util.List;
import com.runner.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ShopPageStepDef extends BaseClass {

	@Given("^I am on the shop page$")
	public void iAmOnTheShopPage() throws Throwable {
		homePage.clickOnShopPage();
	}

	@When("^I click buy button on the items$")
	public void iClickBuyButtonOnTheItems(List<String> items) throws Throwable {
		for (String item : items) {
			shopPage.clickOnBuyButton(item);
		}
	}

	@When("^I click on Cart$")
	public void iClickOnCart() throws Throwable {
		shopPage.clickOnCart();
	}

	@Then("^I should be able to verify the items in the cart$")
	public void iShouldBeAbleToVerifyTheItemsInTheCart(List<String> item) throws Throwable {
		for (String items : item) {
			shopPage.verifyItemsInCart(items);
		}
	}

}
