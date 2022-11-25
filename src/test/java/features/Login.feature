Feature: validate the login functionality

  #Test-001
  Scenario Outline: User logins into the application with valid credentials
    Given user is on login page
    When user enters valid username <username> and password <password>
    And clicks on login button
    Then user logged in sucessfully

    Examples: 
      | username           | password  |
      | akash@memorres.com | Ak@sh1234 |

  #Test-002
  Scenario Outline: User should not be able to login into the application with invalid credentials
    Given user is on login page
    When user enters invalid username <username> and password <password>
    And clicks on login button
    Then user not able to login

    Examples: 
      | username            | password           |
      | akash@memorres.com  | Ak@sh123           |
      | akash@memorres.com  | akash@memorres.com |
      | akash@@memorres.com | Ak@sh1234          |
      | akash329**&$%       | akash123           |
      | akash@@abc.com      | Ak@sh1234          |
      | akash@memorres      | y4<Ep3>T           |

  #Test-003
  Scenario: User should not be able to login into the application without any credentials
    Given user is on login page
    When user does not enter any username "" and password ""
    And clicks on login button
    Then user not able to login

  #Test-004
  Scenario: User should not be able to login into the application with only username
    Given user is on login page
    When user enters only username "akash@memorres.com" and does not enter any password ""
    And clicks on login button
    Then user not able to login

  #Test-005
  Scenario: User should not be able to login into the application with only password
    Given user is on login page
    When user does not enter any username "" and enters only password "Ak@sh1234"
    And clicks on login button
    Then user not able to login

  #Test-006
  Scenario: verify if error messages are shown when user try login without any credentials
    Given user is on login page
    When user does not enter any username "" and password ""
    And clicks on login button
    Then error messages are displyed for email and password fields

  #Test-007
  Scenario: Verify error message for invalid username
    Given user is on login page
    When user enters invalid username "akash@memorres"
    And clicks on login button
    Then error message is displayed for email field

  #Test-008
  Scenario Outline: Verify error message for invalid username and invalid password
    Given user is on login page
    When user enters invalid username <username> and password <password>
    And clicks on login button
    Then error message is shown for invalid credentials

    Examples: 
      | username             | password |
      | ledeyi1355@adroh.com | Ak@sh123 |

  #Test-009
  #Scenario: Validate if user gets blocked after three unsucessful login attempts and error message is displayed
  #Given user is on login page
  #When user enters valid username "akash@memorres.com" and invalid password "Ak@sh12345"
  #And clicks on login button for four times
  #Then user gets blocked and error message is correctly shown for blocked user
  #Test-010
  
  Scenario: Validate placeholder text on email and password text fields
    Given user is on login page
    Then verify placeholder texts are visible coorectly on email and password text fields

  #Test-011
  Scenario: Validate if forgot password link is available and working properly on login page
    Given user is on login page
    And check if forgot password link is available
    When user clicks on forgot password link
    Then user redirected to forgot password page

  #Test-012
  Scenario: Validate the page title and Url of the login page
    Given user is on login page
    Then verify if url and page title are visible correctly on login page

  #Test-013
  Scenario: Validate all headings and text of button on login page
    Given user is on login page
    Then verify if headings and text of login button on login page are visible properly
