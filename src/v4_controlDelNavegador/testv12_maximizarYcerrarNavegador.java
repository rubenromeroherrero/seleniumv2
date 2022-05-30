package v4_controlDelNavegador;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class testv12_maximizarYcerrarNavegador {
    public static void main(String[] args) {

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--window-position=500,50");
        chromeOptions.addArguments("--window-size=1000,900");

        WebDriver webDriver = new ChromeDriver(chromeOptions);
        webDriver.get("https://www.wikipedia.org");

        // 1- Pantalla completa
        webDriver.manage().window().fullscreen();

        // 2- Cerrar navegador => indicación al navegador que se cierre
        webDriver.close();

    }
}
