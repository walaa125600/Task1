import Pages.HomePage;
import Pages.SignIn;
import org.testng.annotations.Test;
import Pages.AddToCartScenario2;
public class Scenario2 extends test.TestBase {
    @Test(priority = 0)
    public void OpenTodayDealAndFilter() throws Exception {
        SignIn SignInObject=new SignIn(driver);
        HomePage HomeObject=new HomePage(driver);
        SignInObject.HoverToSignIn();
        SignInObject.SignIn();
        SignInObject.SignInToAmazonAccount();
        HomeObject.OpenTodayDeals();

    }
    @Test(priority = 1)
    public void ReachForthPage() throws Exception {
        HomePage HomeObject=new HomePage(driver);
        HomeObject.ReachToForthPage();

        //HomeObject.ReachToForthPageWithLoop();

    }

    @Test(priority = 2)
    public void SelectRandomItem() throws Exception {
        AddToCartScenario2 AddToCartObject=new AddToCartScenario2(driver);
        AddToCartObject.SelectRandomItem();
       AddToCartObject.AddToList();
        //HomeObject.ReachToForthPageWithLoop();

    }


}
