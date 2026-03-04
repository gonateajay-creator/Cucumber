Feature: Fb login
@regression
Scenario:
verify login failed when user enter invalid credential
Given Chrome Browser should be invoked
And fb login page should be visible
When Enter Username "fctuser@gmail.com" and Password "fortune123"
And click on fb login button
Then login should be failed when user enter invalid credential
 
