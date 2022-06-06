package v6_deteccionCambiosNavegador;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class testv20_navegarPorHistorial {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\webrivers\\chromedriver.exe");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--window-position=500,50");
        chromeOptions.addArguments("--window-size=1000,900");

        WebDriver webDriver = new ChromeDriver(chromeOptions);
        webDriver.get("http://localhost:9080");

        // 1-Navegar por el historial (método navigate tenemos acceso a historial)
        webDriver.navigate().to("http://localhost:9080/#history");
        System.out.println(webDriver.getCurrentUrl());

        // 2-Navegamos a un segundo url
        webDriver.navigate().to("http://localhost:9080/#products");
        System.out.println(webDriver.getCurrentUrl());

        // 3-Podemos acceder al historial => volvemos a history
        webDriver.navigate().back();
        System.out.println(webDriver.getCurrentUrl());

    }
}
