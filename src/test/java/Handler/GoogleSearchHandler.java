package Handler;

import pom.GooglePage.HomePage;
import pom.GooglePage.searchResultPage;

public class GoogleSearchHandler {
    searchResultPage searchedItemPage;
    HomePage homePage;

    public GoogleSearchHandler() {
        System.out.println("initialize home Page");
        homePage = new HomePage();
    }

    public void searchAndValidate(String searchItem,String expectedFirstResult) {
        homePage.setSearchTextBox(searchItem);
        searchedItemPage = new searchResultPage();
        searchedItemPage.validateFirstTitleValue(expectedFirstResult);
    }

}
