package Test;

import Utils.ReusableMethods;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

import static ObjectRepositories.LoginpageObject.allowButton;
import static ObjectRepositories.LoginpageObject.permissionKey;

public class Base {
    public static AppiumDriver  driver;

    @BeforeClass
    public void launchingMobileApp() throws MalformedURLException {
        try {
            UiAutomator2Options capabilities = new UiAutomator2Options();
            capabilities.setCapability("deviceName", "emulator-5554");
            capabilities.setCapability("udid", "emulator-5554");
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("platformVersion", "14");
            capabilities.setCapability("automationName", "UiAutomator2");
            capabilities.setCapability("appPackage", "com.mahfil.app");
            capabilities.setCapability("appActivity", "com.mahfil.app.MainActivity");

            URL url = new URL(" http://127.0.0.1:4723/");
            driver = new AndroidDriver(url, capabilities);
            ReusableMethods.waitUntilPerformClickAction(permissionKey,driver);

            ReusableMethods.waitUntilPerformClickAction(allowButton,driver);

            // Initialize any other resources needed

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
/*
    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

 */
}
