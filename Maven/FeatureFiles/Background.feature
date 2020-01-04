@Background
Feature: Studies
Background: Student complete school education
Given finished high school
Given finished higher secondary school

Scenario: Doctor
Given the student apply for the medical course
When the student clear entrance exam
Then the student is eligible joining any medical institute

Scenario: Engineering
Given the student apply for the engineering course
When the student have sayable cut off
Then the student is eligible joining any engineering institute