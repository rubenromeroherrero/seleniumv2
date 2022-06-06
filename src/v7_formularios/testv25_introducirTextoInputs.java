package v7_formularios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class testv25_introducirTextoInputs {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\webrivers\\chromedriver.exe");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--window-position=500,50");
        chromeOptions.addArguments("--window-size=1000,900");

        WebDriver webDriver = new ChromeDriver(chromeOptions);
        webDriver.get("http://localhost:9080");

        // 1-Seleccionar inputs e inyectar texto
        webDriver.findElement( By.name("name")).sendKeys("Carlos");
        webDriver.findElement( By.name("email")).sendKeys("carlos@pruebas.com");
        webDriver.findElement( By.name("message")).sendKeys("Estamos preparando pruebas");

    }
}
