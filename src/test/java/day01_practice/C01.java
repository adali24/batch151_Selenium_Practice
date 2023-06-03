package day01_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // "https://testpages.herokuapp.com/styled/calculator" adresine gidin
        driver.get("https://testpages.herokuapp.com/styled/calculator");

        // ilk kutucuga 20 giriniz
       WebElement ilkSayi=  driver.findElement(By.xpath("// * [@id='number1']"));
       ilkSayi.sendKeys("20");


        // ikinci kutucuga 30 giriniz
        WebElement ikinciSayi=  driver.findElement(By.xpath("// * [@id='number2']"));
        ikinciSayi.sendKeys("30");


        // calculate'e tıklayınız
        driver.findElement(By.xpath("// * [@id='calculate']")).click();


        // sonucu yazdırınız
        WebElement sonuc =  driver.findElement(By.xpath("// * [@id='answer']"));
        System.out.println("sonuc = "+ sonuc.getText());


        // sayfayi kapatiniz
        driver.close();
    }
}
