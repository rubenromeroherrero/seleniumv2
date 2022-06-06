package v6_deteccionCambiosNavegador;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class testv18_cambiosURL {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\webrivers\\chromedriver.exe");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--window-position=500,50");
        chromeOptions.addArguments("--window-size=1000,900");

        WebDriver webDriver = new ChromeDriver(chromeOptions);
        webDriver.get("http://localhost:9080");

        // 1- Nos movemos de página a "History"
        WebElement enlace = webDriver.findElement( By.xpath("//*[@id=\"home\"]/app-nav/nav/div/ul/li[2]/a"));
        String rutaInicial = webDriver.getCurrentUrl();
        enlace.click();

        // 2- Capturamos el nuevo enlace de la url
        String rutaNueva = webDriver.getCurrentUrl();
        if (rutaInicial.equals(rutaNueva)){
            System.out.println("Error, no se ha modificado la url");
        } else {
            System.out.println("Navegacion correcta");
        }

        System.out.println(rutaNueva);

    }
}



