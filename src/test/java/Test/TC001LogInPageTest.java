package Test;

import Page.LogInPage;
import org.testng.annotations.Test;

public class TC001LogInPageTest extends Base {
   LogInPage logObj=new LogInPage();
    @Test(priority = 1)
    public void openingApp()
    {
        logObj.loginElementVerify(driver);
    }
    @Test(priority = 2)
    public void logInWithEmailTest()
    {
        logObj.loginWthInvalidOtp(driver);
        //git remote add origin
    }
    @Test(priority = 3)
    public void enterInvalidPhoneFormatForOtpTest()
    {
        logObj.enterInvalidPhoneFormatForOtp(driver);
    }

}
