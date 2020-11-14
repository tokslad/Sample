@Before
Feature: Test 2
  As a user of Dot Fiddle I want to play around
  with the website to confirm I can do following below

  @test
  Scenario:
    Given I navigate to "https://dotnetfiddle.net/"
    When I click on getting started
    And I click on back editor
    Then I should see "Hello World" is displayed in the landing page output