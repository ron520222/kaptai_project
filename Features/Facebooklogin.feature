@fbloginhappypath
Feature: Facebook login

Scenario Outline:
Given users visiting facebook url
When users enter valid "<email>" and "<password>"
Then users click on login button to login to the account
Examples:
|email|password|
|esdy@gmail.com|class@2020|