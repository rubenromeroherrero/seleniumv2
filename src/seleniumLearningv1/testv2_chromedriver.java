package seleniumLearningv1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testv2_chromedriver {
    public static void main (String[] args){
        //Enlazar nuestra aplicación con un navegador web
        //Enlazar el webdriver con nuestro archivo ejecutable para controlar nuestro navegador
        //System.setProperty("webdriver.chrome.driver", "C:\\webrivers\\chromedriver.exe");

        //Creamos variable de tipo WebDriver para conectar con el navegador firefox
        WebDriver driver = new ChromeDriver();

        driver.get("https://es.wikipedia.org/wiki/Wikipedia:Portada");
    }
}
