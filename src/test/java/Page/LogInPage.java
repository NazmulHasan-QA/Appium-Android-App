package Page;

import Utils.ReusableMethods;
import io.appium.java_client.AppiumDriver;

import static ObjectRepositories.LoginpageObject.*;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class LogInPage {
    public void loginElementVerify(AppiumDriver driver)
    {
        ReusableMethods.waitForElementVisibility(threeLineButton,driver);
        ReusableMethods.click(threeLineButton,driver);
        ReusableMethods.scrollIntoElementAndClick(signIn,driver);
        assertTrue(ReusableMethods.waitUntilPerformIsDisplayAction(continueWithGoogle,driver),"continueWithGoogle is not present");
        assertTrue(ReusableMethods.waitUntilPerformIsDisplayAction(continueWithEmail,driver),"continueWithEmail is not present");
        assertTrue(ReusableMethods.waitUntilPerformIsDisplayAction(continueWithAnotherWay,driver),"Create new scratch file from selection");


    }
    public void loginWthInvalidOtp(AppiumDriver driver)
    {
        ReusableMethods.click(continueWithEmail,driver);
        ReusableMethods.click(emailField,driver);
        ReusableMethods.waitUntilPerformDataSendAction(emailField,driver,mailId);
        ReusableMethods.click(continueButton,driver);
        ReusableMethods.waitUntilPerformDataSendAction(otpInputtingField,driver,otp);
        ReusableMethods.click(continueButton,driver);
        assertTrue(ReusableMethods.verifyElementsPresent(alertMessage,driver),"Login Successfully");

    }
    public void enterInvalidPhoneFormatForOtp(AppiumDriver driver)
    {
        ReusableMethods.click(backButton,driver);
        ReusableMethods.click(signIn,driver);
        ReusableMethods.click(continueWithAnotherWay,driver);
        ReusableMethods.click(loginWithMobile,driver);
        ReusableMethods.click(phoneField,driver);
        ReusableMethods.waitUntilPerformDataSendAction(phoneField,driver,invalidPhone);
        ReusableMethods.click(continueButton,driver);
        assertFalse(ReusableMethods.verifyElementsPresent(confirmationMessage,driver),"Otp send");

    }


}
