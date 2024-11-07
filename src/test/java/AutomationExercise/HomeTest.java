package AutomationExercise;

import AutomationExercise.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTest extends BaseTest{
    HomePage homePage = HomePage.getInstance(driver);

    @Test
    public void verifyMenuOptions_Home(){
        String Actual = homePage.getHomeMenuText();
        String Expected = "Home";
        Assert.assertEquals(Actual,Expected);
    }
}
