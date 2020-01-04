Feature: To test google search
Scenario: Google search scenario
    Given user is entering google.co.in
    When user is the search term is "Gopinath"
    And enter the return key
    Then the user should see the search result