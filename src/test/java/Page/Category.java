package Page;

import Utils.ReusableMethods;
import io.appium.java_client.AppiumDriver;

import static ObjectRepositories.CategoryObject.*;
import static org.testng.Assert.assertTrue;

public class Category {
    public void verifyNasheedContentCategory(AppiumDriver driver) {
        assertTrue(ReusableMethods.ButtonEnableOrNot(nasheedCategory, driver), "Nasheed is not Enable");
        ReusableMethods.waitUntilPerformClickAction(nasheedCategory, driver);
        assertTrue(ReusableMethods.waitUntilPerformIsDisplayAction(nasheedContent,driver),"Its not a nasheed category");

    }
    public void verifyTilawatContentCategory(AppiumDriver driver)
    {
        assertTrue(ReusableMethods.ButtonEnableOrNot(tilawatCategory,driver),"Tilawat is not Enable");
        ReusableMethods.click(tilawatCategory,driver);
        ReusableMethods.waitForElementVisibility(tilawatContent,driver);
        assertTrue(ReusableMethods.verifyElementsPresent(tilawatContent,driver),"It not tilawat category");
        ReusableMethods.scrollIntoElementAndClick(suraMulk,driver);
        ReusableMethods.waitForElementVisibility(playBackSura,driver);
        ReusableMethods.click(playBackSura,driver);
        assertTrue(ReusableMethods.getTextFromMobileElements(playBackSuraYasin,driver).contains("SURAT YA-SIN"),"It not a sura");

    }
}
