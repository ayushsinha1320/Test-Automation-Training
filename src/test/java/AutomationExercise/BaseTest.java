package AutomationExercise;

import AutomationExercise.shared.PageWaits;
import AutomationExercise.utils.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class BaseTest {
    WebDriver driver = DriverCreator.instantiateDriver(ConfigReader.getBrowser());
    PageWaits waits;

    @BeforeSuite
    public void setup(){
        driver.get(ConfigReader.getBaseURL());
        waits = PageWaits.getPageWaitsObject(driver);
    }

    @AfterSuite
    public void tearDown(){
        driver.close();
        driver.quit();
    }
}
