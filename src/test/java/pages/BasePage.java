package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class BasePage {

    AppiumDriver<MobileElement> driver;
    public static final long wait_duration= 10;

    public BasePage( AppiumDriver<MobileElement> appiumDriver){}

    public void waitElementVisibility(MobileElement element)
    {
        if (driver == null) {
            throw new IllegalStateException("Driver is not initialized.");
        }
        WebDriverWait wait=new WebDriverWait(driver,wait_duration);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void btnClick(MobileElement element)
    {
        waitElementVisibility(element);
        element.click();
    }

    public void enterAmountVal(MobileElement element, String val)
    {
        waitElementVisibility(element);
        element.sendKeys(val);
    }

    public void verifyText(MobileElement element, String val){
        waitElementVisibility(element);
        Assert.assertEquals(element.getText(), val);
    }

}
