package v4_controlDelNavegador;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class testv11_minimizarMaximizar {
    public static void main(String[] args) {

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--window-position=500,50");
        chromeOptions.addArguments("--window-size=1000,900");

        WebDriver webDriver = new ChromeDriver(chromeOptions);
        webDriver.get("https://www.wikipedia.org");

        // 1- Controlar la ventana del navegador =>  MINIMIZAR
        webDriver.manage().window().minimize();
        // 2- Controlar la ventana del navegador =>  MAXIMIZAR
        webDriver.manage().window().maximize();

        // 3- Podemos definir una DIMENSION dada a partir de unos px
        // Con escribir solo los valores, te autocompleta el width y height
        Dimension dimension = new Dimension( 640, 600);
        webDriver.manage().window().setSize(dimension);

    }
}
