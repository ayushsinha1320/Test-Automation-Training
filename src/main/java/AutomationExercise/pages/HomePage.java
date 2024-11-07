package AutomationExercise.pages;

import AutomationExercise.shared.FindElements;
import org.openqa.selenium.*;

public class HomePage {
    private static HomePage homePageInstance;
    private final FindElements findElements;
    private final WebDriver driver;

    private HomePage(WebDriver driver){
        findElements = FindElements.getInstance(driver);
        this.driver = driver;
    }

    public static synchronized HomePage getInstance(WebDriver driver) {
        if (homePageInstance == null) {
            homePageInstance = new HomePage(driver);
        }
        return homePageInstance;
    }

    public String homePage(){
        driver.get("https://automationexercise.com");
        return this.driver.getTitle();
    }
}
