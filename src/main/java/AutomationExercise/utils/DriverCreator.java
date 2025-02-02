package AutomationExercise.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverCreator {
    private static WebDriver driver = null;

    private DriverCreator(String browser) {
        switch (browser.toLowerCase()) {
            case "firefox"-> {
                WebDriverManager.firefoxdriver().setup();
                DriverCreator.driver = new FirefoxDriver();
            }
            case "safari"-> {
                WebDriverManager.safaridriver().setup();
                DriverCreator.driver = new SafariDriver();
            }
            case "chrome"-> {
                WebDriverManager.chromedriver().setup();
                DriverCreator.driver = new ChromeDriver();
            }
            default-> {
                System.out.println("Invalid browser");
                DriverCreator.driver = instantiateDriver("chrome");
            }
        }
    }

    public static WebDriver instantiateDriver(String browser){
        if(driver == null){
            new DriverCreator(browser);
        }
        return DriverCreator.driver;
    }
}
