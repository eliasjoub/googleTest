package test;

import Handler.GoogleSearchHandler;
import org.testng.annotations.Test;

import java.util.List;

public class GoogleTest extends BaseWebTest {


    @Test
    public void googleJavaTest() throws Exception {
        String searchItem = "Java";
        String expectedFirstResult = "Java";
        GoogleSearchHandler googleHandler = new GoogleSearchHandler();
        googleHandler.searchAndValidate(searchItem,expectedFirstResult);
    }

}
