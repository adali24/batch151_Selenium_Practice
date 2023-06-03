package day01_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // "https://teknosa.com/" adresine gidiniz
        driver.get("https://teknosa.com/");

        // Sayfanin Title'ini ve URL'ini aliniz ve yazdiriniz
        System.out.println("Title = "+driver.getTitle());
        System.out.println("URL = "+driver.getCurrentUrl());

        // Title'in "Teknoloji" kelimesini icerip icermedigini kontrol ediniz
        String title =  driver.getTitle();
         if (title.contains("Teknoloji")) {
             System.out.println("Title Test passed ");
         }else System.out.println("Title Test failed");

        // URL'in "teknosa" kelimesini icerip icermedigini kontrol ediniz
        String url = driver.getCurrentUrl();
        if (url.contains("teknosa")){
            System.out.println("URL Test passed");
        }else System.out.println("Url test failed");

        // "https://medunna.com/" adresine gidiniz
        driver.get("https://medunna.com/");

        // Sayfanin Title'ini ve URL'ini aliniz ve yazdiriniz
        System.out.println("Title = "+driver.getTitle());
        System.out.println("URL = "+driver.getCurrentUrl());
        // Title'in "MEDUNNA" kelimesini icerip icermedigini kontrol ediniz.
        String medunnaTitle = driver.getTitle();
        if (medunnaTitle.contains("MEDUNNA")){
            System.out.println("Medunna Test passed");
        }else System.out.println("Medunna test failed");

        // URL'in "medunna" kelimesini icerip icermedigini kontrol ediniz
        String medunnaUrl = driver.getCurrentUrl();
        if (medunnaUrl.contains("medunna")){
            System.out.println("Medunna url passed");
        }else System.out.println("Medunna url failed");

        // teknosa adresine geri donunuz
        driver.navigate().back();

        // Sayfayı yenileyiniz
        driver.navigate().refresh();

        // medunna adresine ilerleyiniz
        driver.navigate().forward();

        // Sayfayı yenileyiniz
        driver.navigate().refresh();

        // pencereyi kapat
        driver.close();
    }
}
