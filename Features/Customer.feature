Feature: Customer

Scenario: Add new Customer
   Given User Launch Chrome browser
   When User opens URL "https://admin-demo.nopcommerce.com/login"
   And User Enters Email as "admin@yourstore.com" and Password as "admin"
   And Click on Login
   Then User can view Dashboard
   When User click on customer Menu
   And click on customer menu Item
   And click on add new button
   Then User can view add new customer page
   When User enter customer infor
   And click save button
   Then User can view confirmation message ""
  