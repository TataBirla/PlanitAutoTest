Feature: Shop Page

Scenario: Verify the add to cart functionality
Given I am on the shop page
When I click buy button on the items
|Funny Cow|Fluffy Bunny|
And I click on Cart
Then I should be able to verify the items in the cart
|Funny Cow|Fluffy Bunny|

