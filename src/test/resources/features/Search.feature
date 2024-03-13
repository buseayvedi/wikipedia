Feature: Wikipedia Search Functionality Title Verification

  Agile story: As a user, when I am on the wiki search page
  I should be able to search anything and see relevant results

   #TC#: Wikipedia Search Functionality Title Verification
   #   1. User is on Wikipedia home page
   #   2. User types Steve Jobs in the wiki search box
   #   3. User clicks wiki search button
   #   4. User sees Steve Jobs is in the wiki title

  Scenario: Wikipedia Search Functionality Header Verification
    Given user us on Wikipedia home page
    When User types "Steve Jobs" in the wiki search box
    And User clicks wiki search button
    Then User sees "Steve Jobs" is in the wiki title

   #TC#: Wikipedia Search Functionality Header Verification
   #1. User is on Wikipedia home page
   #2. User types Steve Jobs in the wiki search box
   #3. User clicks wiki search button
   #4. User sees Steve Jobs is in the main header
   #Note: Follow POM

  @try2
  Scenario: Main header of the page after search verification
    Given user us on Wikipedia home page
    When User types "Steve Jobs" in the wiki search box
    And User clicks wiki search button
    Then User sees "Steve Robs" is in the main header

     #TC#: Wikipedia Search Functionality Image Header Verification
     #1. User is on Wikipedia home page
     #2. User types Steve Jobs in the wiki search box
     #3. User clicks wiki search button
     #4. User sees Steve Jobs is in the image header
     #Note: Follow POM

  @try
  Scenario: Wikipedia Search Functionality Image Header Verification
    Given user us on Wikipedia home page
    When User types "Steve Jobs" in the wiki search box
    And User clicks wiki search button
    Then User sees "Steve Bobs" is in the image header


  @scenariooutline
  Scenario Outline: Wikipedia Search Functionality with Scenario Outline
    Given user us on Wikipedia home page
    When User types "<searchValue>" in the wiki search box
    And User clicks wiki search button
    Then User sees "<expectedTitle>" is in the wiki title
    Then User sees "<expectedMainHeader>" is in the main header
    Then User sees "<expectedImageHeader>" is in the image header

    @ceos
    Examples: search CEO values we are going to be using in this scenario outlines
      | searchValue     | expectedTitle    | expectedMainHeader | expectedImageHeader |
      | Steve Jobs      | Steve Jobs       | Steve Jobs         | Steve Jobs          |
      | Marry Barra     | Marry Barra      | Marry Barra        | Marry Barra         |
      | Rosalind Brewer | Rosalind Brewer | Rosalind Brewer   | Rosalind Brewer    |
      | Sundar Pichai   | Sundar Pichai    | Sundar Pichai      | Sundar Pichai       |

    @scientists
    Examples: search values we are going to be using in this scenario outlines
      | searchValue     | expectedTitle   | expectedMainHeader | expectedImageHeader |
      | Marie Curie     | Marie Curie     | Marie Curie        | Marie Curie         |
      | Albert Einstein | Albert Einstein | Albert Einstein    | Albert Einstein     |