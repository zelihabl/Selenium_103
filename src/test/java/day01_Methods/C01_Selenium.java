package day01_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Selenium {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
/*
En temel haliyle otomasyon yapmak icin  classimiza otomasyon icin gerekli olan webdriver in yerini gostermemiz gerekir.
Bunun icin java kutuphanesinden System.setProperty()methodunun icine ilk olarak driver i yazariz.
Ikinci olarak driverin fiziki yolunu kopyaliyoruz.
 */

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.techproeducation.com");

    }
}
