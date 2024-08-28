package Test;

import Page.Category;
import org.testng.annotations.Test;

public class TC002CategoryTest extends Base{
    Category categoryObj=new Category();
    @Test(priority = 1)
    public void verifyNasheedContentCategoryTest()
    {
        categoryObj.verifyNasheedContentCategory(driver);
    }
    @Test(priority = 2)
    public void verifyTilawatContentCategoryTest()
    {
        categoryObj.verifyTilawatContentCategory(driver);
    }
    @Test(priority =3)
    public void verifyLectureContentCategoryTest()
    {
        categoryObj.verifyLectureContentCategory(driver);
    }
    @Test(priority = 4)
    public void verifyOtherContentCategoryTest()
    {
        categoryObj.verifyOtherContentCategory(driver);
    }



}
