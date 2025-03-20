package tests;

import io.appium.java_client.AppiumDriver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;
import pages.AccountsPage;

import java.io.FileInputStream;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

public class BaseTest {

    AppiumDriver<MobileElement> driver;

    protected static ExtentSparkReporter spark;
    protected static ExtentReports extent;
    String projectPath = System.getProperty("user.dir");

    @BeforeSuite
    public void ReportSetup(){
        spark   = new ExtentSparkReporter("MonefyTestresultReport.html");
        extent = new ExtentReports();
        extent.attachReporter(spark);

    }

    @BeforeTest
    public void androidSetup() throws MalformedURLException {

            try {

                DesiredCapabilities caps = new DesiredCapabilities();
                Properties prop = new Properties();
                InputStream inputStream = new FileInputStream(projectPath+"/src/test/java//device.properties");
                prop.load(inputStream);
               // String app = prop.getProperty("app");
                caps.setCapability(MobileCapabilityType.PLATFORM_NAME, prop.getProperty("platformName"));
                caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, prop.getProperty("platformVersion"));
                caps.setCapability(MobileCapabilityType.DEVICE_NAME,prop.getProperty("deviceName"));
                caps.setCapability(MobileCapabilityType.UDID, prop.getProperty("deviceID"));
                caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
                caps.setCapability("appActivity",prop.getProperty("appActivity"));
                caps.setCapability("appPackage",prop.getProperty("appPackage"));
                caps.setCapability("app",projectPath+"/src/test/resources/apps/monefy-1-18-0.apk");
                caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
                caps.setCapability(MobileCapabilityType.NO_RESET, true);

                URL url = new URL("http://127.0.0.1:4723");
                driver  = new AppiumDriver<MobileElement>(url,caps);

        } catch (Exception e) {

            System.out.println("exception is "+e.getCause());
            System.out.println("message is "+e.getMessage());
            throw new RuntimeException("Failed to initialize Appium driver");

        }
         //   AccountsPage account = new AccountsPage(driver);
    }


    @AfterTest
    public void tearDown() {
        if(null!=driver)
        {
            driver.quit();
        };
    }

    @AfterSuite
    public void ReportTearDown(){
        extent.flush();
    }



}
