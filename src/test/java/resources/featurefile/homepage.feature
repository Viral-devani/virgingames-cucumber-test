Feature:  Virgingames homepage test
  As a user I want to test home page
@Smoke
  Scenario:  User should be able to access 'free Games page'
       Given User is on the homepage
       When  User click on free Games tab
       Then  User should navigate to free Games page successfully
       And   User can see "Virgin Games Daily Free Games" text on the page


