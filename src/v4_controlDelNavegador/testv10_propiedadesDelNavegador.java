package v4_controlDelNavegador;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class testv10_propiedadesDelNavegador {

    public static void main(String[] args) {

        // 0- Definimos las propiedades de nuestro navegador
        ChromeOptions chromeOptions = new ChromeOptions();
        // 1- Posición del navegador [Incluimos diferentes argumentos de POSICION (x,y)]
        chromeOptions.addArguments("--window-position=500,50");
        // 2- Tamaño del navegador [[Incluimos diferentes argumentos de TAMAÑO (x,y)]
        chromeOptions.addArguments("--window-size=1000,900");

        // 3- Creamos el driver para controlar el navegador Chrome (inyectamos los valores)
        WebDriver webDriver = new ChromeDriver(chromeOptions);
        // 3.1- Utilizamos el método del driver que nos permite abrir el navegador con una url
        webDriver.get("https://www.wikipedia.org");

    }
}
