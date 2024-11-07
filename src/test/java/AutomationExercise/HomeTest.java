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
}
