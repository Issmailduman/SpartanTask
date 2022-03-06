Feature:Testing Spartans Web Application
@wip @db
  Scenario: Connecting Web Data and Getting all the names
    Given user is on the Spartan Home Page
    When user clicks on any random Spartan and view the Data
    Then spartan info should be same with DB