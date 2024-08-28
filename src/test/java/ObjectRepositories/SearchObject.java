package ObjectRepositories;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class SearchObject {
    public static By searchButton= AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(3)");
    public static By searchBox=AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\")");
    public static By searchIcon=AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(1)");
    public static By ImrahimAStory=By.xpath("//android.view.View[contains(@content-desc, 'ইব্রাহিম আঃ এর ঘটনা') and contains(@content-desc, 'Abu Tawha Tv')]");
    public static By storyTitle=By.xpath("//android.view.View[contains(@content-desc, 'ইব্রাহিম আঃ এর ঘটনা')]");
    public static By suraTelawat=By.xpath("//android.view.View[contains(@content-desc, 'সূরা আল কাহফ') and contains(@content-desc, 'Shamsul Haque')]");
    public static By searchResult=AppiumBy.androidUIAutomator("new UiSelector().description(\"Your search did not match any videos\")");


    //Data
    public static String title="ইব্রাহিম আঃ এর ঘটনা";
    public static String category="Telawat";
    public static String specialCharacter="#&%&@";
}
