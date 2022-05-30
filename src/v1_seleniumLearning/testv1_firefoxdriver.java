package v1_seleniumLearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testv1_firefoxdriver {
    public static void main (String[] args){
        //Enlazar nuestra aplicación con un navegador web
        //Enlazar el webdriver con nuestro archivo ejecutable para controlar nuestro navegador
        System.setProperty("webdriver.gecko.driver", "C:\\webrivers\\geckodriver.exe");

        //Creamos variable de tipo WebDriver para conectar con el navegador firefox
        WebDriver driver = new FirefoxDriver();

        driver.get("https://es.wikipedia.org/wiki/Wikipedia:Portada");
    }
}
