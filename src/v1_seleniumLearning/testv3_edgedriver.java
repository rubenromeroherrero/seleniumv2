package v1_seleniumLearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class testv3_edgedriver {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "C:\\webrivers\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver();
        driver.get("https://es.wikipedia.org");
    }
}
