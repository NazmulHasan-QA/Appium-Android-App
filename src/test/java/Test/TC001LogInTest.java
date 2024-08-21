package Test;

import Page.LogInPage;
import org.testng.annotations.Test;

import static Test.Base.driver;

public class TC001LogInTest extends Base {
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
}
