package Page;

import Utils.ReusableMethods;
import io.appium.java_client.AppiumDriver;

import java.time.Duration;

import static ObjectRepositories.SearchObject.*;
import static java.awt.SystemColor.text;
import static org.testng.Assert.assertTrue;

public class SearchField {
    public void verifySearchByTitle(AppiumDriver driver)
    {
        ReusableMethods.waitUntilPerformClickAction(searchButton,driver);
        ReusableMethods.waitUntilPerformClickAction(searchBox,driver);
        ReusableMethods.sendData(searchBox,driver,title);
        ReusableMethods.waitUntilPerformClickAction(searchIcon,driver);
        ReusableMethods.waitUntilPerformClickAction(ImrahimAStory,driver);
        assertTrue(ReusableMethods.getTextFromMobileElements(storyTitle,driver).contains("ইব্রাহিম আঃ এর ঘটনা"));
        driver.navigate().back();
    }
    public void VerifySearchByCategory(AppiumDriver driver)
    {
        ReusableMethods.waitUntilPerformClickAction(searchBox,driver);
        ReusableMethods.Clear(searchBox,driver);
        ReusableMethods.sendData(searchBox,driver,category);
        ReusableMethods.waitUntilPerformClickAction(searchIcon,driver);
       assertTrue(ReusableMethods.getTextFromMobileElements(suraTelawat,driver).contains("তেলাওয়াত"));
       ReusableMethods.waitUntilPerformClickAction(searchBox,driver);
       ReusableMethods.Clear(searchBox,driver);

    }
    public  void verifySearchBySpecialCharacter(AppiumDriver driver)
    {
        ReusableMethods.click(searchBox,driver);
        ReusableMethods.sendData(searchBox,driver,specialCharacter);
        ReusableMethods.waitUntilPerformClickAction(searchIcon,driver);
        assertTrue(ReusableMethods.waitUntilPerformIsDisplayAction(searchResult,driver),"Video found");
    }
}
