Feature: user Demoblaze signup and Login
Scenario: verify demoblaze signup successfull when user enter username and pasword
Given launch demoblaze website
When user click on demoblaze signup 
And demoblaze user enter username and password 
And click on signup button,handle popup
Then signup successfull


Scenario: verify demoblaze login successfull when user enter username and pasword
Given launch demoblaze website for login
When user click on demoblaze login 
And demoblaze user enter username and password for login 
And click on login button,handle popup
Then login successfull