Feature: Search Career
  Scenario Outline: Search for QA Automation role on Career page
    Given I am on the "https://www.optimove.com/careers" Career page with title "Careers at Optimove"
    When I scroll to element "Explore Open Positions"
    And I click on the "Explore Open Positions" button
    Then I should select "UKR" country in dropdown
    And I verify that there is position for "QA Automation Engineer"