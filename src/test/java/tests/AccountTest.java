package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;

import java.net.MalformedURLException;

public class AccountTest extends BaseTest {


    private HomePage account;

    @BeforeClass
    public void setUp() {
        account = new HomePage(driver);
    }

    @Test(priority = 2)
    public void addIncome() throws MalformedURLException {
        account.clickIncomeBtn();
        account.enterAmount();
        account.chooseCategory();
        account.selectDeposit();
        account.verifyBalance();
    }
}
