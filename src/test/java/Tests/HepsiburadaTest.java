package Tests;


import Pages.HepsiburadaPage;
import Pages.LoginPage;
import Utilities.ConfigReader;
import Utilities.Driver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.awt.*;


public class HepsiburadaTest {


    WebDriver driver;
    HepsiburadaPage HB_Page;
    LoginPage login;
    public ExtentReports extent;
    public ExtentTest test;

    @Test(priority=1)
    public void setUp() {




    }
    @Test
    public void loginliTest() throws InterruptedException, AWTException {

        driver = Driver.getDriver();
        driver.get(ConfigReader.getProperty("HB_Url"));
        login=new LoginPage(driver);
        HB_Page = new HepsiburadaPage(driver);

        login.loginSayfasınaGit(driver);
        login.girisYap();
        login.loginDogrula();
        Thread.sleep(3000);
        HB_Page.cookieKapat();
        HB_Page.aramaYap();
        HB_Page.ÜrünSecme(driver);
        HB_Page.ilkSepeteEkleme(driver);
        HB_Page.devamEt();
        HB_Page.ikinciSatıcıEkle(driver);
        HB_Page.sepeteGiT(driver);
        HB_Page.ürünSayısıDogrulama();


    }


    @Test
    public void loginsizTest() throws InterruptedException, AWTException {



        driver = Driver.getDriver();
        driver.get(ConfigReader.getProperty("HB_Url"));
        HB_Page = new HepsiburadaPage(driver);

        HB_Page.cookieKapat();

        Assert.assertTrue((HB_Page.aramaKutusu).isDisplayed());

        HB_Page.aramaYap();
        HB_Page.ÜrünSecme(driver);
        HB_Page.ilkSepeteEkleme(driver);
         HB_Page.devamEt();
         HB_Page.ikinciSatıcıEkle(driver);
                 HB_Page.sepeteGiT(driver);
                 HB_Page.ürünSayısıDogrulama();





    }

    @AfterTest
    public void closeTest() {


        driver.quit();
    }
}










