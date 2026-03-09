Feature: orangehrm Login
@sanity
 Scenario: successful login when User enters valid username and valid password

 Given User is on OrangeHRM login page
 When User enters valid username and valid password
 And user clicks on login button
 Then Verify login should be successfull
 And User clicks on user profile dropdown  
 And user click on logout 
 Then Orangehrm logout successfull
 