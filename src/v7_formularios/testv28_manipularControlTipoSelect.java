package v7_formularios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class testv28_manipularControlTipoSelect {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\webrivers\\chromedriver.exe");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--window-position=500,50");
        chromeOptions.addArguments("--window-size=1000,900");

        WebDriver webDriver = new ChromeDriver(chromeOptions);
        webDriver.get("http://localhost:9080");

        // 1-Seleccionar el objeto de tipo Select
        Select inputSelectTopic = new Select(webDriver.findElement(By.id("topic-select-menu")));
        // Seleccionamos el texto visible de las opciones que nos da el objeto Select
        inputSelectTopic.selectByVisibleText("Products");
    }
}
