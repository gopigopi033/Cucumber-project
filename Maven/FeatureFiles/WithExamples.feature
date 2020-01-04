Feature: online for test in example method
Scenario Outline: use example to test online
When step one to enter login page
Given put correct "<username>" and "<password>"
Then finally click login button

Examples:
|username|password|
|sylix|admin|
|admin|sylix|


