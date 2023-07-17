Feature: Login Page

Background:Open Login Page

Given URL: "https://opensource-demo.orangehrmlive.com/"

Then On search OrangeHRM Login Page should be displayed

Scenario:Validate Login with valid username and valid password

Given username "Admin"

Then username entered successfully

Given password "admin123"

Then password entered successfully

And click Login Button

Then OrangeHRM home page should be displayed

Scenario: Validate Login with Invalid username and valid password

Given username "User"

Then user name entered successfully

Given password "admin123"

Then password entered successfully

And click Login Button

Then Invalid Credentials should be displayed

Scenario: Validate Login with Valid username and Invalid Password

Giver username "Admin"

Then username entered successfully

Given password "admin12345"

Then password entered successfully

And click Login Button

Then Invalid Credentials should be displayed

Scenario:Validate Login with Invalid username and Invalid Password

Given username "user"

Then username entered successfully

Given password "admin12345"

Then password entered successfully

And click Login Button

Then Invalid Credentials should be displayed

Scenario: Validate Login with Empty username and valid password

Given username ""

Then username field should be empty

Given password "admin123"

Then password entered successfully

And click Login Button

Then required message should be displayed below username

Scenario: Validate Login with Valid username and Empty password

Given username "Admin"

Then username entered successfully

Given password ""

Then password field should be empty

And click Login Button

Then required message should be displayed below password field

Scenario: Validate Login with Empty username and Empty password

Given username ""

Then username field should be empty

Given password ""

Then password field should be empty

And click Login Button

Then required message should be displayed below username and password field