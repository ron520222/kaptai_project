@fbsignuphappypath
Feature: Facebook sign up

In order to verify search
as a user
i want to Facebook sign up

Scenario Outline:
Given person visiting facebook url
When person enter "<firstname>" and"<lastname>" and valid "<email>" and "<confirm_email>" and "<password>"
Then person select dropdown Month and dropdown Day and dropdown Year
Then person select male and clicks on sign up to create an account
Examples:
|firstname|lastname|email|confirm_email|password|
|Ron|Tal|esdy@gmail.com|esdy@gmail.com|class@2020|