package ObjectRepositories;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class CategoryObject {
    public static By nasheedCategory= AppiumBy.androidUIAutomator("new UiSelector().description(\"Nasheed\n" +
            "Tab 3 of 5\")");
    public static By tilawatCategory=AppiumBy.androidUIAutomator("new UiSelector().description(\"Telawat\n" + "Tab 4 of 5\")");
    public static By tilawatContent=AppiumBy.androidUIAutomator("new UiSelector().description(\"Shamsul Haque\")");
    public static By suraMulk=AppiumBy.androidUIAutomator("new UiSelector().className(\"android.view.View\").instance(11)");
    public static By playBackSura=By.xpath("//android.view.View[contains(@content-desc, 'SURAT YA-SIN')]");
    public static By playBackSuraYasin=By.xpath("//android.view.View[contains(@content-desc, 'SURAT YA-SIN')]");
    public static By tuneHeartChanel=By.xpath("//android.widget.HorizontalScrollView/android.view.View[4]");
    public static By playBackGajol=By.xpath("//android.view.View[contains(@content-desc, 'রমজানের সুন্দর')]\n");
    public static By ramzenERGajol=By.xpath("//android.view.View[contains(@content-desc, 'Hamza Bin Azad')]\n");
}
