Feature: validate the Forgot Password functionality

  Background: 
    Given user is on login page
    When user clicks on forgot password link of login page
    Then forgot password page is opened

  #Test-001
  Scenario: validate browser back button on forgot password page
    Given user clicks on browser back button of browser
    Then user navigated to login page

  #Test-003
  Scenario: Validate if user enters unauthorized email and clicks on Get Password Reset Link button
            error message should be displayed

    Given user enters unauthorized "ledeyi1355@adroh.com" email ID
    And user clicks on Get Password Reset Link button
    Then error message should be displayed correctly for unauthorized email

  #Test-003
  Scenario: Validate if user enters invalid email and clicks on Get Password Reset Link button
            error message should be displayed

    Given user enters invalid "ledeyi1355@adroh.c" email ID
    And user clicks on Get Password Reset Link button
    Then error message should be displayed correctly for invalid email

  #Test-004
  Scenario: Validate if user does not enter any email and clicks on Get Password Reset Link button
             error message should be displayed

    Given user does not enter any "" email ID
    And user clicks on Get Password Reset Link button
    Then error message should be displayed correctly for empty email field

  #Test-005
  Scenario: Verify confirmation message and resend button appears after
            entering valid mail and clicking on Get Password Reset link button

    Given user enters a valid and authorized "akash@memorres.com" email ID
    And user clicks on Get Password Reset Link button
    Then confirmation message displayed correctly
    And Resend Password Link button is visible on forgot password page

  #Test-006
  Scenario: Validate confirmation message when user enters the valid email ID and click on Resend button
            of forget password page

    Given user enters a valid and authorized "akash@memorres.com" email ID
    And user clicks on Get Password Reset Link button
    Then confirmation message displayed correctly
    And Resend Password Link button is visible on forgot password page
    When user clicks on Resend Password Link button
    Then confirmation message displayed correctly

  #Test-007
  Scenario: Validate after clicking on back button of forgot password page, user navigated to login page
    Given user clicks on back button of forgot password page
    Then user navigated to login page

  #Test-008
  Scenario: Validate page title and url of forgot password page
    When forgot password page is opened
    Then Validate page title and url of forgot password page
   
    #Test-009
   Scenario: Validate placeholder text, headings and text on buttons of forgot password page
    When forgot password page is opened
    Then Validate placeholder text, headings and text on buttons of forgot password page
    
  
    
    
    
    
