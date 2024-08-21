package Test;

import Page.Category;
import org.testng.annotations.Test;

public class TC002CategoryTest extends Base{
    Category categoryObj=new Category();
    @Test
    public void verifyNasheedContentCategoryTest()
    {
        categoryObj.verifyNasheedContentCategory(driver);

    }

}
