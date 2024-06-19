Feature:Feature to test OrangeHRM login functionality

Scenario:successful Login with Valid Credentials
         Given Browser open
         And user is on OrangeHRM login page
         And user enters username and password 
         Then click login button
				 Then user is navigated to dashboard
         
         
Scenario:successful Logout
         When user Logout from the dashboard
         Then close browser