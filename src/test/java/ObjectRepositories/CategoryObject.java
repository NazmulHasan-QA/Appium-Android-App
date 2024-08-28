package ObjectRepositories;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class CategoryObject {
    public static By nasheedCategory = AppiumBy.androidUIAutomator("new UiSelector().description(\"Nasheed\n" +
            "Tab 3 of 5\")");
    public static By tilawatCategory = AppiumBy.androidUIAutomator("new UiSelector().description(\"Telawat\n" + "Tab 4 of 5\")");
    public static By tilawatContent = AppiumBy.androidUIAutomator("new UiSelector().description(\"Shamsul Haque\")");
    public static By suraMulk = AppiumBy.androidUIAutomator("new UiSelector().className(\"android.view.View\").instance(11)");
    public static By playBackSura = By.xpath("//android.view.View[contains(@content-desc, 'SURAT YA-SIN')]");
    public static By playBackSuraYasin = By.xpath("//android.view.View[contains(@content-desc, 'SURAT YA-SIN')]");
    public static By tuneHutChanel =By.xpath("//android.widget.HorizontalScrollView/android.view.View[4]");
    public static By videos = By.xpath("//android.view.View[contains(@content-desc, 'Videos')]");
    public static By lectureCategory = AppiumBy.androidUIAutomator("new UiSelector().description(\"Lecture\n" +
            "Tab 2 of 5\")");
    public static By lectureChannel = By.xpath("//android.widget.HorizontalScrollView/android.view.View[2]");
    public static By professor = AppiumBy.androidUIAutomator("new UiSelector().className(\"android.view.View\").instance(14)");
    public static By otherCategory=AppiumBy.androidUIAutomator("new UiSelector().description(\"Others\n" +
            "Tab 5 of 5\")");
    public static By otherChannel=By.xpath("//android.widget.HorizontalScrollView/android.view.View[2]");
    public static By otherContent=By.xpath("//android.view.View[contains(@content-desc, 'ইউনিভার্সিটিগুলো অসাম্প্রদায়িক') and contains(@content-desc, 'Muhammad Rafiuzzaman')]");
}