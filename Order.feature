@Order
Feature: Order

@Test2
Scenario: Verify tag in Orderdetailpage
When User enters in the Orderdetailpage
And User clicks Dibatalkan tag
Then the first product is same as Dibatalkan tag
