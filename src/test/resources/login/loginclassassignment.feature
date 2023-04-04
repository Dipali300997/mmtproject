Feature: Test Guru99
1)Valid
2)Vnvalid
Background:
Given open broeser and navigate to login page
@PositiveTesting
Scenario: testing Guru99 functionality with valid data
When Enter username "user"
And Enter password "user"
And Click on login
Then Redirect in homepage of Guru99
@NegativeTesting
Scenario: testing Guru99 functionality with invalid data
When Enter Username "admin"
And Enter password "admiuhcsguy"
And Click on login
Then Redirect in homepage of Guru99