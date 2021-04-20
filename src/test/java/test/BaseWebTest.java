package test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class BaseWebTest {

    String urlToNavigate = "https://www.google.co.il";
    static WebDriver driver = null;

    @BeforeClass
    public void setUpOnce() throws Exception {
        // System Property for Chrome Driver
        System.out.println("open chrome : " + urlToNavigate);
        String chromePath = System.getProperty("user.dir") + "\\chromedriver.exe";
        // String chromePath = "C:\\Users\\elias.joubran.GALILSOFTWARE\\Desktop\\Automation-Framework\\AutomationFramework-master\\webTestss\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath);

        // Instantiate a ChromeDriver class.
        driver = new ChromeDriver();

        // Launch Website
        driver.navigate().to(urlToNavigate);

        //Maximize the browser
        driver.manage().window().maximize();

    }

    public static WebDriver getWebDriver() {
        return driver;
    }

    @AfterTest
    public void closeDriver() throws Exception {
        driver.close();
    }

}
