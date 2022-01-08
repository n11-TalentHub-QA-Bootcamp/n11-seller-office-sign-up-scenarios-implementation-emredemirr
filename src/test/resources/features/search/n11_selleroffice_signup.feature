Feature: n11 selleroffice signup
#https://so.n11.com/


@selleroffice-signup
  Scenario: n11 selleroffice signup
    Given user launch browser and open the signup page
    When user signed in selleroffice with valid credentials
    Then user signed in selleroffice successfully
