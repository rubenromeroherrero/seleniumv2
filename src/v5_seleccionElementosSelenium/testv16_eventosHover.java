package v5_seleccionElementosSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class testv16_eventosHover {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\webrivers\\chromedriver.exe");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--window-position=500,50");
        chromeOptions.addArguments("--window-size=1000,900");

        WebDriver webDriver = new ChromeDriver(chromeOptions);
        webDriver.get("http://localhost:9080");

        // 1- Evento interacción con el mouse (HOVER)
        WebElement imgHover = webDriver.findElement(By.id("vitamin_a"));

        // La simulación del HOVER a través del paquete ACTIONS para simular acciones del ratón
        Actions accion = new Actions(webDriver);
        // Creamos un puntero del ratón imaginario que movemos a través del navegador
        // BUILD => Tomar la acción y ejecutarla => PERFORM
        accion.moveToElement(imgHover).build().perform();
        Alert alertHover = webDriver.switchTo().alert();
        System.out.println(alertHover.getText());
    }
}
