package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.AccountsPage;
import pages.WizardPage;

import java.net.MalformedURLException;

public class AccountTest extends BaseTest {


    private AccountsPage account;

    @BeforeClass
    public void setUp() {
        account = new AccountsPage(driver);
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
