package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class HomePage {

    AppiumDriver<MobileElement> driver;
        public HomePage(AppiumDriver<MobileElement> driver) {
       //     super(driver);
            this.driver = driver;
    }

    private By addIncomeBtn = By.id("com.monefy.app.lite:id/income_button_title");
    private By amountText = By.id("com.monefy.app.lite:id/amount_text");
    private By selectCategoryBtn = By.id("com.monefy.app.lite:id/keyboard_action_button");
    private By selectDepositBtn = By.xpath("//android.widget.TextView[@resource-id=\"com.monefy.app.lite:id/textCategoryName\" and @text=\"Deposits\"]");
    private By depositTaost = By.id(" com.monefy.app.lite:id/snackbar_text");
  //  private By selectDepositBtn = By.id("com.monefy.app.lite:id/keyboard_action_button");




    public void clickIncomeBtn() {
        MobileElement incomeBtn = driver.findElement(addIncomeBtn);
        Assert.assertTrue(incomeBtn.isDisplayed());
        Assert.assertEquals(incomeBtn.getText(),"INCOME");
        incomeBtn.click();
    }

    private By num5 = By.id("com.monefy.app.lite:id/buttonKeyboard5");
    private By num0 = By.id("com.monefy.app.lite:id/buttonKeyboard0");

    public void enterAmount(){
        WebDriverWait wait=new WebDriverWait(driver,10);
        MobileElement n5 = driver.findElement(num5);
        wait.until(ExpectedConditions.visibilityOf(n5));
        n5.click();
        MobileElement n0 = driver.findElement(num0);
        n0.click();
        n0.click();

    }

    public void chooseCategory(){
        MobileElement SelectCatgry = driver.findElement(selectCategoryBtn);
        SelectCatgry.click();
    }

    public void selectDeposit(){
        MobileElement Sdeposit = driver.findElement(selectDepositBtn);
        Sdeposit.click();
    }


    public void verifyBalance(){
        WebDriverWait wait=new WebDriverWait(driver,20);
        MobileElement Sdeposit = driver.findElement(depositTaost);
        wait.until(ExpectedConditions.visibilityOf(Sdeposit));
        Assert.assertTrue(Sdeposit.isDisplayed());
        Assert.assertEquals(Sdeposit.getText(),"Deposits: $500.00 added");


    }

}
