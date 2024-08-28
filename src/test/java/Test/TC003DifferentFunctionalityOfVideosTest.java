package Test;

import Page.Video;
import org.testng.annotations.Test;

import static Test.Base.driver;

public class TC003DifferentFunctionalityOfVideosTest extends Base{
    Video vobj=new Video();
    @Test(priority = 1)
    public void playAndPushAVideoTest()
    {
        vobj.playAndPushAVideo(driver);
    }
    @Test(priority = 2)
    public void verifyVideoFastForwardAndBackWordTest()
    {
        vobj.verifyVideoFastForwardAndBackWord(driver);
    }
    @Test(priority = 3)
    public void videoResolutionOptionsTest()
    {
        vobj.verifyVideoResolutionOptions(driver);
    }
}
