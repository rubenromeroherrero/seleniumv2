package v5_seleccionElementosSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class testv15_eventosClick {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\webrivers\\chromedriver.exe");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--window-position=500,50");
        chromeOptions.addArguments("--window-size=1000,900");

        WebDriver webDriver = new ChromeDriver(chromeOptions);
        webDriver.get("http://localhost:9080");

        WebElement buttonClick = webDriver.findElement(By.id("clear_bottom"));

        // 1- Evento CLICK
        buttonClick.click();

        // Leer el mensaje de pop-up de alerta
        // switchTo => cambiamos de foco del botón al mensaje de alerta
        Alert alert = webDriver.switchTo().alert();
        System.out.println(alert.getText());
    }
}
