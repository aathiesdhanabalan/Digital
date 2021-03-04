@LoginFeature

  Feature: Login

    Background:
      User navigate to the BliBli tab

      @Test1 @Positive
      Scenario: Verify user able to login the page
        Given User on BliBli page
        When User enters username as "arpitha.riya@mailinator.com"
        And User enter password as "Blibli@123456"
        Then User verify the email
        Then User enter in the login page



    @Test2 @Positive
      Scenario: Verify tag in Orderdetailpage
        Given User enters username as "arpitha.riya@mailinator.com"
        And User enter password as "Blibli@123456"
       When User enters in the Orderdetailpage
       And User clicks Dibatalkan tag
       Then the first product is same as Dibatalkan tag




