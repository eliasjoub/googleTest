package pom.GooglePage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pom.BaseWebPage;

public class HomePage extends BaseWebPage {

    @FindBy(xpath = "//input[@type='text']")
    private WebElement searchTextBox;

    @FindBy(xpath = "(//input[@type='submit' and contains(@value,'Google')])[1]")
    private WebElement searchButton;

    String searchTextBoxElementXpath = "//*[@id='twotabsearchtextbox']";

    public void waitForLoad() {
        waitForElementToAppear(searchTextBox);
        PageFactory.initElements(webDriver, this);
    }

    public void setSearchTextBox(String searchVal) {
        System.out.println("set search textBox to : " + searchVal);
        searchTextBox.sendKeys(searchVal);
        searchTextBox.sendKeys(Keys.ENTER);

    }
}
