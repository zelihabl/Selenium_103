package day01_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_NavigateMethod {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
            //Amazon sayfasına gidelim
            driver.navigate().to("https://amazon.com");
            //techproeducation sayfasına gidelim
            Thread.sleep(3000);
            driver.navigate().to("https://techproeducation.com");
            //Tekrar amazon sayfasına dönelim
            Thread.sleep(3000);
            driver.navigate().back(); // Amazon sayfasına geri döner
            //Tekrar techproeducation sayfasına gidelim
            Thread.sleep(3000);
            driver.navigate().forward(); // Techproya gider
            //Son sayfada sayfayı yenileyelim(refresh)
            Thread.sleep(3000);
            driver.navigate().refresh();
            //Ve sayfayı kapatalım
            driver.close();
        }
    }