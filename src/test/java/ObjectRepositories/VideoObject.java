package ObjectRepositories;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class VideoObject {
    public static By totalVideoWindow = AppiumBy.androidUIAutomator("new UiSelector().className(\"android.view.View\").instance(4)");
    public static By videoPlaySign = AppiumBy.androidUIAutomator("new UiSelector().className(\"android.view.View\").instance(7)");
    public static By videoPushSign = AppiumBy.androidUIAutomator("new UiSelector().className(\"android.view.View\").instance(7)");
    public static By fastForwardButton = AppiumBy.androidUIAutomator("new UiSelector().className(\"android.view.View\").instance(8)");
    public static By backWardButton = AppiumBy.androidUIAutomator("new UiSelector().className(\"android.view.View\").instance(6)");
    public static By threeDotButton=AppiumBy.androidUIAutomator("new UiSelector().className(\"android.view.View\").instance(5)");
    public static By videoQualityButton=AppiumBy.androidUIAutomator("new UiSelector().description(\"Quality\")");
    public static By videoQuality1=AppiumBy.androidUIAutomator("new UiSelector().description(\"352x240 ~184 KBit/s \")");
    public static By videoQuality2=AppiumBy.androidUIAutomator("new UiSelector().description(\"640x360 ~296 KBit/s \")");
    public static By videoQuality3=AppiumBy.androidUIAutomator("new UiSelector().description(\"842x480 ~496 KBit/s \")");
    public static By videoQuality4=AppiumBy.androidUIAutomator("new UiSelector().description(\"1280x720 ~656 KBit/s \")");
    public static By videoQuality5=AppiumBy.androidUIAutomator("new UiSelector().description(\"1920x1080 ~1 MBit/s \")");

}
