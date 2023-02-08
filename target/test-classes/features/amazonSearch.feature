@amazon_search
Feature:
  Scenario: TC01 user search an object in amazon

    Given user goes to Amazon page
    When user search for desk
    Then verify results contains desk
    And close the browser

