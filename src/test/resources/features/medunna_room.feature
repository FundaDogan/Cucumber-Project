@MedunnaRoom
Feature: medunna_room_creation

  Background:
    Given user is on "https://medunna.com" page
    When user click on user icon
    And user click on Signin option
    And enter "john_doe" in Username input
    And enter "John.123" in Password input
    And click on Remember Me checkbox
    And click on Sign in button


  Scenario Outline: Create Room

    And click on Items&Titles
    And click on Room Option
    And click on Create a new room button
    And enter "<room_number>"
    And select Suite option from Room Type dropdown
    And click on Status checkbox
    And enter "<price>" in Price input
    And enter "<description>" in description input
    And click on save button
    And click on Created Date
    Then assert that room is created via "<room_number>"
    And close the application

    Examples:
      | room_number | price | description |
      |123          |1000   |Good         |
      |102          |1200   |Cool         |
      |114          |1100   |Perfect      |
      |135          |1000   |Well         |

