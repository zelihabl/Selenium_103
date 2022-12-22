package day01_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethods {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();//Bos bir browser actik

        driver.get("https://www.amazon.com");
        System.out.println("Sayfa basligi: " + driver.getTitle());//Amazon.com. Spend less. Smile more.

        System.out.println("Sayfa url" + driver.getCurrentUrl());//Sayfa urlhttps://www.amazon.com/
        // System.out.println(driver.getPageSource()); // kaynak kodlari verir.
        System.out.println(driver.getWindowHandle());//CDwindow-4EB40E8CD4CB79EF659F005972FB6A4C farkli verir
        // herseferinde.Bize o windowa ait hash degerini bir stringe atayip pencereler arasi gecis yapabilirz.
        //  driver.getWindowHandles(); set methoduyla 6 satir kod yazmamiz gerekir dendi.


    }


}

