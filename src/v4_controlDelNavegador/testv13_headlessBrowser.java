package v4_controlDelNavegador;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class testv13_headlessBrowser {
    public static void main(String[] args) {

        ChromeOptions chromeOptions = new ChromeOptions();
        // chromeOptions.addArguments("--window-position=500,50");
        // chromeOptions.addArguments("--window-size=1000,900");

        // 1- Ejecutar las tareas sin abrir el navegador
        chromeOptions.addArguments("--headless");

        WebDriver webDriver = new ChromeDriver(chromeOptions);
        webDriver.get("https://www.wikipedia.org");

        // 1- Extraemos el título de la web y lo mostramos por pantalla
        String titulo =  webDriver.getTitle();
        System.out.println(titulo);

    }
}
