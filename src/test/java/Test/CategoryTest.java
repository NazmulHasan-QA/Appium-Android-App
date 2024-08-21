package Test;

import Page.Category;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static Test.Base.driver;

public class CategoryTest extends Base{
    Category categoryObj=new Category();
    @Test
    public void verifyNasheedContentCategoryTest()
    {
        categoryObj.verifyNasheedContentCategory(driver);

    }

}
