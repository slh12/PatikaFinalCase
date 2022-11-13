package Pages;

import Utilities.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.awt.*;

public class LoginPage {

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);


    }

    @FindBy (linkText ="Giriş Yap")
    public WebElement girisYapMenuLink;

    @FindBy (xpath ="//div[@id='myAccount']")
    public  WebElement myAccountButton;

    @FindBy (xpath = "//input[@name='username']")
    public WebElement emailBox;

    @FindBy (xpath = "//input[@type='password']")
    public WebElement sifreBox;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement  girisYapButton;



    @FindBy (xpath = "//span[@class='sf-OldMyAccount-sS_G2sunmDtZl9Tld5PR']")
    public WebElement kullanıcıIsmi;


    public void loginSayfasınaGit(WebDriver driver) throws InterruptedException, AWTException {

        Actions actions2=new Actions(driver);

        actions2.moveToElement(myAccountButton).perform();
        Thread.sleep(1000);

       actions2.moveToElement(girisYapMenuLink).perform();
       actions2.click(girisYapMenuLink).perform();


    }

    public void girisYap() throws InterruptedException {

        emailBox.sendKeys(ConfigReader.getProperty("email"));
        Thread.sleep(1000);
        girisYapButton.click();


        sifreBox.sendKeys(ConfigReader.getProperty("sifre"));
        Thread.sleep(1000);
        girisYapButton.click();




    }

    public void loginDogrula(){
        //Aşağıda giriş yaptığı doğrulanıyor.
        Assert.assertTrue((kullanıcıIsmi.getText()).equals("Patika Test"));


    }

}


