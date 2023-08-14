#author: Kevin
Feature: Registration on Utest.com

  Feature User register
      As a quality analyst I need to register on the uTest.com website

  @RegistroExitoso
  Scenario: Create a new user by completing the form
    Given that you enter the website uTest.com
    Given you click on the registration option (JOIN TODAY)
    Given fill out the registration form with personal data.
    Given click next to complete the location
    Given fill in the device information.
    Given create a strong password
    Given check the boxes for acceptance of terms
    When I click complete setup
    Then a new user is created successfully.