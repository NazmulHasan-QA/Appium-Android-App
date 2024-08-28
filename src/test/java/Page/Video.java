package Page;

import Utils.ReusableMethods;
import io.appium.java_client.AppiumDriver;

import static ObjectRepositories.CategoryObject.*;
import static ObjectRepositories.VideoObject.*;
import static org.testng.Assert.assertTrue;

public class Video {
    public void playAndPushAVideo(AppiumDriver driver) {
        ReusableMethods.waitUntilPerformClickAction(tilawatCategory, driver);
        ReusableMethods.waitUntilPerformClickAction(tilawatContent,driver);
        ReusableMethods.scrollIntoElementAndClick(suraMulk, driver);
        ReusableMethods.waitUntilPerformClickAction(playBackSura, driver);
        assertTrue(ReusableMethods.waitUntilPerformIsDisplayAction(videoPlaySign, driver), "Video is not playing");
        ReusableMethods.click(totalVideoWindow, driver);
        assertTrue(ReusableMethods.waitUntilPerformIsDisplayAction(videoPushSign, driver), "Video is Plying");

    }

    public void verifyVideoFastForwardAndBackWord(AppiumDriver driver) {
        assertTrue(ReusableMethods.ButtonEnableOrNot(fastForwardButton, driver), "FastForward is not working");
        assertTrue(ReusableMethods.ButtonEnableOrNot(backWardButton, driver), "Video backward is not working");
        ReusableMethods.click(totalVideoWindow, driver);
        ReusableMethods.click(fastForwardButton,driver);
        ReusableMethods.waitUntilPerformClickAction(backWardButton,driver);
    }
    public void verifyVideoResolutionOptions(AppiumDriver driver)
    {
        ReusableMethods.waitForElementVisibility(threeDotButton,driver);
        ReusableMethods.waitUntilPerformClickAction(videoQualityButton,driver);
        assertTrue(ReusableMethods.waitUntilPerformIsDisplayAction(videoQuality1,driver),"Video quality1 options is not present");
        assertTrue(ReusableMethods.waitUntilPerformIsDisplayAction(videoQuality2,driver),"Video quality2 options is not present");
        assertTrue(ReusableMethods.waitUntilPerformIsDisplayAction(videoQuality3,driver),"Video quality3 options is not present");
        assertTrue(ReusableMethods.waitUntilPerformIsDisplayAction(videoQuality4,driver),"Video quality4 options is not present");
        assertTrue(ReusableMethods.waitUntilPerformIsDisplayAction(videoQuality5,driver),"Video quality5 options is not present");
    }

}
