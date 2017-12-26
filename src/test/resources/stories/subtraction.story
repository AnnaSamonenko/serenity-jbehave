Meta:

Narrative:
As a user
I want to perform a subtraction
So that I can know difference

Scenario: Show difference between numbers
Given I have searched for <search_query>
When I deduct the <first_number> by the <second_number>
Then I get the difference

Examples:
|search_query|first_number|second_number|
|calculator|18.0|5.0|
|1-1|10.0|11.0|