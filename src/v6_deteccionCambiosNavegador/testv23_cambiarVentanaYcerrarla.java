package v6_deteccionCambiosNavegador;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class testv23_cambiarVentanaYcerrarla {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\webrivers\\chromedriver.exe");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--window-position=500,50");
        chromeOptions.addArguments("--window-size=1000,900");

        WebDriver webDriver = new ChromeDriver(chromeOptions);
        webDriver.get("http://localhost:9080");

        WebElement enlace = webDriver.findElement( By.xpath("//*[@id=\"home\"]/app-nav/nav/div/ul/li[6]/a"));
        enlace.click();

        // 1-Controlar la nueva ventana a través de un arrayList
        System.out.println(webDriver.getCurrentUrl());
        ArrayList ventanas = new ArrayList( webDriver.getWindowHandles());

        // 2-Nos movemos a la segunda ventana del array
        webDriver.switchTo().window( ventanas.get(1).toString());
        System.out.println(webDriver.getCurrentUrl());
        // 3-Cerramos la ventana nueva a la que nos hemos movido
        webDriver.close();
    }
}
