@Twittersignuphappypath
Feature: Twitter sign up

Scenario Outline:
Given users visiting Twitter url and clicks on create account
When users enter "<first_Last_name>" and valid "<phone_number>"
When users select dropdown Month and dropdown Day and dropdown Year
Then users clicks on Next and clicks on sign up to create an account
Examples:
|first_Last_name|phone_number|
|Ron Tal|6177855825|