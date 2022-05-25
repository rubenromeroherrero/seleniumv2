package seleniumLearningv1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testv1 {
    public static void main (String[] args){
        System.setProperty("webdriver.gecko.driver", "C:\\webrivers\\geckodriver.exe");

        //Creamos variable de tipo WebDriver
        WebDriver driver = new FirefoxDriver();

    }
}
