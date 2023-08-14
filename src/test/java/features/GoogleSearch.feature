Feature: Google Search

  Scenario Outline: Search for YouTube and verify the YouTube page
    Given I am on the <query> homepage
    When I search for <query1>
    And I click on the <query1> link
    Then I should be redirected to the <query1> page
    Examples:
      | query    | query1    |
      | "Google" | "YouTube" |