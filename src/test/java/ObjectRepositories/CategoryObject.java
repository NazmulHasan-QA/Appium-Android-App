package ObjectRepositories;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class CategoryObject {
    public static By nasheedCategory= AppiumBy.androidUIAutomator("new UiSelector().description(\"Nasheed\n" +
            "Tab 3 of 5\")");
    public static By nasheedContent=AppiumBy.androidUIAutomator("new UiSelector().description(\"Tune Hut\")");
}
