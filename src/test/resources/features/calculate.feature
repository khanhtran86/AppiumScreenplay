Feature: Calculator
  Scenario: Show result for addition calculate
    Given The calculator application is opened
    When The user try to make addition between "6" and "9"
    Then The value "15" is display in the result