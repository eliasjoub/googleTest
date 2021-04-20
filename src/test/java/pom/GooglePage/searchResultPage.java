package pom.GooglePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pom.BaseWebPage;

public class searchResultPage extends BaseWebPage {

    @FindBy(xpath = "(//h3[@class='LC20lb DKV0Md'])[1]")
    private WebElement firstTitleXpath;


    public void waitForLoad() {
        waitForElementToAppear(firstTitleXpath);
        PageFactory.initElements(webDriver, this);
    }

    public void validateFirstTitleValue(String expectedVal) {
        System.out.println("get first  Title" );
        String actualTitle = firstTitleXpath.getText();
        System.out.println("expected first title result is : " + expectedVal + " ,actual result is : " + actualTitle);
        Assert.assertTrue(actualTitle.contains(expectedVal), "first title result is not contains expected result , expected result : " + expectedVal + " ,actual result : " + actualTitle);
    }

}
