 Feature:Gmail Login
@smoke
Scenario: Login Test Scenario: verify login successfull when user enter valid gmail and password
 Given user should create the account on gmail
 When launch gmail website
 And enter email and password
 And click on login button
 Then login should be successfull
 