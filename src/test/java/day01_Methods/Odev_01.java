package day01_Methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Odev_01 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //ÖDEVVVVV
        //Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        //Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("Sayfanın Konumu:" + driver.manage().window().getPosition());//(10,10)
        System.out.println("Sayfanın Boyutları:" + driver.manage().window().getSize());//(1050,660)

        //Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin

        // 1-C driver.manage().window().setPosition(new Point(15,15));
        //     icinde oldugu sayfanin sol alt kosesini bizim yazacagimiz pixel noktasina tasir
        driver.manage().window().setPosition(new Point(16,16));
        // 1-D driver.manage().window().setSize(new Dimension(900,600));
        // icinde oldugu sayfanin sol alt kosesi sabit olarak bizim yazacagimiz olculere getirir
        driver.manage().window().setSize(new Dimension(100,100));

        //Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
        // konumu ve boyutu yeniledikten sonra tekrar yazdirirsak
        System.out.println("yeni pencere olculeri : " + driver.manage().window().getSize()); //  (900, 600)
        System.out.println("yeni pencere konumu : " + driver.manage().window().getPosition()); // (16, 16)



        //Sayfayi kapatin
        driver.close();

    }
}
