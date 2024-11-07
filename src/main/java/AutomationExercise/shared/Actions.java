package AutomationExercise.shared;

import org.openqa.selenium.*;

public class Actions {
    private static Actions actions = null;
    private final WebDriver driver;

    private Actions(WebDriver driver) {
        this.driver = driver;
    }

    public static Actions getActionsObject(WebDriver driver) {
        if (Actions.actions == null) {
            Actions.actions  = new Actions(driver);
        }
        return Actions.actions;
    }

    public void clickElement(WebElement element) {
        element.click();
    }

    public void type(WebElement element, String values) {
        element.clear();
        element.sendKeys(values);
    }
    public void enterKey(WebElement element){
        element.sendKeys(Keys.ENTER);
    }

    public void navigateTo(String url) {
        driver.get(url);
    }
}