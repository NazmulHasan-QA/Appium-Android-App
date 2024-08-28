package Test;

import Page.SearchField;
import org.testng.annotations.Test;

public class TC004SearchFunctionalityTest extends Base{
    SearchField searchObj=new SearchField();
    @Test(priority = 1)
    public void searchByTitleTest()
    {
        searchObj.verifySearchByTitle(driver);
    }
    @Test(priority = 2)
    public void searchByCategoryTest()
    {
        searchObj.VerifySearchByCategory(driver);
    }
    @Test(priority = 3)
    public void searchBySpecialCharacterTest()
    {
        searchObj.verifySearchBySpecialCharacter(driver);
    }
}
