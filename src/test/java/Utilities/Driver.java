package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Driver {

    private Driver(){}

    static WebDriver driver;

    public static WebDriver getDriver(){

        WebDriverManager.chromedriver().setup();


        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("ignore-certificate-errors");
        options.addArguments("allow-insecure-localhost");
        options.addArguments("acceptInsecureCerts");
        options.addArguments("--disable-blink-features=AutomationControlled");
        options.addArguments("--disable-extensions");

        driver=new ChromeDriver(options);
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
       // HepsiburadaPage.cookieKapat();

       return driver;


    }

    public static void closeDriver(){

        driver.close();
    }
}
