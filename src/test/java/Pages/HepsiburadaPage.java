package Pages;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.awt.*;
import java.awt.event.InputEvent;
import java.time.Duration;

public class HepsiburadaPage {

    public ExtentReports extent;
    public ExtentTest test;

WebDriver driver;
    public HepsiburadaPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        extent = new ExtentReports("C:\\Users\\user\\IdeaProjects\\PatikaFinalCase1\\Logs\\Logs.html", true);
        test = extent.startTest("HepsiBurada Test");

    }
/*
    By aramaKutusu=By.cssSelector(".desktopOldAutosuggestTheme-UyU36RyhCTcuRs_sXL9b");
    By cookieAcceptButton=By.cssSelector("#onetrust-accept-btn-handler");

*/
    @FindBy(css=".desktopOldAutosuggestTheme-UyU36RyhCTcuRs_sXL9b")

    public WebElement aramaKutusu;

    @FindBy (css="#onetrust-accept-btn-handler")
    public WebElement cookieAcceptButton;

    //Verilen case'de ürünü iki satıcıdan da sepete eklememiz istenmişti.
    //Sayfadaki ilk ürünün tek satıcısı olduğu için ikinci ürünü seçtim.
    @FindBy (css="#i1 > div > a")
    public WebElement ikinciÜrün;


    @FindBy (id="basket-item-count")
    public WebElement sepetÜrünSayısı;

    @FindBy (css="button#addToCart")
    public WebElement sepetEkleButonu;

    @FindBy (xpath = "(//button[@class='add-to-basket button small'])[1]")
    public WebElement ikinciSatıcıButton;

    @FindBy (xpath=("//button[text()='Sepete git']"))
    public WebElement sepeteGitButton;

    @FindBy (css=" #productDescription")
    public WebElement ürünAcıklaması;
    @FindBy (xpath = "//button[@kind='secondary']")
    public WebElement ürünSepetinizdeYazısı;
    @FindBy(xpath ="//div[@class='basket_headerTop_15H0U']")
    public WebElement sepetimYazısı;

    @FindBy(xpath = "//a[@href='https://checkout.hepsiburada.com/sepetim']")
    public WebElement sepetimButton;




    public void aramaYap(){
        aramaKutusu.sendKeys("Ayakkabı"+ Keys.ENTER);

    }

    public void cookieKapat()
    {
        if ((cookieAcceptButton).isDisplayed())
        cookieAcceptButton.click();
    }
    public void ÜrünSecme(WebDriver driver){
        Actions actions=new Actions(driver);

        actions.moveToElement(ikinciÜrün).perform();
        ikinciÜrün.click();
        String originalWindow=driver.getWindowHandle();
        for (String windowHandle : driver.getWindowHandles()) {
            if(!originalWindow.contentEquals(windowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        if (( ürünAcıklaması).isDisplayed()) {
            Assert.assertTrue(( ürünAcıklaması).isDisplayed());
            test.log(LogStatus.PASS, "Ürün sayfasında ürün seçimi yapıldı.");
        } else {
            Assert.assertTrue(( ürünAcıklaması).isDisplayed());
            test.log(LogStatus.ERROR, "Ürün seçimi yapılamadı");
        }

    }

    public void ilkSepeteEkleme(WebDriver driver) throws InterruptedException {

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));

        wait.until(ExpectedConditions.elementToBeClickable(sepetEkleButonu));
        sepetEkleButonu.click();
        Thread.sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(ürünSepetinizdeYazısı));
       Assert.assertTrue((ürünSepetinizdeYazısı.getText()).equals("Alışverişe devam et"));
        if ((ürünSepetinizdeYazısı.getText()).equals("Alışverişe devam et")) {
            test.log(LogStatus.PASS, "Ürün sepete eklendi.");
        } else {
            test.log(LogStatus.ERROR, "Sepete ekleme başarısız");
        }

    }
    public void devamEt() throws InterruptedException, AWTException {


        Robot robot=new Robot();
        robot.mouseMove(10,250);
        robot.delay(3000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1500);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1500);
        Thread.sleep(3000);
        Assert.assertTrue(( ikinciSatıcıButton).isDisplayed());
        if (( ikinciSatıcıButton).isDisplayed()) {
            test.log(LogStatus.PASS, "Ürün sayfasına tekrar geri dönüldü");
        } else {
            test.log(LogStatus.ERROR, "Ürün sayfasına geri dönülemedi.");
        }
        Assert.assertTrue(( ikinciSatıcıButton).isDisplayed());
        if (( ikinciSatıcıButton).isDisplayed()) {
            test.log(LogStatus.PASS, "Ürün sayfasına tekrar geri dönüldü");
        } else {
            test.log(LogStatus.ERROR, "Ürün sayfasına geri dönülemedi.");
        }
    }

    public void ikinciSatıcıEkle(WebDriver driver) throws InterruptedException, AWTException {


        Thread.sleep(2000);
        //ikinciSatıcıButton.click();
        Thread.sleep(2000);
        Actions actions=new Actions(driver);
        actions.moveToElement(ikinciSatıcıButton).perform();
        actions.click(ikinciSatıcıButton).perform();
        //Assert.assertTrue((ürünSepetinizdeYazısı.getText()).equals("Alışverişe devam et"));
        if ((ürünSepetinizdeYazısı.getText()).equals("Alışverişe devam et")) {
            test.log(LogStatus.PASS, "Ürün sepete eklendi.");
        } else {
            test.log(LogStatus.ERROR, "Sepete ekleme başarısız");
        }
    }

    public void sepeteGiT(WebDriver driver) throws InterruptedException {

       Thread.sleep(3000);
       if (sepeteGitButton.isDisplayed()){
        sepeteGitButton.click();
        Thread.sleep(1000);

        Assert.assertTrue(( sepetimYazısı).isDisplayed());
        if (( sepetimYazısı).isDisplayed()) {
            test.log(LogStatus.PASS, "Ürünler eklendikten sonra sepet ekranı görüntülendi.");
        } else {
            test.log(LogStatus.ERROR, "Sepet ekranına gidilemedi");
        }
    }
    }

    public void ürünSayısıDogrulama() throws InterruptedException {
        Thread.sleep(2000);
      if ((ExpectedConditions.invisibilityOf(sepetimButton)).equals(true)){
            sepetimButton.click();
      }
       else
           if ((ExpectedConditions.invisibilityOf(sepetimButton)).equals(false)){
           System.out.println(sepetÜrünSayısı.toString());
           Assert.assertTrue((sepetÜrünSayısı.getText()).equals("2"));

           if ((sepetÜrünSayısı).equals("(2 ürün)")) {
               test.log(LogStatus.PASS, "Sepetteki ürün sayısı doğrulandı");
           } else {
               test.log(LogStatus.ERROR, "Sepetteki ürün sayısı doğrulanamadı");
           }
       }
    }


    //Burada ise test metodları yer alıyor.


}





