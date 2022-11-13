
# PatikaFinalCase
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------  
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
 
 Raporlama işlemleri daha sonra eklenecektir.
