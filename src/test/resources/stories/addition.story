Meta:

Narrative:
As a user
I want to perform addition
So that I can know sum

Scenario: Show sum of numbers
Given I have searched for <search_query>
When I add the <first_numer> by the <second_number>
Then I get the <sum>

Examples:
|search_query|first_number|second_number|sum|
|calculator|3848484.0|5.5|3848489.5|
|1-1|5875858|1.0|5875859.0|