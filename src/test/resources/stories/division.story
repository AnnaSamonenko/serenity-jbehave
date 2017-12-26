Meta:

Narrative:
As a user
I want to perform division
So that I can know quotient

Scenario: Show quotient of division
Given I have searched for <search_query>
When I devide the <first_number> by the <second_number>
Then I get the quotient

Examples:
|search_query|first_number|second_number|
|calculator|18.0|5.0|
|1-1|10.0|11.0|