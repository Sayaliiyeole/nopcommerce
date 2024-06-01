Feature: Test The Catlog TreeView

Scenario: Products Catalog 

   Given User Launch Chrome browser
   When User opens URL "https://admin-demo.nopcommerce.com/login"
   And User Enters Email as "admin@yourstore.com" and Password as "admin"
   And Click on Login
   Then User can view Dashboard
   When User Click on Catalog menu
   And User click on product from catalog list
   And User check the available products  
   
