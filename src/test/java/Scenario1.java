import Pages.AddToList;
import Pages.HomePage;
import Pages.Options;
import Pages.SignIn;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Scenario1 extends test.TestBase {


    @Test(priority = 1)
    public void TypeInSearchBar() throws Exception {
        HomePage HomeObject=new HomePage(driver);
        HomeObject.SearchForCars();

    }
    @Test(priority = 2)
    public void SelectFirstOption() throws Exception {
        Options OptionObject =new Options(driver);
        OptionObject.SelectFirstOption();
        //OptionObject.selectRandomProduct();

    }
    @Test(priority = 3)
    public void AddToList() throws Exception {
        AddToList AddToListObject =new AddToList(driver);
        AddToListObject.AddTheSelectedItemToList();

        //Assert.assertTrue(new AddToList(driver).AddTheSelectedItemToList());
        Assert.assertEquals(new AddToList(driver).getNameInViewListPage(),new AddToList(driver).getNameInDetailsPage());
        System.out.println("10");
        Assert.assertEquals(new AddToList(driver).getNameInProductDetailsPage(),new AddToList(driver).getNameInDetailsPage());
        //System.out.println("20");

    }
    @Test(priority = 0)
    public void SignIn() throws Exception {
        SignIn SignInObject =new SignIn(driver);
        SignInObject.HoverToSignIn();
        SignInObject.SignIn();
        SignInObject.SignInToAmazonAccount();

    }

}
