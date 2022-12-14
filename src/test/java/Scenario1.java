import Pages.AddToList;
import Pages.HomePage;
import Pages.Options;
import Pages.SignIn;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Scenario1 extends test.TestBase {


    @Test(priority = 2)
    public void TypeInSearchBar() throws Exception {
        HomePage HomeObject=new HomePage(driver);
        HomeObject.SearchForCars();

    }
    @Test(priority = 3)
    public void SelectFirstOption() throws Exception {
        Options OptionObject =new Options(driver);
        OptionObject.SelectFirstOption();

    }
    @Test(priority = 4)
    public void AddToList() throws Exception {
        AddToList AddToListObject =new AddToList(driver);
        AddToListObject.AddTheSelectedItemToList();

        Assert.assertEquals(new AddToList(driver).getNameInViewListPage(),new AddToList(driver).getNameInDetailsPage());
        Assert.assertEquals(new AddToList(driver).getNameInProductDetailsPage(),new AddToList(driver).getNameInDetailsPage());

    }
    @Test(priority = 1)
    public void SignIn() throws Exception {
        SignIn SignInObject =new SignIn(driver);
        SignInObject.HoverToSignIn();
        SignInObject.Sign_In();
        SignInObject.SignInToAmazonAccount();

    }

}
