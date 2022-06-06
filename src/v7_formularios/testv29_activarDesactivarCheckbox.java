package v7_formularios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class testv29_activarDesactivarCheckbox {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\webrivers\\chromedriver.exe");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--window-position=500,50");
        chromeOptions.addArguments("--window-size=1000,900");

        WebDriver webDriver = new ChromeDriver(chromeOptions);
        webDriver.get("http://localhost:9080");

        // 1-Seleccionar a través del tipo ID o name
        WebElement checkBox = webDriver.findElement( By.id("conditions"));

        // Si está seleccionado, lo desactivamos con la acción de la barra espaciadora
        if(checkBox.isSelected()){
            checkBox.sendKeys(Keys.SPACE);
        }
    }
}
