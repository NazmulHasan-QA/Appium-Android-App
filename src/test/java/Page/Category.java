package Page;

import Utils.ReusableMethods;
import io.appium.java_client.AppiumDriver;

import static ObjectRepositories.CategoryObject.nasheedCategory;
import static ObjectRepositories.CategoryObject.nasheedContent;
import static org.testng.Assert.assertTrue;

public class Category {
    public void verifyNasheedContentCategory(AppiumDriver driver) {
        System.out.println("Nazmul Hasan");
        assertTrue(ReusableMethods.ButtonEnableOrNot(nasheedCategory, driver), "Nasheed is not Enable");
        ReusableMethods.waitUntilPerformClickAction(nasheedCategory, driver);
        assertTrue(ReusableMethods.waitUntilPerformIsDisplayAction(nasheedContent,driver),"Its not a nasheed category");

    }
}
