Feature: login functionality

  Scenario: validate the successful login process for open mrs
    Given user is open mrs user provides their credentials
    Then user validates title as 'Home' and 'https://demo.openmrs.org/openmrs/referenceapplication/home.page'

  Scenario Outline: negative scenario for open mrs login functionality
    Given user is open mrs login page and user provides invalid credentials username as '<username>' and '<password>'
    Then user validates an error message as 'Invalid username/password. Please try again.'
    Examples: test data for open mrs negative test cases
      | username | password   |
      | test     | persas     |
      |          | sjkfsd     |



