package com.pages;

import java.util.Map;
import org.junit.Assert;
import org.openqa.selenium.By;
import com.constants.ContactPageConstants;
import com.runner.BaseClass;
import cucumber.api.DataTable;

public class ContactPage extends BaseClass {

	public void verifyContactPage() {
		Assert.assertEquals(ContactPageConstants.verifyContactPage, get.getCurrentURL());
	}

	public void clickOnSubmitButton() {
		wait.elementToBeClickable(ContactPageConstants.submitButton, 30);
		actions.clickOnElement(ContactPageConstants.submitButton);
	}

	public void populateMandatoryFields(DataTable userData) {
		Map<String, String> userDetails = userData.asMap(String.class, String.class);
		String forename = userDetails.get("Forename");
		String email = userDetails.get("Email");
		String message = userDetails.get("Message");
		wait.elementToBeClickable(ContactPageConstants.foreNameTextBox, 30);
		actions.updateElement(ContactPageConstants.foreNameTextBox, forename);
		actions.updateElement(ContactPageConstants.emailTextBox, email);
		actions.updateElement(ContactPageConstants.messageTextBox, message);
	}

	public void validateSuccessfulSubmissionMessage(String forename) {
		wait.elementToBeClickable(By.xpath("//strong[@class='ng-binding'][contains(text(),'Thanks " + forename + "')]"),
				40);
		driver.findElement(By.xpath("//strong[@class='ng-binding'][contains(text(),'Thanks " + forename + "')]"));
	}

	public void populateMandatoryFieldsWithInvalidData(DataTable userInvalidData) {
		Map<String, String> userInvalidDetails = userInvalidData.asMap(String.class, String.class);
		String forenameInvalid = userInvalidDetails.get("Forename");
		String emailInvalid = userInvalidDetails.get("Email");
		String messageInvalid = userInvalidDetails.get("Message");
		wait.elementToBeClickable(ContactPageConstants.foreNameTextBox, 30);
		actions.updateElement(ContactPageConstants.foreNameTextBox, forenameInvalid);
		actions.updateElement(ContactPageConstants.emailTextBox, emailInvalid);
		actions.updateElement(ContactPageConstants.messageTextBox, messageInvalid);
	}

}
