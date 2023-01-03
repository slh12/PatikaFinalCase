
#PatikaFinalCase  ENGLISH

I am sharing Test Case of the project below:

Topic: Adding product to basket on popular Turkish marketplace Hepsiburada.com

1)Adding product by making user login
-User visits Hepsiburada.com
-User is doing login processes.
-After redirecting, it will be verified that user login has been done.
-User will search the product which he wants to buy.
-User will select a product from the product list on the page.
-Selected product will be added to basket from 2 DIFFERENT SELLERS.
-On "my Basket"(in Turkish: "Sepetim") page, it will be verified that selected product is added correctly.


2)Adding product to basket without doing login
-User visits Hepsiburada.com
-User will search the product which he wants to buy.
-User will select a product from the product list on the page.
-Selected product will be added to basket from 2 DIFFERENT SELLERS.
-On "my Basket"(in Turkish: "Sepetim") page, it will be verified that selected product is added correctly.

In this project, Java,TestNG and Page Object Model have been used.

Our tests are located in "HepsiburadaTest" class.

As you see on Test Cases above, tests have been done both with login and without login.

Test with login is coded under the "loginliTest()" method at "HepsiburadaTest" class. Test without login is coded under the "loginsizTest()" method under "Hepsiburada" class. You can see small explanation as comments above the methods.

If you face some problems about login test because of email or password issues, you can change test data on configuration.properties file.

Webelements in related pages and methods which we used in tests are located in "Pages" package.

Test datas are located at configuration.properties file, codes about webdriver are located at the Driver class which is located under the "utilities" package.




----------------------------------------------------------------------------------------------------------------------------------------------------------------------# #PatikaFinalCase TURKISH

Projenin Test Case'ini aşağıda paylaşıyorum:


Konu: Hepsiburada.com üzerinden sepete ürün eklenmesi

1. Kullanıcı girişi yapılarak sepete ürün eklenmesi
Kullanıcı Hepsiburada.com sitesini ziyaret eder.
Kullanıcı giriş işlemi yapılır.
Yönlendirmeden sonra anasayfada kullanıcı giriş işleminin yapıldığı doğrulanır
Kullanıcı, burada satın almak istediği ürün için arama yapacaktır.
Kullanıcı, Arama sonucunda ekrana gelen ürün listesinden (veya tek bir sonuç da dönmüş olabilir) ürün seçer.
Seçilen ürün için 2 tane farklı satıcıdan ürün seçilip sepete eklenir.
Seçilen ürünün doğru olarak eklendiği ‘Sepetim’ sayfasında doğrulanmalıdır.

2. Kullanıcı girişi yapılmadan belirtilen ürünü sepete ekleme
Kullanıcı Hepsiburada.com sitesini ziyaret eder.
Kullanıcı, Arama sonucunda ekrana gelen ürün listesinden (veya tek bir sonuç da dönmüş olabilir) ürün seçer.
Seçilen ürün için 2 tane farklı satıcıdan ürün seçilip sepete eklenir.
Seçilen ürünün doğru olarak eklendiği ‘Sepetim’ sayfasında doğrulanmalıdır.
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------

 Projede Java, Selenium, TestNG ve Page Object Model kullanılmıştır. 
 
 Testlerimiz "HepsiburadaTest" class'ında yer almaktadır. 
 
 Yukarıdaki Test case'de görüleceği gibi hem kullanıcı girişli hem de kullanıcı girişi olmadan test yapılmıştır.
 
 Her iki test "HepsiburadaTest" class'ında,  "loginliTest()" ve "loginsizTest()" şeklinde iki farklı metod ile ifade edilmiştir. Çalıştırmak istediğiniz teste
 göre seçim yapabilirsiniz.
 
 Eğer login testinde mail adresinden kaynaklı bir sıkıntı olursa "configuration.properties" dosyasından kendi belirlediğimiz başka email adresleriyle 
 test tekrarlanabilir.
 
 İlgili sayfalarda yer alan Webelement'ler ve testlerimizde kullandığımız test metodları Pages klasöründe yer almaktadır.
 
 Test dataları configuration.properties dosyasında driver ile ilgili kodlar ise utilities klasörü altındaki "Driver" class'ında yer almaktadır.
 

