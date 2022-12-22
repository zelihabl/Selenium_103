package day02_DriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Examples {
    static WebDriver driver;
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();


        // 1) İlk önce browser'ı maximize yapalım sonra
        driver.manage().window().maximize();

        // 2)tüm sayfa icin maxiumum  bekleme süresi icin 15 sn belirtelim.
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //3)Sırasıyla amazon,facebook ve youtube sayfalarına gidelim.
        driver.get("https://www.amazon.com");
        driver.get("https://www.facebook.com");
        driver.get("https://www.youtube.com");

       //4)Amazon sayfasına tekrar dönelim.
        driver.navigate().back();
        driver.navigate().back();

       //5)Amazon sayfasının Url'nin https://www.amazon.com adresine esit olduğunu test edelim
        String actualUrl=driver.getCurrentUrl();
        String expectedUrl="https://www.amazon.com";
        if (actualUrl.equals(expectedUrl)){
            System.out.println("Url Testi PASSED");
        }else System.out.println("Url testi FAILED");

       //6)Sayfanın konumunu ve szie'nı yazdıralım
        System.out.println("Sayfanın size'ı:" +driver.manage().window().getSize());
        System.out.println("Sayfanın Konumu:" + driver.manage().window().getPosition());
        //7)Sayfanın konumunu ve size'nı istediğimiz sekilde ayarlayalım
        driver.manage().window().setSize(new Dimension(600,600));
        driver.manage().window().setPosition(new Point(50,50));
        System.out.println("Sayfanın yeni size'ı:" +driver.manage().window().getSize());
        System.out.println("Sayfanın yeni Konumu:" + driver.manage().window().getPosition());

        // ve istediğimiz sekilde olduğunu test edelim
       Dimension actualYeniSize=driver.manage().window().getSize();
       if (actualYeniSize.getWidth()==600 && actualYeniSize.getHeight()==600){
           System.out.println("Size TESTİ PASSET");
       }else System.out.println("Size TESTİ FAILED");

       Point actualYeniKonum=driver.manage().window().getPosition();
       if (actualYeniKonum.getX()==50 && actualYeniKonum.getY()==50){
           System.out.println("Konum testi PASSED");
       }else System.out.println("Konum testi FAILED");

      // 8)sayfayı kapatalım
        driver.close();





    }
}
