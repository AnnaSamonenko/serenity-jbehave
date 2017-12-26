Meta:

Narrative:
As a user
I want to perform a multiplication
So that I can know composition

Scenario: Show composition of multiplication
Given I have searched for <search_query>
When I multiply the <first_number> by the <second_number>
Then I get the $composition

Examples:
|search_query|first_number|second_number|composition|
|calculator|18.0|5.0|90.0|
|1-1|10.0|11.0|110|