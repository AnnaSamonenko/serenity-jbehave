Meta:

Narrative:
As a user
I want to perform division by zero
So that I can get infinity

Scenario: Show the right result during division by zero
Given I have searched for <search_query>
When I devide the <first_number> by zero
Then I get <infinity>

Examples:
|search_query|first_number|infinity|
|calculator|18.0|Infinity|
|1-1|10.0|Infinity|