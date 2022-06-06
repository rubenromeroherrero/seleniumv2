package v7_formularios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class testv30_enviarDatosFormulario {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\webrivers\\chromedriver.exe");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--window-position=500,50");
        chromeOptions.addArguments("--window-size=1000,900");

        WebDriver webDriver = new ChromeDriver(chromeOptions);
        webDriver.get("http://localhost:9080");

        // Button de tipo submit => sirven para enviar información

        // 1-Seleccionar inputs e inyectar texto
        webDriver.findElement( By.name("name")).sendKeys("Carlos");
        webDriver.findElement( By.name("email")).sendKeys("carlos@pruebas.com");
        webDriver.findElement( By.name("message")).sendKeys("Estamos preparando pruebas");

        // 2-Controlar los radio buttons [id o value]
        webDriver.findElement( By.id("no_newsletter")).click();

        // 3-Seleccionar el objeto de tipo Select
        Select inputSelectTopic = new Select(webDriver.findElement(By.id("topic-select-menu")));
        // Seleccionamos el texto visible de las opciones que nos da el objeto Select
        inputSelectTopic.selectByVisibleText("Products");

        // 4-Seleccionar a través del tipo ID o name
        WebElement checkBox = webDriver.findElement( By.id("conditions"));
        // Si está seleccionado, lo desactivamos con la acción de la barra espaciadora
        if(checkBox.isSelected()){
            checkBox.sendKeys(Keys.SPACE);
        }

        // 5-Button de tipo submit => sirven para enviar información
        webDriver.findElement( By.id("send_bottom")).click();

        // 6-En caso de no tener botón de tipo submit => accedemos al formulario y lo enviamos con el método submit
        //webDriver.findElement( By.id("main_form")).submit();
    }
}
