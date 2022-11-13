#PatikaFinalCase
 
First, I am sharing Test Case of the project below:

Topic: Adding product to basket on popular Turkish marketplace Hepsiburada.com

 
1.Adding product by making user login
 
-User visits Hepsiburada.com
 
-User is doing login processes.
 
After redirecting, it will be verified that user login has been done.
 
User will search the product which he wants to buy.
 
User will select a product from the product list on the page.
 
Selected product will be added to basket from 2 DIFFERENT SELLERS.
 
On "my Basket"(in Turkish: "Sepetim") page, it will be verified that selected product is added correctly.

 
2. Adding product to basket without doing login
 
-User visits Hepsiburada.com

-User will search the product which he wants to buy.
 
-User will select a product from the product list on the page.
 
-Selected product will be added to basket from 2 DIFFERENT SELLERS.
 
-On "my Basket"(in Turkish: "Sepetim") page, it will be verified that selected product is added correctly.
 
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
 In this project, Java,TestNG and Page Object Model have been used.
 
 Our tests are located in "HepsiburadaTest" class.
 
 As you see on Test Cases above, tests have been done both with login and without login.
 
 Test with login is coded under the "loginliTest()" method at "HepsiburadaTest" class.
 Test without login is coded under the "loginsizTest()" method under "Hepsiburada" class. You can see small explanation as comments above the methods.
 
  If you face some problems about login test because of email address issues, you can change test datas including email and password on 
 configuration.properties file. 
 
 Webelements in related pages and methods which we used in tests are located in "Pages" package.
 
 Test datas are located at configuration.properties file, codes about webdriver are located at the Driver class which is located under the 
 "utilities" package.
 
 Codes about reporting processes will be added later.
