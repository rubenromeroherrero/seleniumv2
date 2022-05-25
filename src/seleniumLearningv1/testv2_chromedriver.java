package seleniumLearningv1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testv2_chromedriver {
    public static void main (String[] args) {

        // Se puede sustituir en run => añadir application => VM options
        // -Dwebdriver.chrome.driver="C:\\webdrivers\\chrome\\chromedriver.exe"
        System.setProperty("webdriver.gecko.driver", "C:\\webrivers\\chromedriver.exe");

        //Variable de tipo driver para conectar con el navegador chrome
        WebDriver driver = new ChromeDriver();

        driver.get("https://as.com");
    }
}
