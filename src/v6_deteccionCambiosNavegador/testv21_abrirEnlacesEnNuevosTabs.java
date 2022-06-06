package v6_deteccionCambiosNavegador;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class testv21_abrirEnlacesEnNuevosTabs {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\webrivers\\chromedriver.exe");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--window-position=500,50");
        chromeOptions.addArguments("--window-size=1000,900");

        WebDriver webDriver = new ChromeDriver(chromeOptions);
        webDriver.get("http://localhost:9080");

        // 1-Generamos una combinación de patrones de teclado [tecla CTROL+ENTER]
        String abrirNuevoTab = Keys.chord( Keys.CONTROL, Keys.RETURN);

        WebElement enlace = webDriver.findElement( By.xpath("//*[@id=\"home\"]/app-nav/nav/div/ul/li[3]/a"));
        // 2-Enviamos la combinación de teclas, cuando tenemos el enlace detectado
        enlace.sendKeys(abrirNuevoTab);

    }
}
