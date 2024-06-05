Feature: Test the login functionality

  Scenario: To login with valid username and valid password
    Given User open the website and go to login page
    When User fill username and password in login page and click on login button
    Then User should navigate to home page

  Scenario: To login with valid username and invalid password
    Given User open the website and go to login page
    When User fill username as "admin" and invalid "password" in login page and click on login button
    Then Show an error message of password to user and stay in login page

  Scenario: To login with invalid username and valid password
    Given User open the website and go to login page
    When User fill username without @ and password in login page and click on login button
    | ahmed | P@$$w0rd |
    | ali | Adm1n |
    Then Show error message of to be write correctly email

 Scenario Outline: To login with invalid username and invalid password
    Given User open the website and go to login page
    When User fill invalid username as "<username>" and invalid "<password>" in login page and click on login button
    Then Show error message of to be write correctly email and password

   Examples:
     |  username  |  password  |
     |  admin     |  P@$$w0rd  |
     |  user      |  user1234  |
