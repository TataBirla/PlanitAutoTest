package com.stepDefinitions;

import java.util.List;
import com.runner.BaseClass;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContactPageStepDef extends BaseClass {

	@Given("^I am on the contact page$")
	public void iAmOnTheContactPage() throws Throwable {
		homePage.verifyHomePage();
		homePage.clickOnContact();
		contactPage.verifyContactPage();
	}

	@When("^I click on submit button without populating the mandatory fields$")
	public void iClickOnSubmitButtonWithoutPopulatingTheMandatoryFields() throws Throwable {
		contactPage.clickOnSubmitButton();
	}

	@Then("^The mandatory fields have validation messages$")
	public void theMandatoryFieldsHaveValidationMessages(List<String> id) throws Throwable {
		for (String s : id) {
			actions.theFieldHasValidation(s);
		}
	}

	@Then("^I populate all the mandatory fields$")
	public void iPopulateAllTheMandatoryFields(DataTable userData) throws Throwable {
		contactPage.populateMandatoryFields(userData);
	}

	@Then("^The mandatory fields have no validation message$")
	public void theMandatoryFieldsHaveNoValidationMessage(List<String> id) throws Throwable {
		for (String s : id) {
			actions.theFieldHasNoValidation(s);
		}
	}

	@When("^I click on submit button on the contact page$")
	public void iClickOnSubmitButtonOnTheContactPage() throws Throwable {
		contactPage.clickOnSubmitButton();
	}

	@Then("^I should get the successful submission message with forename \"([^\"]*)\"$")
	public void iShouldGetTheSuccessfulSubmissionMessageWithForename(String forename) throws Throwable {
		contactPage.validateSuccessfulSubmissionMessage(forename);
	}

	@When("^I populate all the mandatory fields with invalid data$")
	public void iPopulateAllTheMandatoryFieldsWithInvalidData(DataTable userInvalidData) throws Throwable {
		contactPage.populateMandatoryFieldsWithInvalidData(userInvalidData);
	}

}
