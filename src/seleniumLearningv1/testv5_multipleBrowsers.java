package seleniumLearningv1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testv5_multipleBrowsers {
    public static void main(String[] args) {
        //System.setProperty("webdriver.chrome.driver", "C:\\webrivers\\chromedriver.exe");
        //System.setProperty("webdriver.edge.driver", "C:\\webrivers\\msedgedriver.exe");
        //System.setProperty("webdriver.gecko.driver", "C:\\webrivers\\geckodriver.exe");

        WebDriver dChrome = new ChromeDriver();
        WebDriver dFirefox = new FirefoxDriver();
        WebDriver dEdge = new EdgeDriver();


        dChrome.get("https://es.wikipedia.org");
        dFirefox.get("https://es.wikipedia.org");
        dEdge.get("https://es.wikipedia.org");
    }
}
