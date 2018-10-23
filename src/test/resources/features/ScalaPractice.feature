#Author: Redwan Hossain
@ScalaPractice
Feature: I Want to test Scala website

  Background: 
    Given I launch the Scala home page url

  Scenario Outline: Selecting few links
    When I select "<Link_text>" in the Scala
    Then I verified the selected Scala page by the existence of the "<linkedPage_text>" text

    Examples: 
      | Link_text | linkedPage_text                               |
      | INDUSTRY  | How Scala Digital Signage Is Used in Industry |
      | PROJECTS  | Every marketing situation is unique.          |
      | PLATFORM  | Display dynamic, targeted messages            |

  Scenario: Solutions Link test
    When I click on the Solutions link
    Then I see the Solutions page

  Scenario: Innovations Link test
    When I click on the Innovations link
    Then I see the Innovations page
