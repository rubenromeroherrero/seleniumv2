package v6_deteccionCambiosNavegador;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class testv24_ejecutarJavascriptEnSelenium {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\webrivers\\chromedriver.exe");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--window-position=500,50");
        chromeOptions.addArguments("--window-size=1000,900");

        WebDriver webDriver = new ChromeDriver(chromeOptions);
        webDriver.get("http://localhost:9080");

        // 1-Clase que nos permite inyectar JS dentro del navegador y ejecutar comandos
        // 2-TypeCasting => nos permite crear interfaz dentro de la variable JS
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        // 3-Aquí podemos ejecutar código javascript
        //js.executeScript("alert('hola')");
        //js.executeScript("window.scrollTo(0,200)");
        // Utiliza cómo medida de scroll vertical, el tamaño total del documento
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");


    }
}
