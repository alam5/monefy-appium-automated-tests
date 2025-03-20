package tests;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.AccountPage;

public class AccountTest extends BaseTest {

    private AccountPage account;

    @BeforeClass
    public void setup(){
        account = new AccountPage(driver);
    }

    @Test
    public void createAccount(){
        ExtentTest test = extent.createTest("REGRESSION TESTS - TC02 - CREATE AN NEW ACCOUNT", "Check that adding income to the account is working as expected");
        test.log(Status.INFO, "Test Started");
       account.clickRightMenu();
        test.log(Status.PASS, "Right top menu button is clicked");

       account.clickAccountButton();
        test.log(Status.PASS, " Account Button is clicked");

       account.addCategory();
        test.log(Status.PASS, "Add Category button is clicked");

       account.enterName("New-acc-a");
        test.log(Status.PASS, "Category name is entered");

       account.addInitialAmount("450");
        test.log(Status.PASS, "Initial amount is entered");

       account.selectCategoryImage();
        test.log(Status.PASS, "AMEX Category image is selected");

       account.saveAccount();
        test.log(Status.PASS, "New Account is saved");

       account.verifyAccount();
        test.log(Status.PASS, "success message is displayed");

    }


}
