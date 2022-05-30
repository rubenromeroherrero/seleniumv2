package v1_seleniumLearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class testv4_iExplorerdriver {
    public static void main(String[] args) {
        // Instalar navegador Internet Explorer para ejecución
        System.setProperty("webdriver.ie.driver", "C:\\webrivers\\IEDriverServer.exe");

        //Creamos variable de tipo WebDriver para conectar con el navegador firefox
        WebDriver driver = new InternetExplorerDriver();

        driver.get("https://es.wikipedia.org/wiki/Wikipedia:Portada");
    }
}
