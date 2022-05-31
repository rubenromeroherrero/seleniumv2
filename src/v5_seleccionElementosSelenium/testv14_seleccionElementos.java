package v5_seleccionElementosSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class testv14_seleccionElementos {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\webrivers\\chromedriver.exe");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--window-position=500,50");
        chromeOptions.addArguments("--window-size=1000,900");

        WebDriver webDriver = new ChromeDriver(chromeOptions);
        webDriver.get("http://localhost:9080");

        // 1- Selección de elementos por ID [elemento único que no se repite F12]
        WebElement titleByID = webDriver.findElement(By.id("headline_history"));

        String titulo = titleByID.getText();
        System.out.println(titulo);

        // 2- Selección de elementos por CLASS [clases reciclables]
        // Tipo de dato que nos devuelve una lista de Webelements que tienen la clase Headline
        List<WebElement> classElements = webDriver.findElements( By.className("headline"));

        for (WebElement elemento: classElements) {
            System.out.println( elemento.getText());
        }

        // 3- Selección de elementos por TAGNAME = nombre de etiqueta
        List<WebElement> tagElements = webDriver.findElements( By.tagName("section"));

        /* for (WebElement elemento: tagElements) {
            System.out.println( elemento.getText());
        }
        */

        // 4- Selección de elemento de propiedad de formulario NAME
        List<WebElement> nameForm = webDriver.findElements( By.name("name"));
        // 4.1- Selección de elemento de propiedad de formulario EMAIL
        List<WebElement> emailForm = webDriver.findElements( By.name("email"));
        for (WebElement elemento: emailForm) {
            // Seleccionamos el valor de la propiedad de una etiqueta "email", el valor de la propiedad/atributo "id"
            System.out.println( elemento.getAttribute("id"));
        }

        // 5- Selección de elemento por Xpath
        List<WebElement> elementByXpath = webDriver.findElements( By.xpath("//*[@id=\"people\"]/div/div"));
        for (WebElement elemento: elementByXpath) {
            System.out.println( elemento.getText());
        }

        WebElement title = webDriver.findElement( By.xpath("//*[@id=\"people\"]/div/div/div[3]/div/h3"));
        System.out.println(title.getText());

    }

}
