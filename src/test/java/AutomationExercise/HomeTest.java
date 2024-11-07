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

    @Test
    public void verifyMenuOptions_Products(){
        String Actual = homePage.getProductsMenuText();
        String Expected = "Products";
        Assert.assertEquals(Actual,Expected);
    }

    @Test
    public void verifyMenuOptions_Cart(){
        String Actual = homePage.getCartsMenuText();
        String Expected = "Cart";
        Assert.assertEquals(Actual,Expected);
    }

    @Test
    public void verifyMenuOptions_SignUpAndLogin(){
        String Actual = homePage.getSignUpAndLoginMenuText();
        String Expected = "Signup / Login";
        Assert.assertEquals(Actual,Expected);
    }

    @Test
    public void verifyMenuOptions_TestCases(){
        String Actual = homePage.getTestCasesMenuText();
        String Expected = "Test Cases";
        Assert.assertEquals(Actual,Expected);
    }

    @Test
    public void verifyMenuOptions_ApiTesting(){
        String Actual = homePage.getApiTestingMenuText();
        String Expected = "API Testing";
        Assert.assertEquals(Actual,Expected);
    }

    @Test
    public void verifyMenuOptions_VideoTutorials(){
        String Actual = homePage.getVideoTutorialsMenuText();
        String Expected = "Video Tutorials";
        Assert.assertEquals(Actual,Expected);
    }

    @Test
    public void verifyMenuOptions_ContactUs(){
        String Actual = homePage.getContactUsMenuText();
        String Expected = "Contact us";
        Assert.assertEquals(Actual,Expected);
    }

    @Test
    public void verifyThreeItemsInCarousel(){
        int actual = homePage.getCountOfCarouselElement();
        int expected = 3;
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void verifyThreeItemsInCategories(){
        int actual = homePage.getCountOfCategoriesElement();
        int expected = 3;
        Assert.assertEquals(actual,expected);
    }
}
