
  Feature:Register functionality of ocado.com

    Scenario: ocado registration with valid credential

      Given  I select register button
      When I select tital form drop down namu
      And  I enter valid first name in first name filed
      And I enter valid last name in last name filed
      And I enter valid email addresh in email filed
      And I enter create valid password in create password filed
      And I enter valid post code in post code field
      And I click on registration button
      Then I should see my email as registration conformation