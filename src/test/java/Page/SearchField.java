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
        ReusableMethods.click(searchButton,driver);
        ReusableMethods.click(searchBox,driver);
        ReusableMethods.sendData(searchBox,driver,title);
        ReusableMethods.click(searchIcon,driver);
        ReusableMethods.waitUntilPerformClickAction(ImrahimAStory,driver);
        assertTrue(ReusableMethods.getTextFromMobileElements(storyTitle,driver).contains("ইব্রাহিম আঃ এর ঘটনা"));
        driver.navigate().back();
    }
    public void VerifySearchByCategory(AppiumDriver driver)
    {
        ReusableMethods.click(searchBox,driver);
        ReusableMethods.Clear(searchBox,driver);
        ReusableMethods.sendData(searchBox,driver,category);
        ReusableMethods.click(searchIcon,driver);
       assertTrue(ReusableMethods.getTextFromMobileElements(suraTelawat,driver).contains("তেলাওয়াত"));
       ReusableMethods.click(searchBox,driver);
       ReusableMethods.Clear(searchBox,driver);

    }
    public  void verifySearchBySpecialCharacter(AppiumDriver driver)
    {
        ReusableMethods.sendData(searchBox,driver,specialCharacter);
        ReusableMethods.click(searchIcon,driver);
        assertTrue(ReusableMethods.waitUntilPerformIsDisplayAction(searchResult,driver),"Video found");
    }
}
