package day02_DriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_WebElementsVeLocators {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
             /*
             LOCAL BELİRLEME
       Eger bir webelementi (Web sayfasindaki her bir buton ya da text/yazi) locate (konumunu belirleme)
       etmek istersek once manual olarak web sayfasini acip sayfa uzerinde sag click yapip incele/inspect butonuna tiklariz.
       Karsimiza cikan HTML code'larindan locator'lardan (konum belirleyiciler) unique (essiz) olani seceriz.
       Genellikle id Attribute'u kullanilir. Sectigimiz attribute degerini findElement() method'u icine
       findElement(BY.id("attribute degeri")) seklinde yazariz.
          */

        //SORU 1:
        //Amazon sayfasına gidelim
        driver.get("https://www.amazon.com");

        //Search bölümünü locate edelim
         WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));//yanlış girince NoSuchElementException:
        // WebElement aramaKutusu2= driver.findElement(By.name("field-keywords"));
        //Search bölümünde ipohone aratalım
        aramaKutusu.sendKeys("iphone", Keys.ENTER);

        //Amazon sayfasındaki <input> ve <a> tag'lerinin sayısını yazdırınız
        List<WebElement>inputTags=driver.findElements(By.tagName("input"));
        System.out.println("Input Tag Sayısını:" +inputTags.size());

        List<WebElement>linklerList=driver.findElements(By.tagName("a"));
        System.out.println("Link Sayısı ="+linklerList.size());//link sayısını yazdırdık linkler "a" tag'i içinde olur

        for(WebElement w:linklerList){ //link isimlerini yazdırmak için for-each loop yaptık
            System.out.println(w.getText());
        }


    }
}
