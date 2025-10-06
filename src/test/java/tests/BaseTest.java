package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.LoginPage;

public class BaseTest {
    LoginPage loginPage;

    @BeforeMethod
    public void setUp() {
        Configuration.browser = "chrome";
        Configuration.headless = true;
        Configuration.timeout = 30000;
        Configuration.baseUrl = "https://skyrexio.com/";
        Configuration.browserSize = "1920x1080";
        loginPage = new LoginPage();
    }

    @AfterMethod
    public void closeWind() {
        WebDriverRunner.clearBrowserCache();
        Selenide.closeWebDriver();
    }
}