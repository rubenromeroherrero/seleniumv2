package v5_seleccionElementosSelenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class testv17_detectarTeclas {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\webrivers\\chromedriver.exe");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--window-position=500,50");
        chromeOptions.addArguments("--window-size=1000,900");

        WebDriver webDriver = new ChromeDriver(chromeOptions);
        webDriver.get("http://localhost:9080");

        WebElement document = webDriver.findElement(By.tagName("body"));

        // 1- Control de presión de tecla ENTER => En este caso ejecuta una alerta
        // Método sendKeys, al cual le pasamos como argumento la tecla CONTROL, mediante el módulo Keys
        document.sendKeys(Keys.ENTER);

        // Cambiamos el foco a la alerta
        Alert alert = webDriver.switchTo().alert();
        // Recogemos el valor de la alerta
        System.out.println(alert.getText());
    }
}
