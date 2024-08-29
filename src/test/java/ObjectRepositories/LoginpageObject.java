package ObjectRepositories;

import Utils.ReusableMethods;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Test.Base.driver;


public class LoginpageObject {
    public static By permissionKey= AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.android.permissioncontroller:id/permission_allow_foreground_only_button\")");
    public static By allowButton=AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.android.permissioncontroller:id/permission_deny_button\")");
    public static By threeLineButton=AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(0)");
    public static By signIn=AppiumBy.androidUIAutomator("new UiSelector().description(\"Sign In\")");
    public static By continueWithGoogle=AppiumBy.androidUIAutomator("new UiSelector().description(\"Continue with Google\")");
    public static By continueWithEmail=AppiumBy.androidUIAutomator("new UiSelector().description(\"Continue with Email\")");
    public static By continueWithAnotherWay=AppiumBy.androidUIAutomator("new UiSelector().description(\"Continue another way\")");
    public static By emailField=AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\")");
    public static By continueButton=AppiumBy.androidUIAutomator("new UiSelector().description(\"Continue\")");
    public static By otpInputtingField=AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(0)");
    public static By alertMessage=AppiumBy.androidUIAutomator("new UiSelector().description(\"OTP doesnt matched\")");
    public static By backButton=AppiumBy.androidUIAutomator("new UiSelector().className(\"android.view.View\").instance(5)");
    public static By loginWithMobile=AppiumBy.androidUIAutomator("new UiSelector().description(\"Log in with Mobile\")");
    public static By phoneField=AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\")");
    public static By confirmationMessage=AppiumBy.androidUIAutomator("new UiSelector().description(\"OTP has been sent to your phone. Please check!\")");


    //Data
    public static String mailId=ReusableMethods.generateRandomGmail();
    public static String otp="4444";
    public static String invalidPhone="05284876t6464";
}
