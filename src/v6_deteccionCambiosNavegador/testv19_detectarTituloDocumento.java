package v6_deteccionCambiosNavegador;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class testv19_detectarTituloDocumento {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\webrivers\\chromedriver.exe");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--window-position=500,50");
        chromeOptions.addArguments("--window-size=1000,900");

        WebDriver webDriver = new ChromeDriver(chromeOptions);
        webDriver.get("http://localhost:9080");

        // 1-Devolver el "title" de la web
        System.out.println(webDriver.getTitle());

        // 2-Cambiamos de url y por tanto de "title"
        webDriver.get("https://www.seleniumhq.org");
        System.out.println(webDriver.getTitle());

    }
}
