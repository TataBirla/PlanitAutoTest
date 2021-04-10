Feature: Contact Page

Background:
Given I am on the contact page

Scenario: Contact page validation and button behaviour
When I click on submit button without populating the mandatory fields
Then The mandatory fields have validation messages
|forename|email|message|
And I populate all the mandatory fields 
|Forename|Tester|
|Email|test@yahoo.com|
|Message|Friendly website|
Then The mandatory fields have no validation message
|forename|email|message|


Scenario: Verify the successful submission message
When I populate all the mandatory fields 
|Forename|Tester|
|Email|test@yahoo.com|
|Message|Friendly website|
And I click on submit button on the contact page
Then I should get the successful submission message with forename "Tester"


Scenario: Verify contact page mandatory field with invalid data
When I populate all the mandatory fields with invalid data 
|Forename|""""""""|
|Email|123456|
|Message|&&&&&|
Then The mandatory fields have validation messages
|email|
And The mandatory fields have no validation message
|forename|message|

 