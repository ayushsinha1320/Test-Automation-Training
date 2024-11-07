package AutomationExercise.pages;

import AutomationExercise.shared.FindElements;
import org.openqa.selenium.*;
import java.util.*;

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

    public String getHomeMenuText(){
        WebElement homeMenuLocator = findElements.ByXPath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[1]/a");
        return homeMenuLocator.getText();
    }

    public String getProductsMenuText(){
        WebElement element = findElements.ByXPath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a");
        return element.getText().split(" ", 2)[1];
    }

    public String getCartsMenuText(){
        WebElement element = findElements.ByXPath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a");
        return element.getText();
    }

    public String getSignUpAndLoginMenuText(){
        WebElement element = findElements.ByXPath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a");
        return element.getText();
    }

    public String getTestCasesMenuText(){
        WebElement element = findElements.ByXPath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a");
        return element.getText();
    }

    public String getApiTestingMenuText(){
        WebElement element = findElements.ByXPath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[6]/a");
        return element.getText();
    }

    public String getVideoTutorialsMenuText(){
        WebElement element = findElements.ByXPath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[7]/a");
        return element.getText();
    }

    public String getContactUsMenuText(){
        WebElement element = findElements.ByXPath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[8]/a");
        return element.getText();
    }

    public int getCountOfCarouselElement(){
        List<WebElement> slides = driver.findElements(By.cssSelector(".carousel-indicators li"));
        return slides.size();
    }

    public int getCountOfCategoriesElement(){
        List<WebElement> categories = driver.findElements(By.cssSelector(".panel-group .panel.panel-default"));
        return categories.size();
    }


    public String homePage(){
        driver.get("https://automationexercise.com");
        return this.driver.getTitle();
    }
}
