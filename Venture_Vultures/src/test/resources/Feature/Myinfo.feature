#Feature: Accessingmyinfodeatils
#
  #Scenario Outline: Editing the myinfo data
    #Given User is on the Website homepage
    #When User enters the valid username and password
    #And User clicks the login button
    #And user clicks the Myinfo category
    #And user enters the firstname, lastname, and nickname using sheetname "<sheetname>" and rownumber <rownumber>
    #And And User edit the myinfo details using sheetname "<sheetname>" and rownumber <rownumber>
    #And user enters the select the value of Nationality, Marital Status,and dateofbrith using sheetname "<sheetname>" and rownumber <rownumber>
    #And user clicks the save button
    #And user selects the blood group
    #Then user is able to see the edited details
 #Examples: 
      #| sheetname | rownumber |
      #| sheet1    |         0 |