package Page;

import Utils.ReusableMethods;
import io.appium.java_client.AppiumDriver;

import static ObjectRepositories.CategoryObject.*;
import static org.testng.Assert.assertTrue;

public class Category {
    public void verifyNasheedContentCategory(AppiumDriver driver)
    {
        assertTrue(ReusableMethods.ButtonEnableOrNot(nasheedCategory, driver), "Nasheed is not Enable");
        ReusableMethods.click(nasheedCategory,driver);
        ReusableMethods.waitUntilPerformClickAction(tuneHutChanel,driver);
        assertTrue(ReusableMethods.waitUntilPerformIsDisplayAction(videos,driver),"Not a nisheed category");

    }

    public void verifyTilawatContentCategory(AppiumDriver driver) {
        assertTrue(ReusableMethods.ButtonEnableOrNot(tilawatCategory, driver), "Tilawat is not Enable");
        ReusableMethods.click(tilawatCategory, driver);
        ReusableMethods.waitForElementVisibility(tilawatContent,driver);
        assertTrue(ReusableMethods.verifyElementsPresent(tilawatContent, driver), "It not tilawat category");
        ReusableMethods.waitUntilPerformClickAction(suraMulk, driver);
        ReusableMethods.waitForElementVisibility(playBackSura, driver);
        ReusableMethods.waitUntilPerformIsDisplayAction(playBackSura, driver);
        assertTrue(ReusableMethods.getTextFromMobileElements(playBackSuraYasin, driver).contains("SURAT YA-SIN"), "It not a sura");

    }
    public void verifyLectureContentCategory(AppiumDriver driver)
    {
        ReusableMethods.click(lectureCategory,driver);
        ReusableMethods.waitUntilPerformClickAction(lectureChannel,driver);
        assertTrue(ReusableMethods.verifyElementsPresent(professor,driver),"Not lecture category");

    }
    public void verifyOtherContentCategory(AppiumDriver driver)
    {
        assertTrue(ReusableMethods.ButtonEnableOrNot(otherCategory,driver),"Button is not Enable");
        ReusableMethods.scrollIntoElementAndClick(otherCategory,driver);
        ReusableMethods.waitUntilPerformClickAction(otherChannel,driver);
        assertTrue(ReusableMethods.waitUntilPerformIsDisplayAction(otherContent,driver),"Not other category");
    }

}
