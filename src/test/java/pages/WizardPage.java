package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class WizardPage {

    AppiumDriver<MobileElement> driver;

    public WizardPage(AppiumDriver<MobileElement> driver) {
        this.driver = driver;

    }

    private By getsstartedBtn = By.xpath("//android.widget.Button[@resource-id=\"com.monefy.app.lite:id/buttonContinue\"]");
    public void wizardStep1(){
        MobileElement getStartedButton = driver.findElement(getsstartedBtn);
        Assert.assertTrue(getStartedButton.isDisplayed());
        Assert.assertEquals(getStartedButton.getText(), "GET STARTED");
        getStartedButton.click();
    }

    private By amazingBtn = By.xpath("//android.widget.Button[@resource-id=\"com.monefy.app.lite:id/buttonContinue\"]");
    public void wizardStep2(){
        WebDriverWait wait=new WebDriverWait(driver,10);
        MobileElement BtnStep2 = driver.findElement(amazingBtn);
        wait.until(ExpectedConditions.visibilityOf(BtnStep2));
        Assert.assertTrue(BtnStep2.isDisplayed());
        Assert.assertEquals(BtnStep2.getText(), "AMAZING");
        BtnStep2.click();
    }

    private By ReadyBtn = By.xpath("//android.widget.Button[@resource-id=\"com.monefy.app.lite:id/buttonContinue\"]");
    public void wizardStep3(){
        WebDriverWait wait=new WebDriverWait(driver,10);
        MobileElement BtnStep3 = driver.findElement(ReadyBtn);
        wait.until(ExpectedConditions.visibilityOf(BtnStep3));
        Assert.assertTrue(BtnStep3.isDisplayed());
        BtnStep3.click();
    }


    private  By closeBtn = By.id("com.monefy.app.lite:id/buttonClose");
    public void closeWizard(){
        WebDriverWait wait=new WebDriverWait(driver,10);
        MobileElement closeScreen = driver.findElement(closeBtn);
        wait.until(ExpectedConditions.visibilityOf(closeScreen));
        closeScreen.click();
    }

}
